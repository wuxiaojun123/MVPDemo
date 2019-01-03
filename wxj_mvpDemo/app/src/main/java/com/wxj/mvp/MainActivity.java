package com.wxj.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.wxj.mvp.bean.InfoBean;
import com.wxj.mvp.bean.WeacherBean;
import com.wxj.mvp.presenter.MainPresenter;
import com.wxj.mvp.presenter.iView.IMainView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 项目有两个不足
 * 1.网络请求只能都写在ApiService这个类里，因为在BasePresenter里面创建的Retrofi实例是ApiService
 * 2.网络请求其实应该写到一个单独的类里面，这样才是真正的解耦，逻辑业务都应该写在p层
 */
public class MainActivity extends BaseActivity<MainPresenter> implements IMainView {

    @BindView(R.id.id_tv_content)
    TextView id_tv_content;

    @Override
    public int getContentResId() {
        return R.layout.activity_main;
    }

    @Override
    protected MainPresenter initPresenter() {
        return new MainPresenter(this);
    }


    @OnClick({R.id.id_btn_request_yule, R.id.id_btn_request_weacher})
    public void click(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.id_btn_request_yule:
                mPresenter.getInfoBeans();

                break;
            case R.id.id_btn_request_weacher:
                mPresenter.getWeacherBeans();

                break;
        }
    }


    @Override
    public void loadInfoBeanSuccess(InfoBean infoBean) {
        if (infoBean == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        List<InfoBean.ThumbnailBean> data = infoBean.getData();
        for (InfoBean.ThumbnailBean bean : data) {
            sb.append(bean.getAuthor_name()).append("\n");
        }
        id_tv_content.setText(sb.toString());
    }

    @Override
    public void loadWeacherBeanSuccess(WeacherBean weacherBean) {

        if (weacherBean == null) {
            return;
        }
        WeacherBean.Today today = weacherBean.getToday();
        StringBuilder sb = new StringBuilder();
        sb.append(today.getCity()).append(today.getWind()).append(today.getDressing_advice());

        id_tv_content.setText(sb.toString());
    }


}
