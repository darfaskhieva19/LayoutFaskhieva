package com.example.layoutfaskhieva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegActivity extends AppCompatActivity {

    Button reg;
    EditText name, email, pass, confirmPassword;
    CheckBox checkB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        reg = findViewById(R.id.btnReg);
        name = findViewById(R.id.Et_FullName);
        email = findViewById(R.id.Et_Phone_Email);
        pass = findViewById(R.id.edPasswordReg);
        confirmPassword = findViewById(R.id.editPassword);
        checkB = findViewById(R.id.checkBox);
    }

    public void onLogIn(View view) {
        Intent logIntent = new Intent(this,LogActivity.class);
        startActivity(logIntent);
    }

    public void onRegister(View v) {
        if (!email.getText().toString().isEmpty() &&
                !pass.getText().toString().isEmpty() &&
                !name.getText().toString().isEmpty() &&
                !confirmPassword.getText().toString().isEmpty() &&
                checkB.isChecked()) {
            startActivity(new Intent(RegActivity.this, CongratsActivity.class));
        }
    }
}