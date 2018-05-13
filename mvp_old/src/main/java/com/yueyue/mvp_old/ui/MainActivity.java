package com.yueyue.mvp_old.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.yueyue.mvp_old.R;
import com.yueyue.mvp_old.modle.MainModelBean;
import com.yueyue.mvp_old.presenter.MainPresenter;
import com.yueyue.mvp_old.view.MainView;

/**
 * author : yueyue on 2018/5/13 14:13
 * desc   : 由Activity/Fragment实现View里方法，包含一个Presenter的引用
 */
public class MainActivity extends AppCompatActivity implements MainView {

    private ProgressBar mProgressBar;
    private TextView mTvtext;
    private Button mBtnLoad;
    private MainPresenter mMainPresenter;

    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }


    private void initView() {
        mBtnLoad = (Button) findViewById(R.id.btn_load);
        mTvtext = (TextView) findViewById(R.id.tv_text);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);

        mMainPresenter = new MainPresenter(this);

        initListener();
    }

    private void initListener() {
        mBtnLoad.setOnClickListener(v -> mMainPresenter.loadData());
    }

    private void initData() {
        mHandler = new Handler(Looper.getMainLooper());
        //制造延迟效果
        mHandler.postDelayed(() -> mMainPresenter.loadData(), 2000);
    }


    @Override
    protected void onDestroy() {
        //防止Handler内存泄漏
        if (mHandler != null) {
            mHandler.removeCallbacksAndMessages(null);
        }
        mMainPresenter.detachView();
        super.onDestroy();
    }

    @Override
    public void showData(MainModelBean mainModelBean) {
        String showData = getResources().getString(R.string.city, mainModelBean.getCity())
                + getResources().getString(R.string.wd, mainModelBean.getWd())
                + getResources().getString(R.string.ws, mainModelBean.getWs())
                + getResources().getString(R.string.time, mainModelBean.getTime());
        mTvtext.setText(showData);
    }

    @Override
    public void showProgress() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressBar.setVisibility(View.GONE);
    }
}
