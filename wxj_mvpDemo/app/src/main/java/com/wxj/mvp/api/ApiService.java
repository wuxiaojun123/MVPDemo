package com.wxj.mvp.api;

import com.wxj.mvp.bean.BaseBean;
import com.wxj.mvp.bean.InfoBean;
import com.wxj.mvp.bean.WeacherBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by wuxiaojun on 2019/1/3.
 */

public interface ApiService {

    @GET("toutiao/index")
    Flowable<BaseBean<InfoBean>> getInfo(@Query("type") String type, @Query("key") String key);

    @GET("weather/index")
    Flowable<BaseBean<WeacherBean>> getWeacherInfo(@Query("cityname") String cityname,@Query("key") String key);

}
