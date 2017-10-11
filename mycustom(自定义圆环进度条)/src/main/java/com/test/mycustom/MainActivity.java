package com.test.mycustom;

import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private int progress = 0;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                if (progress < 100) {
                    custom.setProgress(progress);
                    if (progress <= 25)
                        custom.setColor(Color.YELLOW);
                    else if (progress <= 50)
                        custom.setColor(Color.GREEN);
                    else if (progress <= 75)
                        custom.setColor(Color.GRAY);
                    else
                        custom.setColor(Color.BLUE);
                } else {
                    progress = 100;
                    custom.setProgress(progress);
                }

            }
        }
    };
    private MyCustom custom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        custom = (MyCustom) findViewById(R.id.custom);
        custom.setMax(100);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                progress++;
                handler.sendEmptyMessage(1);
            }
        }, 100, 100);
    }
}
