package com.test.myprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public class MyProgressBar extends View {
    private int max;//进度的最大值
    private int progress;//当前进度
    private int color;//颜色
    private Paint paint;//画笔
    private RectF mRectf;//用来画弧的

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
        //千万记住一定要重绘
        invalidate();
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public MyProgressBar(Context context) {
        super(context);
        init();
    }

    public MyProgressBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mRectf = new RectF();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置空心圆环,外层的
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(30);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(300, 300, 200, paint);
        //设置转动的弧度的颜色
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(23);
        mRectf.set(100, 100, 500, 500);//设定范围
        canvas.drawArc(mRectf, -90, ((float) progress / max * 360), false, paint);

        //重置画笔
        paint.reset();
        //设置圆环中间的文字
        paint.setColor(Color.GREEN);
        paint.setAntiAlias(true);
        paint.setTextSize(100);

        if (progress != max) {
            canvas.drawText(progress + "%", 220, 320, paint);
        } else {
            canvas.drawText("完成了!", 150, 330, paint);
        }
    }
}
