package com.example.responsi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView tv_home, tv_home2, tv_payment, tv_history, tv_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Bayar Dulu");
        setContentView(R.layout.activity_home);

        //Asosiasi
        tv_home = findViewById(R.id.tv_home);
        tv_home2 = findViewById(R.id.tv_home2);
        tv_payment = findViewById(R.id.tv_payment);
        tv_history = findViewById(R.id.tv_history);
        tv_setting = findViewById(R.id.tv_setting);
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