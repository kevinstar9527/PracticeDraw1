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

import com.hencoder.hencoderpracticedraw1.utils.DisplayUtils;

public class Practice10HistogramView extends View {

    private Path mLinePath = new Path();
    private Paint mPaint = new Paint();
    private Paint mTextPaint = new Paint();
    private Paint mRectPaint = new Paint();
    private Path mMainPath = new Path();
    private RectF rectF = new RectF();
    private RectF rectF1 = new RectF();
    private RectF rectF2 = new RectF();
    private RectF rectF3 = new RectF();
    private RectF rectF4 = new RectF();
    private int offset = 20;
    private int width = 70;
    private float bottom ;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        //坐标轴
        mMainPath.moveTo(100,100);
        mMainPath.rLineTo(0,400);
        mMainPath.rLineTo(600,0);
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(DisplayUtils.dp2px(getContext(),5));
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setAntiAlias(true);
        canvas.drawPath(mMainPath,mPaint);
        bottom = 500-DisplayUtils.dp2px(getContext(),3);
        //柱状图
        // TODO: 2017/8/17 待总结出规律提取出方法自动生成柱状图
        mMainPath.moveTo(120,500);
        rectF.left = 120;
        rectF.right = rectF.left+width;
        rectF.bottom = bottom;
        rectF.top = bottom - 30;
        mRectPaint.setColor(Color.GREEN);
        canvas.drawRect(rectF, mRectPaint);
        float[] textPosition = calculationTextPosition("Froyo",rectF.right);
        canvas.drawText("Froyo",textPosition[0],textPosition[1],mTextPaint);
        //画第二个矩形
       // rectF1.set(rectF.right+offset,400-DisplayUtils.dp2px(getContext(),5),rectF.left+offset+width,500-DisplayUtils.dp2px(getContext(),3));
        rectF1.left = rectF.right+offset;
        rectF1.right = rectF1.left+width;
        rectF1.bottom = bottom;
        rectF1.top = bottom - 80;
        canvas.drawRect(rectF1,mRectPaint);
        float[] textPosition1 = calculationTextPosition("GB",rectF1.right);
        canvas.drawText("GB",textPosition1[0],textPosition1[1],mTextPaint);

        rectF2.left = rectF1.right+offset;
        rectF2.right = rectF2.left+width;
        rectF2.bottom = bottom;
        rectF2.top = bottom - 300;
        canvas.drawRect(rectF2,mRectPaint);
        float[] textPosition2 = calculationTextPosition("KitKat",rectF2.right);
        canvas.drawText("KitKat",textPosition2[0],textPosition2[1],mTextPaint);
        rectF3.left = rectF2.right+offset;
        rectF3.right = rectF3.left+width;
        rectF3.bottom = bottom;
        rectF3.top = bottom - 5;
        canvas.drawRect(rectF3,mRectPaint);
        float[] textPosition3 = calculationTextPosition("L",rectF3.right);
        canvas.drawText("L",textPosition3[0],textPosition3[1],mTextPaint);

        rectF4.left = rectF3.right+offset;
        rectF4.right = rectF4.left+width;
        rectF4.bottom = bottom;
        rectF4.top = bottom - 200;
        canvas.drawRect(rectF4,mRectPaint);
        float[] textPosition4 = calculationTextPosition("O",rectF4.right);
        canvas.drawText("O",textPosition4[0],textPosition4[1],mTextPaint);
    }

    /**
     * 计算出绘制文字的坐标
     * @param froyo
     * @return
     */
    private float[] calculationTextPosition(String froyo,float rectRight) {
        float[] textPosition = new float[2] ;
        float widthText = mTextPaint.measureText(froyo);
        textPosition[0] = rectRight-width/2-widthText/2;
        textPosition[1] = bottom+15+DisplayUtils.dp2px(getContext(),8);
        return textPosition;
    }
}
