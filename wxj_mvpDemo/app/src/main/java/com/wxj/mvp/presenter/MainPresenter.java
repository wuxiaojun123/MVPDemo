package com.wxj.mvp.presenter;

import android.util.Log;

import com.wxj.mvp.bean.BaseBean;
import com.wxj.mvp.bean.InfoBean;
import com.wxj.mvp.bean.WeacherBean;
import com.wxj.mvp.presenter.base.BasePresenter;
import com.wxj.mvp.presenter.iView.IMainView;

/**
 * Created by wuxiaojun on 2019/1/3.
 */

public class MainPresenter extends BasePresenter<IMainView, BaseBean> {

    public static final String TAG = "MainPresenter";

    public MainPresenter(IMainView view) {
        super(view);
    }

    public void getInfoBeans() {
        requestHttp("getInfoBeans", mApiService.getInfo("yule", "d687fc2c061e23ca2abae9d653eb089a"));
    }

    public void getWeacherBeans() {
        requestHttp("getWeacherBeans", mApiService.getWeacherInfo("北京", "08e039171e23350af52ed943ce8aaed7"));
    }

    @Override
    public void onSuccess(String tag, BaseBean o) {
        super.onSuccess(tag, o);

        if ("getInfoBeans".equals(tag)) {
            InfoBean infoBean = (InfoBean) o.getResult();
            Log.e(TAG, "返回结果是" + infoBean);
            iView.loadInfoBeanSuccess(infoBean);

        } else if ("getWeacherBeans".equals(tag)) {
            WeacherBean weacherBean = (WeacherBean) o.getResult();
            Log.e(TAG, "返回结果是" + weacherBean);

            iView.loadWeacherBeanSuccess(weacherBean);
        }

    }

    @Override
    public void onFailed(String tag, Throwable throwable) {
        super.onFailed(tag, throwable);
    }

}
