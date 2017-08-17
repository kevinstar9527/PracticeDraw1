package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private Paint mPaint = new Paint();
    private Path mPath = new Path();
    private RectF rectF = new RectF();
    private RectF rectF1 = new RectF();

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        rectF.left = 100;
        rectF.top = 200;
        rectF.right = 300;
        rectF.bottom = 400;
        mPath.addArc(rectF,-225,225);
        rectF1.left = rectF.right;
        rectF1.right = rectF.right+200;
        rectF1.top = rectF.top;
        rectF1.bottom = rectF.bottom;
        mPath.arcTo(rectF1,-180,225);
        mPath.lineTo(300,600);
        canvas.drawPath(mPath,mPaint);

    }
}
