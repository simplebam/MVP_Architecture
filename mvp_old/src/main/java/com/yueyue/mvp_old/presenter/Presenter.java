package com.yueyue.mvp_old.presenter;

/**
 * author : yueyue on 2018/5/13 14:48
 * desc   :
 */
public interface Presenter<V> {
    void attachView(V view);

    void detachView();
}