package io.instadakwah.instadakwah;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by wisnu on 12/01/2017.
 */

public class InstaDakwahApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}