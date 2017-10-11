package com.test.mvp_rxjava_retrofit.presenter;

import com.test.mvp_rxjava_retrofit.model.MainActivityModel;
import com.test.mvp_rxjava_retrofit.view.RegisterView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * 作者: 赵虔
 * 时间: 2017/10/8
 * 类作用:
 */

public class MainActivityPresenter extends BasePresenter<RegisterView> {

    private MainActivityModel model;

    public MainActivityPresenter(RegisterView view) {
        super(view);
    }

    @Override
    public void init() {
        model = new MainActivityModel();
    }

    public void getData(String url) {
        Observable<ResponseBody> observable = model.getData(url);
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ResponseBody>() {
                    @Override
                    public void accept(@NonNull ResponseBody responseBody) throws Exception {
                        view.onRegisterSucced(responseBody.string());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        view.onRegisterFild(throwable.getMessage());
                    }
                });
    }
}
