package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

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
        Bundle args = getIntent().getExtras();

        EditText emailInput = findViewById(R.id.EmailInput);
        EditText passInput = findViewById(R.id.PassInput);
        EditText passInputConfirm = findViewById(R.id.PassInputConfirm);

        emailInput.setText(args.getString("email"));
        passInput.setText(args.getString("password"));
        passInputConfirm.setText(args.getString("password"));
    }
}