package com.simank.newdemogank.model;

import com.simank.newdemogank.Bean.GankBean;
import com.simank.newdemogank.net.ApiService;
import com.simank.newdemogank.net.RetrofitUtils;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * 主页面的model的继承
 * Created by sx on 2016/12/12.
 */
public class MainModelImpl implements MainModel {


    @Override
    public void getGankBean(final MainModelCallback callback) {
        ApiService apiService = RetrofitUtils.getApiService();
        Call<GankBean> call = apiService.getGankBean();

        call.enqueue(new Callback<GankBean>() {
            @Override
            public void onResponse(Response<GankBean> response, Retrofit retrofit) {
                callback.success(response.body());
            }

            @Override
            public void onFailure(Throwable throwable) {
                callback.error(throwable.toString());
            }
        });
    }
}
