package com.ldh.myrxjavademo.base;

import android.widget.Toast;

import com.ldh.myrxjavademo.MyApp;
import com.ldh.myrxjavademo.R;
import com.ldh.myrxjavademo.util.CommonUtils;
import com.ldh.myrxjavademo.util.SharedPreferencesUtil;
import com.ldh.myrxjavademo.util.ToastUtil;
import com.trello.rxlifecycle2.LifecycleTransformer;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by LiaoDuanHong  on 2017/10/25
 */


public abstract class BaseActivity extends RxAppCompatActivity {

    /**
     * 线程调度
     */
    protected <T> ObservableTransformer<T, T> compose(final LifecycleTransformer<T> lifecycle) {
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> observable) {
                return observable
                        .subscribeOn(Schedulers.io())
                        .doOnSubscribe(new Consumer<Disposable>() {
                            @Override
                            public void accept(Disposable disposable) throws Exception {
                                // 可添加网络连接判断等
                                if (!CommonUtils.isNetworkAvailable(BaseActivity.this)) {
                                    ToastUtil.showLongToast(CommonUtils.getString(R.string.toast_network_error));
                                }
                            }
                        })
                        .observeOn(AndroidSchedulers.mainThread())
                        .compose(lifecycle);
            }
        };
    }

    public long getMemberId() {
        return (long) SharedPreferencesUtil.get(MyApp.mContext, "memberId", 0L);
    }
}
