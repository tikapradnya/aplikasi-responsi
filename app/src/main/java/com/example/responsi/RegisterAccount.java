package com.example.responsi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegisterAccount extends AppCompatActivity {
    TextView tv_email3, tv_password2, tv_confirm_pass;
    EditText et_email3, et_password2, et_confirm_pass;
    Button bt_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Register Account");
        setContentView(R.layout.activity_register_account);

        //Asosiasi
        tv_email3 = findViewById(R.id.tv_email3);
        tv_password2 = findViewById(R.id.tv_password2);
        tv_confirm_pass = findViewById(R.id.tv_confirm_pass);
        et_email3 = findViewById(R.id.et_email3);
        et_password2 = findViewById(R.id.et_password2);
        et_confirm_pass = findViewById(R.id.et_confirm_pass);
        bt_register = findViewById(R.id.bt_register);

        //Button Click
        bt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}