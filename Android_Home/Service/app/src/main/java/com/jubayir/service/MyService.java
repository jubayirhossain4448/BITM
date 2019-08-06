package com.jubayir.service;

import android.app.Service;
import android.content.Intent;
import android.nfc.Tag;
import android.os.IBinder;
import android.util.Log;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class MyService extends Service {

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: " + Thread.currentThread().getName());
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: " + Thread.currentThread().getName());
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
