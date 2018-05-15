package com.yueyue.mvp_architecture.main;

/**
 * author : yueyue on 2018/5/16 00:30
 * desc   :
 */
public interface MainView extends BaseView {

    void getDataSuccess(MainModel model);

    void getDataFail(String msg);

}