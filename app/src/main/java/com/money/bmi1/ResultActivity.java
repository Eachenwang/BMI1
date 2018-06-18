package com.money.bmi1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Bundle bag = intent.getExtras();
        float bmi = bag.getFloat("BMI_EXTRA", 0);
        String test = bag.getString("TEST_EXTRA", null);

        TextView result = findViewById(R.id.result);
        result.setText("BMI is :"+bmi);

    }
}
