package com.test.mvprxjavaretrofit02.constant;

import com.test.mvprxjavaretrofit02.model.NewsBean;

import java.util.HashMap;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public interface RetrofitApi {
    //http://v.juhe.cn/toutiao/index?type=top&key=6dde6de11cc04328c65963b2951dc8b5
    @FormUrlEncoded
    @POST("index?")
    Observable<NewsBean> getDataApi(@FieldMap HashMap<String, String> map);
}
