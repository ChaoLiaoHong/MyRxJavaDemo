package com.ldh.myrxjavademo.http;

import com.ldh.myrxjavademo.base.BaseEntity;
import com.ldh.myrxjavademo.model.ShopListEntity;
import com.ldh.myrxjavademo.model.User;
import com.ldh.myrxjavademo.model.WithdrawDepositRecordEntity;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by LiaoDuanHong  on 2017/10/25
 */

public interface RetrofitService {
    @FormUrlEncoded
    @POST("api/login")
    Observable<User> login(
            @Field("phone") String phone,
            @Field("password") String password
    );

    /**
     * 周边商铺搜索用HashMap来传递参数也可以用@Query一个一个的传
     *
     * @param map
     * @return
     */
    @FormUrlEncoded
    @POST("api/pro/proShop/getShopPoiGeoSearchByNear")
    Observable<BaseEntity<ShopListEntity>> getShopPoiGeoSearchByNear(@FieldMap HashMap<String, Object> map);

    /**
     * 注意get请求不需要加@FormUrlEncoded
     *
     * @param memberId
     * @param current
     * @param size
     * @return
     */
    @GET("api/pay/withdrawal/{memberId}")
    Observable<BaseEntity<WithdrawDepositRecordEntity>> getWithdrawalRecord(@Path("memberId") long memberId, @Query("current") int current, @Query("size") int size);
}