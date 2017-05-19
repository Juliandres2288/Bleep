package com.example.julian.bleep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.julian.bleep.view_activitys.HomeActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        showToolbar(getResources().getString(R.string.toolbar_register_activity),false);
    }

    public void onClick(View v) {


        Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
        startActivity(intent);

    }

    public void showToolbar(String title, boolean upButton) {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        try {
            getSupportActionBar().setTitle(title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
        } catch (java.lang.NullPointerException e) {
            e.getMessage();
        }
    }

    }

