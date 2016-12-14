package com.simank.newdemogank.net;

import com.simank.newdemogank.Bean.GankBean;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by sx on 2016/12/12.
 */
public interface ApiService {

    //http://gank.io/api/data/Android/10/1
    public static  String BASE_URL = "http://gank.io/api/data/";

    @GET("Android/10/1")
    Call<GankBean> getGankBean();
}
