package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint mPaint = new Paint();
    private Path mPath = new Path();
    private RectF rectF = new RectF();
    private RectF rectF1 = new RectF();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        rectF.left = 100;
        rectF.top = 200;
        rectF.right =300;
        rectF.bottom = 400;
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.RED);
        canvas.drawArc(rectF,-180,120,true,mPaint);
        // TODO: 2017/8/17 计算点在圆上的坐标
        //参考链接：http://jingyan.baidu.com/article/d169e186552955436711d85e.html

        rectF1.left = 110;
        rectF1.top = 210;
        rectF1.right = 310;
        rectF1.bottom = 410;

        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(rectF1,-60,60,true,mPaint);
        mPaint.setColor(Color.parseColor("#da70d6"));
        canvas.drawArc(rectF1,0,20,true,mPaint);
        mPaint.setColor(Color.GRAY);
        canvas.drawArc(rectF1,20,20,true,mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawArc(rectF1,40,40,true,mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(rectF1,80,100,true,mPaint);

    }
}
