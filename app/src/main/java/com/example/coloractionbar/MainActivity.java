package com.example.coloractionbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        //////كودة/////////
        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
       switch (view.getId()) {

           case R.id.btn1:
               textView.setText(R.string.button1);
               break;
           case R.id.btn2:
               textView.setText(R.string.button2);
               break;
           case R.id.btn3:
               textView.setText(R.string.button3);
               break;
           case R.id.btn4:
               textView.setText(R.string.abutton4);
               break;
           case R.id.btn5:
               textView.setText(R.string.abutton5);
               break;
       }
    }
}