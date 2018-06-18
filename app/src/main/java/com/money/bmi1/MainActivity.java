package com.money.bmi1;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;
    private Button bHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //testing TestActivity
//        startActivity(new Intent(MainActivity.this,TestActivity.class));



        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();

        findViews();

        bHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("BMI Info")
                        .setMessage("bmi=h/(w*w)")
                        .setPositiveButton("OK", null)
                        .show();
            }
        });


    }

    private void findViews() {
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
        bHelp = findViewById(R.id.b_help);
    }

    public void bmi(View view) {
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height * height);
        Log.d("BMI", "bmi: " + bmi);
//        Toast.makeText(this,"BMI is : "+bmi,Toast.LENGTH_LONG).show();

//        new AlertDialog.Builder(this)
//                .setTitle("BMI calculate")
//                .setMessage("Bmi is :" + bmi)
//                .setPositiveButton("ok", null)
//                .show();

        Intent intent = new Intent(this, ResultActivity.class);
        Bundle bag = new Bundle();
        bag.putFloat("BMI_EXTRA", bmi);
        bag.putString("TEST_EXTRA", "testing");
        intent.putExtras(bag);
//        intent.putExtra("BMI_EXTRA", bmi);
        startActivity(intent);

    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestory", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
}
