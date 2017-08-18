package com.hencoder.hencoderpracticedraw1.utils;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by admin on 2017/8/18.
 */

public class AxisHelper {
    private static Paint mPaint = new Paint();
    public static void drawAxisByPoint(Canvas canvas, float x, float y){
        mPaint.setColor(Color.BLACK);
        //x
        canvas.drawLine(0,y,2*x,y,mPaint);
        //y
        canvas.drawLine(x,0,x,2*y,mPaint);
    }
}
