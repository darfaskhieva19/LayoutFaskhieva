package com.example.layoutfaskhieva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
    }

    public void onLogIn(View view) {
        Intent logIntent = new Intent(this,LogActivity.class);
        startActivity(logIntent);
    }
}