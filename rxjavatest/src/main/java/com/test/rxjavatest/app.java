package com.test.rxjavatest;

import android.app.Application;
import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 作者: 赵虔
 * 时间: 2017/10/8
 * 类作用:
 */

public class app extends Application {

    private static OkHttpClient build;

    @Override
    public void onCreate() {
        super.onCreate();
        build = new OkHttpClient.Builder().connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .addInterceptor(new MyInterceptor())
                .build();
    }

    public static OkHttpClient getOkHttp() {
        return build;
    }

    public class MyInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request().newBuilder().build();

            String url = request.url().url().toString();
            if (BuildConfig.DEBUG) Log.e("MyInterceptor", "请求的网址:" + url);

            Response execute = chain.proceed(request);
            return execute;
        }
    }
}
