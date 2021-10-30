package com.meriem.temperateurconveter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    private Button cToF , fToC;
    private TextView Result;
    private EditText enterTemp;
    double Result0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cToF = findViewById(R.id.cToF);
        fToC =findViewById(R.id.fToC);
        Result = findViewById(R.id.Result);
        enterTemp = findViewById(R.id.enterTemp);


        cToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp =Double.parseDouble(enterTemp.getText().toString());
                Result0 =(temp *1.8) + 32;
                Result.setText(String.valueOf(Result0));

            }
        });
        fToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp =Double.parseDouble(enterTemp.getText().toString());
                Result0 =(temp - 32) / 1.8;
                Result.setText(String.valueOf(Result0));
            }
        });

    };
}