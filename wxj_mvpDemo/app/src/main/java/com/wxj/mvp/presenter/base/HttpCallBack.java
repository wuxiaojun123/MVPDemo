package com.wxj.mvp.presenter.base;

import com.wxj.mvp.bean.BaseBean;

/**
 * Created by wuxiaojun on 2019/1/3.
 */

public  interface HttpCallBack<B> {

    void onSuccess(String tag, BaseBean<B> b);

    void onFinish(String tag);

    void onFailed(String tag, Throwable throwable);

}
