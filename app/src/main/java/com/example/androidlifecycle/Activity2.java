package com.example.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Activity2 extends AppCompatActivity {

    public final static String TAG= "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Log.d(TAG, "onCreate");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume Called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause Called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop Called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy Called");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart Called");
    }
}