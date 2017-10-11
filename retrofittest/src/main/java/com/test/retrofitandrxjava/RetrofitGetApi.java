package com.test.retrofitandrxjava;

import com.test.retrofitandrxjava.bean.DataBean;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * 作者: 赵虔
 * 时间: 2017/10/8
 * 类作用:
 */

public interface RetrofitGetApi {
    @GET("content/1/1")
    Call<DataBean> getJsonData();

    @GET(".")
    Call<ResponseBody> getStringData();

    @GET("{number}/{page}")
    Call<DataBean> getJsonData02(@Path("number") int number, @Path("page") int page);
}
