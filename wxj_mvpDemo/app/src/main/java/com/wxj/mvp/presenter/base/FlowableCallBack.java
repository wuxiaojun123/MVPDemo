package com.wxj.mvp.presenter.base;

import com.wxj.mvp.bean.BaseBean;

import io.reactivex.subscribers.ResourceSubscriber;

/**
 * Created by wuxiaojun on 2019/1/3.
 */

public class FlowableCallBack<B> extends ResourceSubscriber<BaseBean<B>> {

    private String tag;

    private HttpCallBack httpCallBack;

    public FlowableCallBack(String tag, HttpCallBack httpCallBack) {
        this.tag = tag;
        this.httpCallBack = httpCallBack;
    }

    @Override
    public void onNext(BaseBean<B> b) {
        if (httpCallBack != null) {
            httpCallBack.onSuccess(tag, b);
        }
    }

    @Override
    public void onError(Throwable t) {
        if (httpCallBack != null) {
            httpCallBack.onFailed(tag, t);
        }
    }

    @Override
    public void onComplete() {
        if (httpCallBack != null) {
            httpCallBack.onFinish(tag);
        }
    }

}
