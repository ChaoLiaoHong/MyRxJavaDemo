package com.ldh.myrxjavademo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.ldh.myrxjavademo.R;
import com.ldh.myrxjavademo.base.BaseActivity;
import com.ldh.myrxjavademo.http.RetrofitFactory;
import com.ldh.myrxjavademo.model.User;
import com.ldh.myrxjavademo.util.LogUtil;
import com.ldh.myrxjavademo.util.MD5Builder;
import com.ldh.myrxjavademo.util.SharedPreferencesUtil;
import com.ldh.myrxjavademo.util.ToastUtil;

import java.io.UnsupportedEncodingException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class MainActivity extends BaseActivity {
    @BindView(R.id.edt_name)
    EditText edtName;
    @BindView(R.id.edt_pwd)
    EditText edtPwd;
    @BindView(R.id.btn_login)
    Button btnLogin;
    private String phone, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        isNull();
        try {
            login(phone, MD5Builder.getMD5(pwd));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private void login(String phone, String md5) {
        Observable<User> observable = RetrofitFactory.getInstance().login(phone, md5);
        observable.compose(compose(this.<User>bindToLifecycle())).subscribe(new Observer<User>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull User user) {
                if (user != null) {
                    if (user.isSuccess()) {
                        LogUtil.LogLong(user.getToken());
                        LogUtil.LogLong(String.valueOf(user.getMemberId()));
                        SharedPreferencesUtil.put(MainActivity.this, "token", user.getToken());
                        SharedPreferencesUtil.put(MainActivity.this, "memberId", user.getMemberId());
                        startActivity(new Intent(MainActivity.this, ShopListActivity.class));
                    } else {
                        ToastUtil.showLongToast(user.getMsg());
                    }
                }
            }

            @Override
            public void onError(@NonNull Throwable e) {
                LogUtil.LogLong(e.getMessage());
            }

            @Override
            public void onComplete() {

            }
        });
    }

    private void isNull() {
        phone = edtName.getText().toString().trim();
        pwd = edtPwd.getText().toString().trim();
        if (phone.isEmpty()) {
            ToastUtil.showLongToast("手机号不能为空");
            return;
        }
        if (pwd.isEmpty()) {
            ToastUtil.showLongToast("密码不能为空");
            return;
        }
    }
}
