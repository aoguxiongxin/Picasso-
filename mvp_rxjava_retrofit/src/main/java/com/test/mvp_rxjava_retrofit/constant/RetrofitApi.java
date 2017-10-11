package com.test.mvp_rxjava_retrofit.constant;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;

/**
 * 作者: 赵虔
 * 时间: 2017/10/8
 * 类作用:
 */

public interface RetrofitApi {
    @GET(".")
    Observable<ResponseBody> getData();
}
