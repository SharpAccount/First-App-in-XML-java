package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void openSignUp(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);

        EditText emailInput = findViewById(R.id.EmailInput);
        EditText passInput = findViewById(R.id.PassInput);

        String emailText = emailInput.getText().toString();
        String passText = passInput.getText().toString();

        intent.putExtra("email", emailText);
        intent.putExtra("password", passText);

        startActivity(intent);
    }

}