package com.test.my;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MyView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById = (MyView) findViewById(R.id.text);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.timg);
        //压缩的尺寸
        Bitmap newwith = newwith(bitmap, 600, 600);
        viewById.setBitmap(newwith);
    }

    //用来压缩图片的
    public static Bitmap newwith(Bitmap bitmap, int newwith, int newheight) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float with = (float) newwith / width;
        float heig = (float) newheight / height;
        Matrix matrix = new Matrix();
        matrix.postScale(with, heig);
        Bitmap bitmap1 = bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        return bitmap1;
    }

    //重新打了一遍图片压缩
    public Bitmap resetBitmap(Bitmap bitmap, int width, int height) {
        int height1 = bitmap.getHeight();
        int width1 = bitmap.getWidth();
        int i = width / width1;
        int i1 = height / height1;
        Matrix matrix = new Matrix();
        matrix.postScale(i, i1);
        return bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

}
