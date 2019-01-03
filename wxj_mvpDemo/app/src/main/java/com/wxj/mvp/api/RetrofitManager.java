package com.wxj.mvp.api;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kenrich on 2018/11/7.
 */

public class RetrofitManager {

	private final String BASE_URL	= "http://v.juhe.cn/";

	private Retrofit		mRetrofit;

	private Retrofit		retrofit;

	static class RetrofitHolder {

		private static RetrofitManager instance = new RetrofitManager();
	}

	public static RetrofitManager getInstance() {
		return RetrofitHolder.instance;
	}

	private RetrofitManager(){}

	public Retrofit getRetrofit() {
		if (null == mRetrofit) {
			OkHttpClient.Builder builder = new OkHttpClient.Builder().addInterceptor(getHttpLoggingInterceptor());
			builder.readTimeout(15, TimeUnit.SECONDS);
			builder.writeTimeout(15, TimeUnit.SECONDS);
			builder.connectTimeout(15, TimeUnit.SECONDS);
			OkHttpClient client = builder.build();
			mRetrofit = new Retrofit.Builder().baseUrl(BASE_URL).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).client(client).build();

		}
		return mRetrofit;
	}

	private HttpLoggingInterceptor getHttpLoggingInterceptor() {
		HttpLoggingInterceptor mHttpLogginInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {

			@Override
            public void log(String message) {
				Log.d("retrofit", message);
			}
		});
		mHttpLogginInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
		return mHttpLogginInterceptor;
	}

	public Retrofit getRetrofit(OkHttpClient client) {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		mRetrofit = new Retrofit.Builder().client(client).baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
		return mRetrofit;
	}

}
