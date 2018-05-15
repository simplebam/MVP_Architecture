package com.yueyue.mvp_architecture.main;

import com.yueyue.mvp_architecture.other.BasePresenter;
import com.yueyue.mvp_architecture.retrofit.ApiCallback;

/**
 * author : yueyue on 2018/5/16 00:30
 * desc   :
 */
public class MainPresenter extends BasePresenter<MainView> {

    public MainPresenter(MainView view) {
        attachView(view);
    }

    public void loadDataByRetrofitRxjava(String cityId) {
        mvpView.showLoading();
        addSubscription(apiStores.loadDataByRetrofitRxJava(cityId),
                new ApiCallback<MainModel>() {
                    @Override
                    public void onSuccess(MainModel model) {
                        mvpView.getDataSuccess(model);
                    }

                    @Override
                    public void onFailure(String msg) {
                        mvpView.getDataFail(msg);
                    }


                    @Override
                    public void onFinish() {
                        mvpView.hideLoading();
                    }

                });
    }

}