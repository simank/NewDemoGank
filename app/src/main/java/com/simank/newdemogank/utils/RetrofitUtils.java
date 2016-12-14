package com.simank.newdemogank.utils;

import com.simank.newdemogank.net.ApiService;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by sx on 2016/12/12.
 */
public class RetrofitUtils {

    private static Retrofit retrofit;

    private static ApiService apiService;

    public static ApiService getApiService(){
        if(apiService != null){
            return  apiService;
        }
        init();
        return getApiService();

    }

    public static  Retrofit getRetrofit(){
        if(retrofit!= null){
            return  retrofit;
        }
        return getRetrofit();
    }




    public static void init(){

        retrofit = new Retrofit.Builder().baseUrl(ApiService.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        apiService = retrofit.create(ApiService.class);



    }
}
