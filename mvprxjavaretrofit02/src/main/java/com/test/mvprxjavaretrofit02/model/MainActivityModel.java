package com.test.mvprxjavaretrofit02.model;

import com.test.mvprxjavaretrofit02.constant.RetrofitApi;
import com.test.mvprxjavaretrofit02.model.utils.RetrofitManager;

import java.util.HashMap;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public class MainActivityModel {
    public Observable<NewsBean> getData(String url) {
        //第一种是单例模式
//        return RetrofitManager.getDefault(url).create(RetrofitApi.class).getDataApi();
        //http://v.juhe.cn/toutiao/index?type=top&key=6dde6de11cc04328c65963b2951dc8b5
        HashMap<String, String> map = new HashMap<>();
        map.put("type", "top");
        map.put("key", "6dde6de11cc04328c65963b2951dc8b5");
        return new RetrofitManager(url).create(RetrofitApi.class).getDataApi(map);
    }
}
