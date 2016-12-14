package com.simank.newdemogank.view;

import com.simank.newdemogank.Bean.GankBean;

/**
 * Created by sx on 2016/12/12.
 */
public interface MainView {

    void getMesSuccess(GankBean bean);

    void getMesError(String errorMes);


}
