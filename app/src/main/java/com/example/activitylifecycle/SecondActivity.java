package com.example.activitylifecycle;

import android.os.Bundle;
import android.util.Log;
//import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d(TAG, "onCreate called");
        Toast.makeText(this, "SecondActivity: onCreate", Toast.LENGTH_SHORT).show();

        Button btnNext = findViewById(R.id.btnNextActivity);
        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(intent);
        });

        Button btnBack = findViewById(R.id.btnBackActivity);
        btnBack.setOnClickListener(v -> finish());
    }

}