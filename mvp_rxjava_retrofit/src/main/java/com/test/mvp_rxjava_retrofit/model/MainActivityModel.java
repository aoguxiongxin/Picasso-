package com.test.mvp_rxjava_retrofit.model;

import com.test.mvp_rxjava_retrofit.constant.RetrofitApi;
import com.test.mvp_rxjava_retrofit.model.utils.RetrofitMannager;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * 作者: 赵虔
 * 时间: 2017/10/8
 * 类作用:
 */

public class MainActivityModel {
    public Observable<ResponseBody> getData(String url) {
//        return RetrofitMannager.getDefault().create(RetrofitApi.class).getData();
        return RetrofitMannager.getRetrofitMannager(url).create(RetrofitApi.class).getData();
    }
}
