package com.example.osmantahir_comp304sec004_lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv = findViewById(R.id.textView);
        st = getIntent().getExtras().getString("Value");

        tv.setText(st);
    }
}