package com.test.mvprxjavaretrofit02.view.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.test.mvprxjavaretrofit02.R;
import com.test.mvprxjavaretrofit02.model.NewsBean;
import com.test.mvprxjavaretrofit02.presenter.MainActivityPresenter;
import com.test.mvprxjavaretrofit02.view.MainActivityView;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private MainActivityPresenter presenter;
    private String path = "http://v.juhe.cn/toutiao/";

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
    public void onRegisterSucced(NewsBean result) {
        Toast.makeText(this, result.getResult().getData().get(0).getTitle(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRegisterFild(String result) {

    }

    @Override
    public Context context() {
        return this;
    }
}