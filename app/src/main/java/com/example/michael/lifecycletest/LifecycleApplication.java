package com.example.michael.lifecycletest;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class LifecycleApplication extends ApplicationTestCase<Application> {
    public LifecycleApplication() {
        super(Application.class);
    }
}