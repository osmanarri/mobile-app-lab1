package com.example.osmantahir_comp304_lab_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private SecondFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (SecondFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment2);
        fragment.displayActivity("Main Activity:");
        fragment.displayOnCreate("OnCreate Executed");
    }

    public void sendMessage(){
        fragment.displayActivity("Here we are");
    }

    @Override
    protected void onStart() {
        super.onStart();
        fragment.displayOnStart("OnStart Executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        fragment.displayOnStop("Main OnStop Executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        fragment.displayOnDestroy("Main OnDestroy Executed");
    }
}