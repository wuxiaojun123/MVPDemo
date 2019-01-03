package com.wxj.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.wxj.mvp.presenter.base.BasePresenter;
import com.wxj.mvp.presenter.base.IBaseView;
import com.wxj.mvp.view.LoadingDialog;

import butterknife.ButterKnife;

/**
 * Created by wuxiaojun on 2019/1/3.
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IBaseView {

    protected P mPresenter;

    private LoadingDialog mDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentResId());
        ButterKnife.bind(this);

        mDialog = new LoadingDialog(this);

        mPresenter = initPresenter();
    }

    public abstract int getContentResId();

    protected abstract P initPresenter();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.destroy();
        }
    }

    @Override
    public void showProgress() {
        if (mDialog != null && !mDialog.isShowing()) {
            mDialog.show();
        }
    }

    @Override
    public void hideProgress() {
        if (mDialog != null && mDialog.isShowing()) {
            mDialog.cancel();
        }
    }

}
