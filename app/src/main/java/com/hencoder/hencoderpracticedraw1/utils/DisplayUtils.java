package com.hencoder.hencoderpracticedraw1.utils;

import android.content.Context;

/**
 * Created by admin on 2017/8/16.
 */

public class DisplayUtils {
    public static float dp2px(Context context,float dipValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }
}
