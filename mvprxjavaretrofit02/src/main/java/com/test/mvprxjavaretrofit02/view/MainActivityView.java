package com.test.mvprxjavaretrofit02.view;

import com.test.mvprxjavaretrofit02.model.NewsBean;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public interface MainActivityView extends IView {
    void onRegisterSucced(NewsBean result);

    void onRegisterFild(String result);
}
