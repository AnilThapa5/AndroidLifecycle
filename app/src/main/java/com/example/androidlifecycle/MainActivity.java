package com.example.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public final static String TAG= "MainActivity";

    private Button DialogButton;
    private Button SecondButton;
    int sum=0;
    private TextView  textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DialogButton = findViewById(R.id.button);
        SecondButton = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);

        Log.d(TAG, "onCreate");
        Log.d(TAG, "sum: " + sum);

        if (savedInstanceState != null) {
            sum = savedInstanceState.getInt("SUMKEY");
            Log.d(TAG, "sum after rotation:" + sum);
            textView.setText("" + sum);
        }

        DialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //adding reference to variables

                sum = sum + 1;
                Log.d(TAG, "sum: " + sum);
                textView.setText("" + sum);
            }
        });

        SecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new
                        Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });
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