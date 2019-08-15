package com.hel.jyb;

import android.app.Application;
import android.content.Context;

import com.bumptech.glide.util.Util;


/**
 * Created by dongjunkun on 2016/2/1.
 */
public class App extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
