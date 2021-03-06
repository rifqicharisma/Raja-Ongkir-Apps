package com.example.designrajaongkir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    private TextView textLoginInRegister;
    private Button RegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // text Login Register click
        textLoginInRegister = (TextView) findViewById(R.id.textLoginInRegister);
        textLoginInRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });

        // register button click
        RegisterButton = (Button) findViewById(R.id.RegisterButton);
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterSuccess();
            }
        });
    }

    // open login acitivity
    public void openLoginActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // open register success activity
    public void openRegisterSuccess(){
        Intent intent = new Intent(this, RegisterSuccess.class);
        startActivity(intent);
    }
}