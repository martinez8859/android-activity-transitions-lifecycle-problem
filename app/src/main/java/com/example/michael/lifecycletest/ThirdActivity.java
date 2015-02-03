package com.example.michael.lifecycletest;

import android.os.Bundle;
import android.os.Handler;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    @Override
    protected void onResume() {
        super.onResume();

        new Handler(getMainLooper()).postDelayed(new Runnable() {
            @Override public void run() {
                finish();
            }
        }, 50);

    }
}
