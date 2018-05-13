package com.yueyue.mvp_old.presenter;

import com.yueyue.mvp_old.modle.MainModelBean;

/**
 * author : yueyue on 2018/5/13 14:48
 * desc   : 此接口作用是连接Model
 */
public interface IMainPresenter {
    void loadDataSuccess(MainModelBean mainModelBean);

    void loadDataFailure();
}