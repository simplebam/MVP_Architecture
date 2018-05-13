package com.yueyue.mvp_old.view;

import com.yueyue.mvp_old.modle.MainModelBean;

/**
 * author : yueyue on 2018/5/13 14:13
 * desc   : 处理业务需要哪些方法
 */
public interface MainView {
    void showData(MainModelBean mainModelBean);
    void showProgress();
    void hideProgress();
}