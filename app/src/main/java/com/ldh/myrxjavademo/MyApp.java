package com.ldh.myrxjavademo;

import android.app.Application;
import android.content.Context;

/**
 * Created by LiaoDuanHong  on 2017/10/25
 */

public class MyApp extends Application {
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}
