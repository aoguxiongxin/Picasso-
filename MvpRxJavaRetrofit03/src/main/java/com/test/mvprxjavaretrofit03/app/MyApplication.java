package com.test.mvprxjavaretrofit03.app;

import android.app.Application;
import android.content.Context;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
