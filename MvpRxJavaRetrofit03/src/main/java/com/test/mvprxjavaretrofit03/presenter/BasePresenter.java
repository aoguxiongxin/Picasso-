package com.test.mvprxjavaretrofit03.presenter;

import android.content.Context;

import com.test.mvprxjavaretrofit03.app.MyApplication;
import com.test.mvprxjavaretrofit03.view.IView;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public abstract class BasePresenter<T extends IView> {
    protected T view;

    public BasePresenter(T view) {
        this.view = view;
        init();
    }

    protected abstract void init();

    public Context getContext() {
        if (view != null & view.context() != null) {
            return view.context();
        }
        return MyApplication.getContext();
    }
}
