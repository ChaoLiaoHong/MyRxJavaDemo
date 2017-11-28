package com.ldh.myrxjavademo.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.ldh.myrxjavademo.R;
import com.ldh.myrxjavademo.adapter.ShopListAdapter;
import com.ldh.myrxjavademo.base.BaseActivity;
import com.ldh.myrxjavademo.base.BaseEntity;
import com.ldh.myrxjavademo.base.BaseObserve;
import com.ldh.myrxjavademo.http.RetrofitFactory;
import com.ldh.myrxjavademo.model.ShopListEntity;
import com.ldh.myrxjavademo.model.WithdrawDepositRecordEntity;
import com.ldh.myrxjavademo.util.LogUtil;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;


public class ShopListActivity extends BaseActivity {

    @BindView(R.id.rv_commodity_list_info)
    RecyclerView rvCommodityListInfo;
    private HashMap<String, Object> map = new HashMap<>();
    private HashMap<String, Object> map1 = new HashMap<>();
    private ShopListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);
        ButterKnife.bind(this);
        LogUtil.LogLong("获取保存的会员ID", getMemberId() + "");
        rvCommodityListInfo.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ShopListAdapter(this);
        rvCommodityListInfo.setAdapter(adapter);
        map.put("longitude", 104.046667);
        map.put("latitude", 30.691953);
        map.put("radius", 100000);
        map.put("pageNum", 1);
        map.put("pageSize", 100);
        Observable<BaseEntity<ShopListEntity>> observable = RetrofitFactory.getInstance().getShopPoiGeoSearchByNear(map);
        observable.compose(compose(this.<BaseEntity<ShopListEntity>>bindToLifecycle())).subscribe(new BaseObserve<ShopListEntity>() {
            @Override
            protected void onHandleSuccess(ShopListEntity shopListEntity) {
                LogUtil.LogLong("获取的", shopListEntity.getSize() + "");
                LogUtil.LogLong(shopListEntity.getContents().toString());
                adapter.setNewData(shopListEntity.getContents());
            }
        });
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                LogUtil.LogLong("点击了", position + "");
                LogUtil.LogLong("点击了的id", getMemberId() + "");
                getWithdrawRecord();
            }
        });
    }

    private void getWithdrawRecord() {
        LogUtil.LogLong("点击了的id", getMemberId() + "");
        Observable<BaseEntity<WithdrawDepositRecordEntity>> observable = RetrofitFactory.getInstance().getWithdrawalRecord(getMemberId(), 1, 10);
        observable.compose(compose(this.<BaseEntity<WithdrawDepositRecordEntity>>bindToLifecycle())).subscribe(new BaseObserve<WithdrawDepositRecordEntity>() {
            @Override
            protected void onHandleSuccess(WithdrawDepositRecordEntity withdrawDepositRecordEntity) {
                LogUtil.LogLong("钱包记录", withdrawDepositRecordEntity.getTotal() + "");
            }
        });
    }
}
