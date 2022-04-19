package com.example.responsi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RecoveryAccount extends AppCompatActivity {

    TextView tv_email2;
    EditText et_email2;
    Button bt_send_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Recovery Account");
        setContentView(R.layout.activity_recovery_account);

        //Asosiasi
        tv_email2 = findViewById(R.id.tv_email2);
        et_email2 = findViewById(R.id.et_email2);
        bt_send_email = findViewById(R.id.bt_send_email);


        //Button Click
        bt_send_email.setOnClickListener(new View.OnClickListener() {
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