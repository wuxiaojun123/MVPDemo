package com.wxj.mvp.bean;

/**
 * Created by wuxiaojun on 2019/1/3.
 */

public class BaseBean<B> {

    private int error_code;

    private String reason;

    private B result;

    public B getResult() {
        return result;
    }

    public void setResult(B result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason == null ? "" : reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
