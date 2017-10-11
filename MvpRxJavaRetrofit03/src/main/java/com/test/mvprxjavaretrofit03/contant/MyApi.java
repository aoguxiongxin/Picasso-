package com.test.mvprxjavaretrofit03.contant;

import com.test.mvprxjavaretrofit03.model.bean.NewsBean;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public interface MyApi {
    //http://v.juhe.cn/toutiao/index?type=shishang&key=6dde6de11cc04328c65963b2951dc8b5
    @FormUrlEncoded
    @POST("index?")
    Observable<NewsBean> getData(@FieldMap HashMap<String, String> map);
}
