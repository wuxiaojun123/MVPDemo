package com.wxj.mvp.presenter.base;

import com.wxj.mvp.api.ApiService;
import com.wxj.mvp.api.RetrofitManager;
import com.wxj.mvp.bean.BaseBean;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by wuxiaojun on 2019/1/3.
 */

public class BasePresenter<V extends IBaseView, B> implements HttpCallBack<B> {

    protected V iView;

    private CompositeDisposable mCompositeDisposable;

    protected ApiService mApiService;

    protected BasePresenter(V view) {
        this.iView = view;
        mApiService = RetrofitManager.getInstance().getRetrofit().create(ApiService.class);
    }

    public <B> void requestHttp(String tag, Flowable<BaseBean<B>> flowable) {
        initCompositeDisposable();
        showProgress();
        FlowableCallBack<B> flowableCallBack = flowable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribeWith(new FlowableCallBack<B>(tag, this));

        mCompositeDisposable.add(flowableCallBack);
    }

    @Override
    public void onSuccess(String tag, BaseBean<B> o) {

    }

    @Override
    public void onFinish(String tag) {
        if (iView != null)
            iView.hideProgress();
    }

    @Override
    public void onFailed(String tag, Throwable throwable) {

    }

    private void showProgress() {
        if (iView != null) {
            iView.showProgress();
        }
    }

    private void initCompositeDisposable() {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
    }

    public void destroy() {
        unDispose();
        detachView();
    }

    private void detachView() {
        if (iView != null) {
            iView.hideProgress();
            iView = null;
        }
    }

    private void unDispose() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear();
        }
        mCompositeDisposable = null;
    }

}
