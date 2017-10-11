package com.test.mvprxjavaretrofit03.model.utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public class RetrofitUtils {
    private Retrofit mRetrofit;

    //单例模式
    private static class SingleHolder {
        //http://v.juhe.cn/toutiao/index?type=shishang&key=6dde6de11cc04328c65963b2951dc8b5
        private static final RetrofitUtils instance = new RetrofitUtils("http://v.juhe.cn/toutiao/");
    }

    public RetrofitUtils(String url) {
        Retrofit build = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        this.mRetrofit = build;
    }

    public static RetrofitUtils getDefaultRetrofit() {
        return SingleHolder.instance;
    }

    public <T> T create(Class<T> clazz) {
        return mRetrofit.create(clazz);
    }
}
