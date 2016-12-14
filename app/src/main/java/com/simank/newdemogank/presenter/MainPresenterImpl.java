package com.simank.newdemogank.presenter;

import com.simank.newdemogank.Bean.GankBean;
import com.simank.newdemogank.model.MainModel;
import com.simank.newdemogank.model.MainModelCallback;
import com.simank.newdemogank.model.MainModelImpl;
import com.simank.newdemogank.view.MainView;

/**
 * Created by sx on 2016/12/12.
 */
public class MainPresenterImpl implements MainPresenter {

    private MainModel model;

    private MainView view;

    public MainPresenterImpl(MainView view) {
        model = new MainModelImpl();
        this.view = view;
    }

    @Override
    public void getGankBean() {
        model = new MainModelImpl();
        model.getGankBean(new MainModelCallback() {
            @Override
            public void success(GankBean bean) {
                view.getMesSuccess(bean);
            }

            @Override
            public void error(String errorMes) {
                view.getMesError(errorMes);
            }
        });
    }
}
