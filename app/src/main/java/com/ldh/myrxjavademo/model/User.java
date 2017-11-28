package com.ldh.myrxjavademo.model;

import com.google.gson.annotations.SerializedName;
import com.ldh.myrxjavademo.base.BaseEntity;

/**
 * Created by LiaoDuanHong  on 2017/10/25
 */

public class User extends BaseEntity {

    /**
     * expire : 31536000
     * token : e485509c-0ada-4582-99c0-ab5478c4bcbc
     * shopId : 0
     * memberId : 27151734274048
     */
    @SerializedName("expire")
    private int expire;
    @SerializedName("token")
    private String token;
    @SerializedName("shopId")
    private int shopId;
    @SerializedName("memberId")
    private long memberId;

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }
}
