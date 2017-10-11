package com.test.myprogressbar;

import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private MyProgressBar viewById;
    private int progress = 0;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                int arg1 = msg.arg1;
                if (arg1 <= 25) {
                    viewById.setColor(Color.GREEN);
                } else if (arg1 <= 50) {
                    viewById.setColor(Color.parseColor("#FF0080"));
                } else if (arg1 <= 75) {
                    viewById.setColor(Color.GRAY);
                } else if (arg1 <= 100) {
                    viewById.setColor(Color.YELLOW);
                } else {
                    arg1 = 100;
                }
                viewById.setProgress(arg1);
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById = (MyProgressBar) findViewById(R.id.progress);
        //设置最大进度
        viewById.setMax(100);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                progress++;
                Message msg = Message.obtain();
                msg.what = 1;
                msg.arg1 = progress;
                handler.sendMessage(msg);
            }
        }, 100, 100);
    }
}
