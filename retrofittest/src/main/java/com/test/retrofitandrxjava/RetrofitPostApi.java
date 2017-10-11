package com.test.retrofitandrxjava;

import com.test.retrofitandrxjava.bean.DataBean;
import com.test.retrofitandrxjava.bean.PostBean;
import com.test.retrofitandrxjava.bean.TestBean;

import java.util.HashMap;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 作者: 赵虔
 * 时间: 2017/10/8
 * 类作用:
 */

public interface RetrofitPostApi {
    //http://api.jisuapi.com/news/get?channel=头条&appkey=cf2efa79d8df0ede
    @FormUrlEncoded
    @POST("get/")
    //  ?使用"/"代替
    Call<PostBean> postGetData(@Field("channel") String channel, @Field("appkey") String appkey);

    //下载一个apk的文件
    //http://surl.qq.com/195D0D?qbsrc=51&asr=4286
    @FormUrlEncoded
    @POST("195D0D?")
// ? 也可以不加
    Call<ResponseBody> downApk(@FieldMap HashMap<String, String> map);

    //使用RxJava和Retrofit请求数据
    //http://api.jisuapi.com/news/get?channel=头条&appkey=cf2efa79d8df0ede
    @FormUrlEncoded
    @POST("get/")
    Observable<TestBean> getApk(@FieldMap HashMap<String, String> map);
}
