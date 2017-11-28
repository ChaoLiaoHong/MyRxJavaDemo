package com.ldh.myrxjavademo.util;


import android.text.TextUtils;
import android.util.Log;

import com.ldh.myrxjavademo.BuildConfig;


/**
 * Created by Administrator on 2017/3/16.
 */

public class LogUtil {

    //可以全局控制是否打印log日志
    private static boolean isPrintLog = BuildConfig.DEBUG;

    private static int LOG_MAXLENGTH = 2000;
    public static final boolean DEBUG = BuildConfig.DEBUG;

    public static void LogLong(String msg) {
        if (TextUtils.isEmpty(msg)) msg = "你传个空进来做啥？想报异常？";
        if (isPrintLog) {
            int strLength = msg.length();
            int start = 0;
            int end = LOG_MAXLENGTH;
            for (int i = 0; i < 100; i++) {
                if (strLength > end) {
                    Log.e("LogUtil -- " + i, msg.substring(start, end));
                    start = end;
                    end = end + LOG_MAXLENGTH;
                } else {
                    Log.e("LogUtil -- " + i, msg.substring(start, strLength));
                    break;
                }
            }
        }
    }

    public static void e(String tag, String msg) {
        if (DEBUG)
            Log.e(tag, msg);
    }

    public static void LogLong(String type, String msg) {
        if (TextUtils.isEmpty(msg)) msg = "你传个空进来做啥？想报异常？";
        if (isPrintLog) {
            int strLength = msg.length();
            int start = 0;
            int end = LOG_MAXLENGTH;
            for (int i = 0; i < 100; i++) {
                if (strLength > end) {
                    Log.e(type + " --- " + i, msg.substring(start, end));
                    start = end;
                    end = end + LOG_MAXLENGTH;
                } else {
                    Log.e(type + " --- " + i, msg.substring(start, strLength));
                    break;
                }
            }
        }
    }

}