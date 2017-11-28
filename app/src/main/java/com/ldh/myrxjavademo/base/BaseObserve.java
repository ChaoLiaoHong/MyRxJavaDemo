package com.ldh.myrxjavademo.base;

import com.ldh.myrxjavademo.util.LogUtil;
import com.ldh.myrxjavademo.util.ToastUtil;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Created by LiaoDuanHong  on 2017/10/25
 */

public abstract class BaseObserve<T> implements Observer<BaseEntity<T>> {
    String TAG = "BaseObserve";

    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onNext(@NonNull BaseEntity<T> tBaseEntity) {
        T t;
        if (tBaseEntity.isSuccess()) {
            if (tBaseEntity.getPage() != null) {
                t = tBaseEntity.getPage();
            } else {
                t = tBaseEntity.getData();
            }
            onHandleSuccess(t);
        } else {
            onHandleError(tBaseEntity.getMsg());
        }
    }

    @Override
    public void onError(@NonNull Throwable e) {
        LogUtil.LogLong(TAG, e.toString());
    }

    @Override
    public void onComplete() {

    }

    protected abstract void onHandleSuccess(T t);

    protected void onHandleError(String msg) {
        LogUtil.LogLong(TAG, msg);
    }
}
