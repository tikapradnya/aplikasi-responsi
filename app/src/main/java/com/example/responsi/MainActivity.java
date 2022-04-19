package com.example.responsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_email, tv_password, tv_forgot, tv_register, tv_here, tv_here2;
    EditText et_email, et_password;
    Button bt_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        //Asosiasi
          //TextView
        tv_email = findViewById(R.id.tv_email);
        tv_password = findViewById(R.id.tv_password);
        tv_forgot = findViewById(R.id.tv_forgot);
        tv_register = findViewById(R.id.tv_register);
        tv_here = findViewById(R.id.tv_here);
        tv_here2 = findViewById(R.id.tv_here2);

            //EditText
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);

            //Button
        bt_login = findViewById(R.id.bt_login);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

        tv_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                here();
            }
        });

        tv_here2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                here2();
            }
        });
    }
    public void login(){
        //kirim
        Intent i = new Intent(this, HomeActivity.class);
        //jalankan activity
        startActivity(i);
    }

    public void here(){
        Intent i = new Intent(this, RecoveryAccount.class);
        startActivity(i);
    }

    public void here2(){
        Intent i = new Intent(this, RegisterAccount.class);
        startActivity(i);
    }

}