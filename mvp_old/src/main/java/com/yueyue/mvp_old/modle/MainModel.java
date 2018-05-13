package com.yueyue.mvp_old.modle;

import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.yueyue.mvp_old.presenter.IMainPresenter;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

/**
 * author : yueyue on 2018/5/13 14:53
 * desc   : 业务具体处理，包括负责存储、检索、操纵数据等
 */
public class MainModel {
    private static final String TAG = MainModel.class.getSimpleName();

    private IMainPresenter mIMainPresenter;

    public MainModel(IMainPresenter iMainPresenter) {
        this.mIMainPresenter = iMainPresenter;
    }

    public void loadData() {
        AsyncHttpClient client = new AsyncHttpClient();
        String url = "http://www.weather.com.cn/adat/sk/101010100.html";
        client.get(url, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                //接口时效的话可以参考一下project/extra/weather.json
                MainModelBean modelBean = new MainModelBean();
                try {
                    JSONObject weatherinfo = response.getJSONObject("weatherinfo");
                    modelBean.setCity(weatherinfo.getString("city"));
                    modelBean.setWd(weatherinfo.getString("WD"));
                    modelBean.setWs(weatherinfo.getString("WS"));
                    modelBean.setTime(weatherinfo.getString("time"));
                } catch (JSONException e) {
                    Log.e(TAG, "loadData()的onSuccess: " + e.toString());
                    e.printStackTrace();
                }
                mIMainPresenter.loadDataSuccess(modelBean);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                super.onFailure(statusCode, headers, responseString, throwable);
                mIMainPresenter.loadDataFailure();
            }
        });

    }
}
