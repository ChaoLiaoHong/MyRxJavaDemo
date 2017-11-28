package com.ldh.myrxjavademo.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.ldh.myrxjavademo.R;
import com.ldh.myrxjavademo.model.ShopListEntity;


/**
 * Created by LiaoDuanHong  on 2017/8/22
 */

public class ShopListAdapter extends BaseQuickAdapter<ShopListEntity.ContentsBean, BaseViewHolder> {
    private Context context;

    public ShopListAdapter(Context context) {
        super(R.layout.item_shop_list_info);
        this.context = context;
    }

    @SuppressLint("StringFormatMatches")
    @Override
    protected void convert(BaseViewHolder helper, final ShopListEntity.ContentsBean item) {
        double distance = item.getDistance();
        String dis = null;
        String present = null;
//        if (distance < 1000) {
//            dis = String.format(getString(R.string.tv_distanceM), String.valueOf(distance));
//        } else {
//            dis = String.format(context.getString(R.string.tv_distance), CommonUtil.Double1position(distance / 1000));
//        }
        if (item.getShopDiscount() == 100) {
            // present = "目前没有赠送";
            // helper.getView(R.id.v_lian).setVisibility(View.GONE);
            helper.getView(R.id.tv_present).setVisibility(View.GONE);
        } else {
            //helper.getView(R.id.v_lian).setVisibility(View.VISIBLE);
            helper.getView(R.id.tv_present).setVisibility(View.VISIBLE);
            int presents = (100 - item.getShopDiscount()) * item.getRebateIntegralMember();
            present = "消费100元赠送" + presents + "积分";
        }
        helper.setText(R.id.tv_commodity_name, item.getShopName())
                .setText(R.id.tv_money_person, "¥" + item.getAvgSpend())
                .setText(R.id.tv_distance, dis)
                .setText(R.id.tv_address, item.getAddress())
                .setText(R.id.tv_present, present)
                .setRating(R.id.rb, item.getShopStartLevel());
//       Glide.with(context).load(item.getShop_signage().getMid()).into((ImageView) helper.getView(R.id.iv_commodity_pic));
//        GlideUtils.loadImage(context,item.getShop_signage().getMid(),(ImageView) helper.getView(R.id.iv_commodity_pic));
    }
}
