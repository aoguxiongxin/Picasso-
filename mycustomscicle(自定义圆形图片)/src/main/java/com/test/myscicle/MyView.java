package com.test.myscicle;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.service.quicksettings.Tile;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * 作者: 赵虔
 * 时间: 2017/10/9
 * 类作用:
 */

public class MyView extends Drawable {
    private Paint paint;
    private int radius;
    private Bitmap bitmap;

    public MyView(Bitmap bitmap) {
        this.bitmap = bitmap;
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        //着色器
        BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        //把着色器设置到画笔上,就相当于化闭上有了图片
        paint.setShader(shader);
        //拿到图片的宽高
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        //因为是画圆,所以要取宽高的最小值
        int min = Math.min(width, height);
        //得到宽高的最小值,除以二就是半径的长度
        radius = min / 2;
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        canvas.drawCircle(radius, radius, radius, paint);
    }

    //设置透明度
    @Override
    public void setAlpha(@IntRange(from = 0, to = 255) int alpha) {
        paint.setAlpha(alpha);
    }

    //相当于染缸,滤色镜
    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter);
    }

    //保持透明度
    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }

    //设置实际的高度
    @Override
    public int getIntrinsicHeight() {
        return radius * 2;
    }

    //设置实际的宽度
    @Override
    public int getIntrinsicWidth() {
        return radius * 2;
    }
}
