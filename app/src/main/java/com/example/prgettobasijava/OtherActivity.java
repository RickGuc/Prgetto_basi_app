package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class OtherActivity extends AppCompatActivity {

    Button btn_home, btn_osp, btn_esm, btn_esz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        btn_home = (Button) findViewById(R.id.btn_home_other);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(OtherActivity.this, MainActivity.class);
            startActivity(intent);
        });

        btn_osp = (Button) findViewById(R.id.btn_OspedaleAdd);

        btn_osp.setOnClickListener(v -> {
            Intent intent = new Intent(OtherActivity.this, OtherActivity_hospital.class);
            startActivity(intent);
        });

        btn_esm = (Button) findViewById(R.id.btn_EsameAdd);

        btn_esm.setOnClickListener(v -> {
            Intent intent = new Intent(OtherActivity.this, OtherActivity_Esami.class);
            startActivity(intent);
        });

        btn_esz = (Button) findViewById(R.id.btn_EsenzioneAdd);

        btn_esz.setOnClickListener(v -> {
            Intent intent = new Intent(OtherActivity.this, OtherActivity_Esenzioni.class);
            startActivity(intent);
        });


    }
}