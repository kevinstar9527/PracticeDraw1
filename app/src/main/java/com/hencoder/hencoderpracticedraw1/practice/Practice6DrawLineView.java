package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.utils.DisplayUtils;

public class Practice6DrawLineView extends View {

    private Paint mPaint = new Paint();

    public Practice6DrawLineView(Context context) {
        super(context);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawLine() 方法画直线

        //由于直线不是封闭图形，所以 setStyle(style) 对直线没有影响。
        //startX, startY, stopX, stopY 分别是线的起点和终点坐标。
        mPaint.setStrokeWidth(DisplayUtils.dp2px(getContext(),5));//设置线条的粗细程度
        canvas.drawLine(100,100,500,500,mPaint);
    }
}
