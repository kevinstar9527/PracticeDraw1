package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.utils.DisplayUtils;

public class Practice2DrawCircleView extends View {

    private Paint mPaint = new Paint();
    private Paint  mPaintStroke = new Paint();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        mPaint.setAntiAlias(true);
        //1.实心
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(200,200,100,mPaint);
        //2.空心
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(500,200,100,mPaint);
        //3.蓝色实心圆
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLUE);
        canvas.drawCircle(200,500,100,mPaint);
        //线宽为20的空心圆

        mPaintStroke.setStyle(Paint.Style.STROKE);
        mPaintStroke.setColor(Color.BLACK);
        mPaintStroke.setStrokeWidth(DisplayUtils.dp2px(getContext(),20));
        mPaintStroke.setAntiAlias(true);
        canvas.drawCircle(500,500,100,mPaintStroke);
    }
}
