package com.example.hw4_albert_19_12_2023;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    Button btn;
    int num = 0;
    //BackgroundColorSpan cl;
    ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tv1 = findViewById(R.id.tv1);
        cl = findViewById(R.id.cl);
    }

    public void lol(View view) {
        num++;
        if(num % 7 == 0 || num%10 == 7)
        {
            tv1.setText("BOOM !");
            cl.setBackgroundColor(Color.RED);
            tv1.setTextSize(30);
            btn.setBackgroundColor(Color.BLACK);
        }
        else
        {
            tv1.setText("This is a click number: "+ num);
            cl.setBackgroundColor(Color.GREEN);
            tv1.setTextSize(20);
        }
    }
}