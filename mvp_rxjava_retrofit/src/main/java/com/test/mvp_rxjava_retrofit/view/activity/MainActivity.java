package com.test.mvp_rxjava_retrofit.view.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.test.mvp_rxjava_retrofit.R;
import com.test.mvp_rxjava_retrofit.presenter.MainActivityPresenter;
import com.test.mvp_rxjava_retrofit.view.RegisterView;

public class MainActivity extends AppCompatActivity implements RegisterView {

    private MainActivityPresenter presenter;
    public static String path = "http://www.baidu.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainActivityPresenter(this);
    }

    public void onClick(View view) {
        presenter.getData(path);
    }

    @Override
    public void onRegisterSucced(String result) {
        Toast.makeText(this, "请求成功:" + result, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRegisterFild(String result) {
        Toast.makeText(this, "请求失败:" + result, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context context() {
        return this;
    }
}
