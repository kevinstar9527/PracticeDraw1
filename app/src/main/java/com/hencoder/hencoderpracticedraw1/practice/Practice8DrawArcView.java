package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint = new Paint();
    private Paint mStrokePaint = new Paint();
    private RectF rectF = new RectF();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        rectF.left = 100;
        rectF.top = 200;
        rectF.right = 300;
        rectF.bottom = 400;
        //drawArc() 是使用一个椭圆来描述弧形的。
        // left, top, right, bottom 描述的是这个弧形所在的椭圆；
        // startAngle 是弧形的起始角度（x 轴的正向，即正右的方向，是 0 度的位置；
        // 顺时针为正角度，逆时针为负角度），
        // sweepAngle 是弧形划过的角度
        // useCenter 表示是否连接到圆心，如果不连接到圆心，就是弧形，如果连接到圆心，就是扇形。
        canvas.drawArc(rectF,-110,100,true,mPaint);
        rectF.bottom = rectF.bottom+20;
        canvas.drawArc(rectF,0,180,false,mPaint);
        //绘制不封口的弧形
        mStrokePaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF,190,80,false,mStrokePaint);

    }
}
