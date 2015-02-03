package com.example.michael.lifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

/**
 * @author Michael Martinez
 */
public class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(this.getClass().getSimpleName(), "created");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(this.getClass().getSimpleName(), "started");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(this.getClass().getSimpleName(), "resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(this.getClass().getSimpleName(), "paused");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(this.getClass().getSimpleName(), "stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(this.getClass().getSimpleName(), "destroyed");
    }
}
