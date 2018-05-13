package com.yueyue.mvp_old.presenter;

import com.yueyue.mvp_old.R;
import com.yueyue.mvp_old.modle.MainModel;
import com.yueyue.mvp_old.modle.MainModelBean;
import com.yueyue.mvp_old.utils.ToastUtil;
import com.yueyue.mvp_old.view.MainView;

/**
 * author : yueyue on 2018/5/13 14:41
 * desc   : View和Model的桥梁，它从Model层检索数据后，返回给View层
 */
public class MainPresenter implements Presenter<MainView>, IMainPresenter {

    private MainView mMainView;
    private MainModel mMainModel;

    public MainPresenter(MainView view) {
        attachView(view);
        mMainModel = new MainModel(this);
    }

    public void loadData() {
        mMainView.showProgress();
        mMainModel.loadData();
    }


    @Override
    public void loadDataSuccess(MainModelBean mainModelBean) {
        ToastUtil.showShort(R.string.load_success);
        mMainView.showData(mainModelBean);
        mMainView.hideProgress();
    }

    @Override
    public void loadDataFailure() {
        ToastUtil.showShort(R.string.load_failure);
        mMainView.hideProgress();
    }

    @Override
    public void attachView(MainView view) {
        this.mMainView = view;
    }

    @Override
    public void detachView() {
        this.mMainView = null;
    }
}
