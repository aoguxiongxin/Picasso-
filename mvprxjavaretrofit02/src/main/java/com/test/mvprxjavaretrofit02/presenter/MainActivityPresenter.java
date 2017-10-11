package com.test.mvprxjavaretrofit02.presenter;

import com.test.mvprxjavaretrofit02.model.MainActivityModel;
import com.test.mvprxjavaretrofit02.model.NewsBean;
import com.test.mvprxjavaretrofit02.view.MainActivityView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public class MainActivityPresenter extends BasePresenter<MainActivityView> {


    private MainActivityModel model;

    public MainActivityPresenter(MainActivityView view) {
        super(view);
    }

    @Override
    protected void init() {
        model = new MainActivityModel();
    }

    public void getData(String url) {
        Observable<NewsBean> observable = model.getData(url);
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<NewsBean>() {
                    @Override
                    public void accept(@NonNull NewsBean newsBean) throws Exception {
                        view.onRegisterSucced(newsBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        view.onRegisterFild(throwable.getMessage());
                    }
                });
    }
}
