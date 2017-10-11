package com.test.mvprxjavaretrofit03.model;

import com.test.mvprxjavaretrofit03.contant.MyApi;
import com.test.mvprxjavaretrofit03.model.bean.NewsBean;
import com.test.mvprxjavaretrofit03.model.utils.RetrofitUtils;

import java.util.HashMap;

import io.reactivex.Observable;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public class RegisterModel {
    public Observable<NewsBean> getData() {
        //http://v.juhe.cn/toutiao/index?type=shishang&key=6dde6de11cc04328c65963b2951dc8b5
        HashMap<String, String> map = new HashMap<>();
        map.put("type", "shishang");
        map.put("key", "6dde6de11cc04328c65963b2951dc8b5");
        return RetrofitUtils.getDefaultRetrofit().create(MyApi.class).getData(map);
    }
}
