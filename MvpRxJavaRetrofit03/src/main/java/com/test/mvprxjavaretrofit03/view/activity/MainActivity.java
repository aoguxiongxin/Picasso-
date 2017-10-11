package com.test.mvprxjavaretrofit03.view.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.test.mvprxjavaretrofit03.R;
import com.test.mvprxjavaretrofit03.presenter.RegisterPresenter;
import com.test.mvprxjavaretrofit03.view.RegisterView;

import static java.lang.System.load;

public class MainActivity extends AppCompatActivity implements RegisterView {

    private RegisterPresenter presenter;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img);
        presenter = new RegisterPresenter(this);
    }

    public void onClick(View view) {
        presenter.getData();
    }

    @Override
    public void onRegisterSucced(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        RequestOptions requestOptions = new RequestOptions();
        //设置圆形图片
//        requestOptions.circleCrop();
        //设置圆角图片
        requestOptions.transform(new RoundedCorners(30));
        Glide.with(this).setDefaultRequestOptions(requestOptions).load(result).into(img);
    }

    @Override
    public void onRegisterFild(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context context() {
        return this;
    }
}
