package com.test.my;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyView txt = (MyView) findViewById(R.id.sanjiaoView);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.timg);
        txt.setBitmap(bitmap);
    }
}
