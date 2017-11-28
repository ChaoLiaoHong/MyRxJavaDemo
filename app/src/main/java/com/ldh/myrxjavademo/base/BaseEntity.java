package com.ldh.myrxjavademo.base;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LiaoDuanHong  on 2017/10/25
 */

public class BaseEntity<T> {
    private final int httpCode = 200;
    @SerializedName("code")
    private int code;
    @SerializedName("msg")
    private String msg;
    @SerializedName("data")
    private T data;
    @SerializedName("Page")
    private T Page;

    public boolean isSuccess() {
        return code == httpCode;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public T getPage() {
        return Page;
    }
}
