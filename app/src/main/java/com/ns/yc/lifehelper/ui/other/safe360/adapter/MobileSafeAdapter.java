package com.ns.yc.lifehelper.ui.other.safe360.adapter;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ns.yc.lifehelper.R;
import com.ns.yc.lifehelper.ui.other.myNews.wxNews.model.bean.WxNewsDetailBean;
import com.ns.yc.lifehelper.utils.ImageUtils;

import org.yczbj.ycrefreshviewlib.adapter.RecyclerArrayAdapter;
import org.yczbj.ycrefreshviewlib.viewHolder.BaseViewHolder;


/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2016/9/11
 * 描    述：手机通讯卫士页面适配器
 * 修订历史：
 * ================================================
 */
public class MobileSafeAdapter extends RecyclerArrayAdapter<WxNewsDetailBean.ResultBean.ListBean> {

    public MobileSafeAdapter(Activity activity) {
        super(activity);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new ExpressDeliveryViewHolder(parent);
    }


    private class ExpressDeliveryViewHolder extends BaseViewHolder<WxNewsDetailBean.ResultBean.ListBean> {

        ImageView iv_img;
        TextView tv_title , tv_time , tv_author;

        ExpressDeliveryViewHolder(ViewGroup parent) {
            super(parent, R.layout.item_home_list);
            tv_title = $(R.id.tv_title);
            tv_time = $(R.id.tv_time);
            tv_author = $(R.id.tv_author);
            iv_img = $(R.id.iv_img);
        }

        @Override
        public void setData(WxNewsDetailBean.ResultBean.ListBean data) {
            super.setData(data);
            tv_title.setText(data.getTitle());
            tv_author.setText(data.getWeixinname());
            tv_time.setText(data.getTime());
            ImageUtils.loadImgByPicassoError(getContext(),data.getPic(),R.drawable.bg_frame_deep_gray,iv_img);
        }
    }
}
