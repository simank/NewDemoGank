package com.simank.newdemogank.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.simank.newdemogank.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sx on 2016/12/12.
 */
public class GankHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.image)
    ImageView imageView;
    @BindView(R.id.text_author)
    TextView author_text;
    @BindView(R.id.text_type)
    TextView type_text;
    @BindView(R.id.text_desc)
    TextView desc_text;
    @BindView(R.id.text_url)
    TextView url_text;

    public GankHolder(View itemView) {

        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
