package com.example.osmantahir_comp304_lab_ex2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AIActivity extends AppCompatActivity {
    private SecondFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiactivity);
        fragment = (SecondFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment3);
        fragment.displayActivity("AIActivity:");
        fragment.displayOnCreate("OnCreate Executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        fragment.displayOnStart("OnStart Executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        fragment.displayOnStop("AIActivity OnStop Executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        fragment.displayOnDestroy("AIActivity OnDestroy Executed");
    }
}
