package com.simank.newdemogank.model;

import com.simank.newdemogank.Bean.GankBean;

/**
 * Created by sx on 2016/12/12.
 */
public interface MainModelCallback {

    void success(GankBean bean);

    void error(String errorMes);
}
