package com.ldh.myrxjavademo.util;

import android.text.TextUtils;
import android.widget.Toast;

import com.ldh.myrxjavademo.MyApp;


public class ToastUtil {
    public static Toast toast;

    public static void showToast(String msg) {
        if (TextUtils.isEmpty(msg) || TextUtils.equals("", msg)) {
            return;
        }
        if (toast == null) {
            toast = Toast.makeText(MyApp.mContext, msg, Toast.LENGTH_SHORT);
        } else {
            toast.setText(msg);
        }
        toast.show();
    }

    public static void showLongToast(String msg) {
        if (TextUtils.isEmpty(msg) || TextUtils.equals("", msg)) {
            return;
        }
        if (toast == null) {
            toast = Toast.makeText(MyApp.mContext, msg, Toast.LENGTH_LONG);
        } else {
            toast.setText(msg);
        }
        toast.show();
    }
}
