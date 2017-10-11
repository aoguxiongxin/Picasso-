package com.test.mvp_rxjava_retrofit.model.utils;

import com.test.mvp_rxjava_retrofit.constant.RetrofitApi;
import com.test.mvp_rxjava_retrofit.view.activity.MainActivity;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者: 赵虔
 * 时间: 2017/10/8
 * 类作用:
 */

public class RetrofitMannager {
    private Retrofit mRetrofit;

    //单例模式
    private static class RetrofitHolder {
        private static final RetrofitMannager instance = new RetrofitMannager(MainActivity.path);
    }


    //得到默认的RetrofitMannager
    public static RetrofitMannager getDefault() {
        return RetrofitHolder.instance;
    }

    public static RetrofitMannager getRetrofitMannager(String url) {
        return new RetrofitMannager(url);
    }

    private RetrofitMannager(String url) {
        Retrofit build = new Retrofit.Builder().baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        this.mRetrofit = build;
    }

    public <T> T create(Class<T> clazz) {
        return mRetrofit.create(clazz);
    }

}
