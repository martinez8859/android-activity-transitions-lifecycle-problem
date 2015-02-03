package com.example.michael.lifecycletest;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
    }
}
