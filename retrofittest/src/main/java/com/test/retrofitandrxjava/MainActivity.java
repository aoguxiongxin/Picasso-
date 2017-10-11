package com.test.retrofitandrxjava;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.test.retrofitandrxjava.bean.DataBean;
import com.test.retrofitandrxjava.bean.PostBean;
import com.test.retrofitandrxjava.bean.TestBean;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试返回值为String
        TestRetrofitString();
        //测试返回值为Gson串
//        Retrofit01();
        //测试Gson串,参数可变,类似上下拉刷新的时候使用
//          Retrofit02();
        //测试Post请求方式返回Gson串
//        TestPostRetrofit();
        //下载Apk文件
//        DownApp();
        //使用RxJava和Retrofit
      //  RxJavaAndRetrofit();
    }

    private void RxJavaAndRetrofit() {
        //http://api.jisuapi.com/news/get?channel=头条&appkey=cf2efa79d8df0ede
        Retrofit build = new Retrofit.Builder()
                .baseUrl("http://api.jisuapi.com/news/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        HashMap<String, String> map = new HashMap<>();
        map.put("channel", "头条");
        map.put("appkey", "cf2efa79d8df0ede");

        build.create(RetrofitPostApi.class).getApk(map)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TestBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull TestBean postBean) {
                        if (BuildConfig.DEBUG)
                            Log.e("MainActivity", postBean.getResult().getList().get(0).getTitle());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        if (BuildConfig.DEBUG)
                            Log.e("MainActivity", "错误:" + e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void DownApp() {
        //http://surl.qq.com/195D0D?qbsrc=51&asr=4286
        Retrofit build = new Retrofit.Builder()
                .addConverterFactory(ScalarsConverterFactory.create())
                .baseUrl("http://surl.qq.com/")//前面必须加 http://
                .build();
        HashMap<String, String> map = new HashMap<>();
        map.put("qbsrc", "51");
        map.put("asr", "4286");


        Call<ResponseBody> call = build.create(RetrofitPostApi.class).downApk(map);
        HttpUrl url = call.request().url();
        if (BuildConfig.DEBUG) Log.e("MainActivity", "访问的网址:" + url);

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    try {
                        InputStream is = response.body().byteStream();
                        FileOutputStream fo = new FileOutputStream(Environment.getExternalStorageDirectory().getPath() + "/腾讯新闻.apk");
                        byte[] b = new byte[2048];
                        while (true) {
                            int m = is.read(b);
                            if (m == -1)
                                break;
                            fo.write(b, 0, m);
                        }
                        is.close();
                        fo.flush();
                        fo.close();
                        if (BuildConfig.DEBUG) Log.e("MainActivity", "下载完成");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                if (BuildConfig.DEBUG) Log.e("MainActivity", "下载失败:" + t);
            }
        });

    }

    private void TestPostRetrofit() {
//        http://api.jisuapi.com/news/get?channel=头条&appkey=cf2efa79d8df0ede
        Retrofit build = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://api.jisuapi.com/news/")
                .build();
        build.create(RetrofitPostApi.class).postGetData("头条", "cf2efa79d8df0ede")
                .enqueue(new Callback<PostBean>() {
                    @Override
                    public void onResponse(Call<PostBean> call, Response<PostBean> response) {
                        if (response.isSuccessful()) {
                            PostBean body = response.body();
                            if (BuildConfig.DEBUG)
                                Log.e("MainActivity", "成功:" + body.getResult().getList().get(0).getTitle());
                        }
                    }

                    @Override
                    public void onFailure(Call<PostBean> call, Throwable t) {
                        if (BuildConfig.DEBUG)
                            Log.e("MainActivity", "错误" + t);
                    }
                });
    }

    private void Retrofit02() {
//        http://gank.io/api/history/content/1/1
        Retrofit build = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://gank.io/api/history/content/")
                .build();
        build.create(RetrofitGetApi.class).getJsonData02(1, 1).enqueue(new Callback<DataBean>() {
            @Override
            public void onResponse(Call<DataBean> call, Response<DataBean> response) {
                if (response.isSuccessful()) {
                    DataBean body = response.body();
                    if (BuildConfig.DEBUG)
                        Log.e("MainActivity", body.getResults().get(0).getTitle());
                }
            }

            @Override
            public void onFailure(Call<DataBean> call, Throwable t) {
                if (BuildConfig.DEBUG)
                    Log.e("MainActivity", "报错:" + t);
            }
        });
    }

    private void TestRetrofitString() {
        Retrofit build = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://www.baidu.com")
                .build();
        build.create(RetrofitGetApi.class).getStringData().enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    if (BuildConfig.DEBUG)
                        try {
                            Log.e("MainActivity", "成功:" + response.body().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                if (BuildConfig.DEBUG) Log.e("MainActivity", "错误:" + t);
            }
        });

    }

    private void Retrofit01() {
//        http://gank.io/api/history/content/1/1
        Retrofit build = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())//转换格式
                .baseUrl("http://gank.io/api/history/")//因为最后必须是以"/"结尾,并且在接口那里的@GET("")
                //内必须有参数,所以把网址url分开写了
                .build();
        Call<DataBean> call = build.create(RetrofitGetApi.class).getJsonData();
        call.enqueue(new Callback<DataBean>() {
            @Override
            public void onResponse(Call<DataBean> call, Response<DataBean> response) {
                if (response.isSuccessful()) {
                    DataBean body = response.body();
                    if (BuildConfig.DEBUG)
                        Log.e("MainActivity", body.getResults().get(0).getTitle());
                }
            }

            @Override
            public void onFailure(Call<DataBean> call, Throwable t) {
                if (BuildConfig.DEBUG)
                    Log.e("MainActivity", "报错:" + t);
            }
        });
    }
}
