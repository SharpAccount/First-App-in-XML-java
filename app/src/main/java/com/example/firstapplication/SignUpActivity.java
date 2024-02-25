package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setData();
    }

    private void setData() {
        EditText emailInput = findViewById(R.id.EmailInput);
        EditText passInput = findViewById(R.id.PassInput);

        User userData = (User) getIntent().getSerializableExtra(User.class.getName());

        if (userData != null) {
            emailInput.setText(userData.Email());
            passInput.setText(userData.Password());
        }
    }

    public void goPreviousPage(View view) {
        finish();
    }
}