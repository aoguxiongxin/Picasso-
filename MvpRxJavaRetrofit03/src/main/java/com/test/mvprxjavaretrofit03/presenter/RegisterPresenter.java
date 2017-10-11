package com.test.mvprxjavaretrofit03.presenter;

import com.test.mvprxjavaretrofit03.model.RegisterModel;
import com.test.mvprxjavaretrofit03.model.bean.NewsBean;
import com.test.mvprxjavaretrofit03.view.RegisterView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public class RegisterPresenter extends BasePresenter<RegisterView> {

    private RegisterModel model;

    public RegisterPresenter(RegisterView view) {
        super(view);
    }

    @Override
    protected void init() {
        model = new RegisterModel();
    }

    public void getData() {
        Observable<NewsBean> data = model.getData();
        data.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<NewsBean>() {
                    @Override
                    public void accept(NewsBean newsBean) throws Exception {
                        view.onRegisterSucced(newsBean.getResult().getData().get(0).getThumbnail_pic_s());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        view.onRegisterFild(throwable.getMessage());
                    }
                });

    }
}
