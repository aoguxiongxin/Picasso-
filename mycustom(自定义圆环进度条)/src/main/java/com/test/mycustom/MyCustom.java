package com.test.mycustom;

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
 * 时间: 2017/10/10
 * 类作用:
 */

public class MyCustom extends View {
    private int max;
    private int progress;
    private Paint paint;
    private RectF rectF;
    private int color;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

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
        invalidate();
    }

    public MyCustom(Context context) {
        super(context);
        init();
    }


    public MyCustom(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        rectF = new RectF();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(30);
        canvas.drawCircle(300, 300, 150, paint);

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(22);
        paint.setColor(color);
        rectF.set(150, 150, 450, 450);
        canvas.drawArc(rectF, -90, ((float) progress / max) * 360, false, paint);

        paint.reset();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);


        if (progress != max) {
            paint.setTextSize(100);
            canvas.drawText(progress + "%", 220, 330, paint);
        } else {
            paint.setTextSize(60);
            canvas.drawText("完成了!", 200, 320, paint);
        }

    }
}
