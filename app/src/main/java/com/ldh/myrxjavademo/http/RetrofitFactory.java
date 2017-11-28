package com.ldh.myrxjavademo.http;

import android.media.session.MediaSession;
import android.text.TextUtils;

import com.ldh.myrxjavademo.MyApp;
import com.ldh.myrxjavademo.util.LogUtil;
import com.ldh.myrxjavademo.util.SharedPreferencesUtil;

import org.w3c.dom.Text;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by LiaoDuanHong  on 2017/10/25
 */

public class RetrofitFactory {
    private static final String BASE_URL = "http://120.26.235.96:9088/";
    private static String token;
    private static final long TIMEOUT = 30;
    // Retrofit是基于OkHttpClient的，可以创建一个OkHttpClient进行一些配置
    private static OkHttpClient httpClient = new OkHttpClient.Builder()
            // 添加通用的Header
            .addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request.Builder builder = chain.request().newBuilder();
                    // 替换为自己的token
                    builder.addHeader("token",getToken());
                    return chain.proceed(builder.build());
                }
            })
            /*
            这里可以添加一个HttpLoggingInterceptor，因为Retrofit封装好了从Http请求到解析，
            出了bug很难找出来问题，添加HttpLoggingInterceptor拦截器方便调试接口
             */
            .addInterceptor(new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                @Override
                public void log(String message) {
                    LogUtil.LogLong("信息", message);
                }
            }).setLevel(HttpLoggingInterceptor.Level.BASIC))
            .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT, TimeUnit.SECONDS)
            .build();

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            // 添加Gson转换器
            .addConverterFactory(GsonConverterFactory.create())
            // 添加Retrofit到RxJava的转换器
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(httpClient)
            .build();

    private static RetrofitService retrofitService = retrofit.create(RetrofitService.class);

    public static RetrofitService getInstance() {
        return retrofitService;
    }

    private static String getToken() {
        token = (String) SharedPreferencesUtil.get(MyApp.mContext, "token", "");
        LogUtil.LogLong("保存的token",token);
        if (TextUtils.isEmpty(token)) {
            return "";
        }
        return token;
    }
}
