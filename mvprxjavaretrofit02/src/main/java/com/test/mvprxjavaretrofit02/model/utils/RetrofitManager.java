package com.test.mvprxjavaretrofit02.model.utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public class RetrofitManager {
    private Retrofit mRetrofit;

    private static class RetrofitHolder {
        private static final RetrofitManager instance = new RetrofitManager("");
    }

    public RetrofitManager(String url) {
        Retrofit build = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        this.mRetrofit = build;
    }

    public static RetrofitManager getDefault(String url) {
        //第一种是单例模式
//        return RetrofitHolder.instance;
        return new RetrofitManager(url);
    }

    public <T> T create(Class<T> clazz) {
        return mRetrofit.create(clazz);
    }
}
