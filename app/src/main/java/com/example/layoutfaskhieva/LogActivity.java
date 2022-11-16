package com.example.layoutfaskhieva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class LogActivity extends AppCompatActivity {

    private CheckBox checkBox;
    Button log;
    EditText email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        checkBox = findViewById(R.id.chkBox);
        log = findViewById(R.id.btnLog);
        email = findViewById(R.id.Et_PhoneEmail);
        pass = findViewById(R.id.edPasswordLog);
    }

    public void onRegister(View view) {
        Intent regIntent = new Intent(this,RegActivity.class);
        startActivity(regIntent);
    }
}