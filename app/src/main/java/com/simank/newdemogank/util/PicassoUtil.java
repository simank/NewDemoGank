package com.simank.newdemogank.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.simank.newdemogank.R;
import com.squareup.picasso.Picasso;

/**
 * Created by sx on 2017/1/6.
 */
public class PicassoUtil {

    public static void displayImage(Context context, String path, ImageView imageView, Drawable
            defaultDrawable) {
        //显示图片
        Picasso.with(context)
                .load(path)
                .placeholder(defaultDrawable)
                .error(defaultDrawable)
                .config(Bitmap.Config.RGB_565)
//                .centerInside()
                .into(imageView);
    }

}
