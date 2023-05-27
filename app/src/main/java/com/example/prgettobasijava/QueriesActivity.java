package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class QueriesActivity extends AppCompatActivity {
    Button btn_home, btn_q1, btn_q2, btn_q3, btn_q4, btn_q5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queries);

        btn_home = (Button) findViewById(R.id.btn_home_q);
        btn_q1 = (Button) findViewById(R.id.btn_q1);
        btn_q2 = (Button) findViewById(R.id.btn_q2);
        btn_q3 = (Button) findViewById(R.id.btn_q3);
        btn_q4 = (Button) findViewById(R.id.btn_q4);
        btn_q5 = (Button) findViewById(R.id.btn_q5);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(QueriesActivity.this, MainActivity.class);
            startActivity(intent);
        });



        btn_q1.setOnClickListener(v -> {
            Intent intent = new Intent(QueriesActivity.this, Query1Activity.class);
            startActivity(intent);
        });

        btn_q2.setOnClickListener(v -> {
            Intent intent = new Intent(QueriesActivity.this, Query2Activity.class);
            startActivity(intent);
        });

        btn_q3.setOnClickListener(v -> {
            Intent intent = new Intent(QueriesActivity.this, QueryActivity3.class);
            startActivity(intent);
        });

        btn_q4.setOnClickListener(v -> {
            Intent intent = new Intent(QueriesActivity.this, QueryActivity4.class);
            startActivity(intent);
        });

        btn_q5.setOnClickListener(v -> {
            Intent intent = new Intent(QueriesActivity.this, QueryActivity5.class);
            startActivity(intent);
        });
    }
}