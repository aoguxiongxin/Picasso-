package com.test.mvp_rxjava_retrofit.app;

import android.app.Application;
import android.content.Context;

/**
 * 作者: 赵虔
 * 时间: 2017/10/8
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
