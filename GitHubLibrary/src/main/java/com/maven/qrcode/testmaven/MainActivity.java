package com.maven.qrcode.testmaven;

import android.os.Bundle;
import android.view.View;

import com.library.zxing.activity.QRCodeScanActivity;

public class MainActivity extends QRCodeScanActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void QRTest(View view) {
        startScanQRCode();
    }
}
