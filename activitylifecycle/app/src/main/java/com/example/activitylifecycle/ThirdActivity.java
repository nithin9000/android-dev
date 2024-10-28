package com.example.activitylifecycle;

import android.os.Bundle;
import android.util.Log;
//import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    private static final String TAG = "ThirdActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Log.d(TAG, "onCreate called");
        Toast.makeText(this, "ThirdActivity: onCreate", Toast.LENGTH_SHORT).show();

        Button btnBack = findViewById(R.id.btnBackActivity);
        btnBack.setOnClickListener(v -> finish());
    }

}