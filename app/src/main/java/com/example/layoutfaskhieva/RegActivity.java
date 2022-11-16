package com.example.layoutfaskhieva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegActivity extends AppCompatActivity {

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        checkBox = findViewById(R.id.checkBox);
    }

    public void onLogIn(View view) {
        Intent logIntent = new Intent(this, LogActivity.class);
        startActivity(logIntent);
    }

    public void onRegister(View v) {
        Intent intent = new Intent(this, CongratsActivity.class);
        startActivity(intent);
    }
}