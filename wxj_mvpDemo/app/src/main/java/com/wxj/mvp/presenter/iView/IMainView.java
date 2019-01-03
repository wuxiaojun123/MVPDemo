package com.wxj.mvp.presenter.iView;

import com.wxj.mvp.bean.InfoBean;
import com.wxj.mvp.bean.WeacherBean;
import com.wxj.mvp.presenter.base.IBaseView;

/**
 * Created by wuxiaojun on 2019/1/3.
 */

public interface IMainView extends IBaseView {

    void loadInfoBeanSuccess(InfoBean infoBean);

    void loadWeacherBeanSuccess(WeacherBean weacherBean);

}
