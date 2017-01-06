package com.simank.newdemogank.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.simank.newdemogank.Bean.GankBean;
import com.simank.newdemogank.R;
import com.simank.newdemogank.util.PicassoUtil;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by sx on 2016/12/12.
 */
public class MainRecycleAdapter extends RecyclerView.Adapter<GankHolder> {


    private List<GankBean.ResultsBean> list;

    private Context mContext;

    private LayoutInflater mInflater;

    private ItemClockListener itemClockListener;

    public MainRecycleAdapter(List<GankBean.ResultsBean> list, Context context) {
        this.list = list;
        this.mContext = context;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public GankHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recycle_main_layout, parent, false);

        GankHolder holder = new GankHolder(view);

        if (itemClockListener != null) {

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(mContext, "recycle lister", Toast.LENGTH_SHORT).show();
                }
            });
        }

        return holder;
    }

    @Override
    public void onBindViewHolder(GankHolder holder, int position) {


        if (list.get(position).getImages().size() != 0) {
            PicassoUtil.displayImage(mContext, list.get(position).getImages().get(0), holder
                    .imageView,mContext.getResources().getDrawable(R.drawable.ic_launcher));
        } else {
            holder.imageView.setImageResource(R.mipmap.ic_launcher);
        }
        holder.author_text.setText(list.get(position).getWho());
        holder.type_text.setText(list.get(position).getType());
        holder.desc_text.setText(list.get(position).getDesc());
        holder.url_text.setText(list.get(position).getUrl());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setItemClockListener(ItemClockListener listener) {
        this.itemClockListener = listener;
    }

    /**
     * 更新数据
     *
     * @param list
     */

    public void updateDate(List<GankBean.ResultsBean> list) {
        if (list != null) {
            list.clear();
        }
        list.addAll(list);
        notifyDataSetChanged();

    }





}
