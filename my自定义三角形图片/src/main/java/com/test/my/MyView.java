package com.test.my;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者: 赵虔
 * 时间: 2017/10/10
 * 类作用:
 */

public class MyView extends View {
    private Bitmap bitmap;
    private Paint paint;
    private BitmapShader shader;
    private Path path;

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setShader(shader);
        paint.setColor(Color.RED);
        path = new Path();
        paint.setColor(Color.BLUE);
        path.moveTo(300, 200);
        path.lineTo(100, 400);
        path.lineTo(500, 400);
        path.close();
        canvas.drawPath(path, paint);
    }
}
