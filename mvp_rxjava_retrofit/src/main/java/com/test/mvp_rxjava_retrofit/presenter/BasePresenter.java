package com.test.mvp_rxjava_retrofit.presenter;

import android.content.Context;

import com.test.mvp_rxjava_retrofit.app.MyApplication;
import com.test.mvp_rxjava_retrofit.view.IView;

/**
 * 作者: 赵虔
 * 时间: 2017/10/8
 * 类作用:
 */

public abstract class BasePresenter<T extends IView> {
    protected T view;

    public BasePresenter(T view) {
        this.view = view;
        init();
    }

    public abstract void init();

    public Context getContext() {
        if (view != null && view.context() != null) {
            return view.context();
        }
        return MyApplication.getContext();
    }
}
