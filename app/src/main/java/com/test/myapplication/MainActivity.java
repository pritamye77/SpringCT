package com.test.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    Button login;
    boolean isEmailValid, isPasswordValid;
    TextInputLayout emailError, passError;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        password = (EditText) findViewById(R.id.editTextTextPassword);
        login = (Button) findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SetValidation();
                Intent myIntent = new Intent(MainActivity.this, NextActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);


            }
        });
    }

//    public void SetValidation() {
//        // Check for a valid email address.
//        if (email.getText().toString().isEmpty()) {
//            emailError.setError(getResources().getString(R.string.email_error));
//            isEmailValid = false;
//        } else if (!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
//            emailError.setError(getResources().getString(R.string.error_invalid_email));
//            isEmailValid = false;
//        } else  {
//            isEmailValid = true;
//            emailError.setErrorEnabled(false);
//        }
//
//        // Check for a valid password.
//        if (password.getText().toString().isEmpty()) {
//            passError.setError(getResources().getString(R.string.password_error));
//            isPasswordValid = false;
//        } else if (password.getText().length() < 6) {
//            passError.setError(getResources().getString(R.string.error_invalid_password));
//            isPasswordValid = false;
//        } else  {
//            isPasswordValid = true;
//            passError.setErrorEnabled(false);
//        }
//
//        if (isEmailValid && isPasswordValid) {
//            Toast.makeText(getApplicationContext(), "Successfully", Toast.LENGTH_SHORT).show();
//        }
//
//    }

}