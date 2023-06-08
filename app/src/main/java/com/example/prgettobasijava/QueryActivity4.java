package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.prgettobasijava.Modelli.Query4;

import java.util.List;

public class QueryActivity4 extends AppCompatActivity {

    Button btn_home, btn_show;
    ListView lw_q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query4);

        btn_home = findViewById(R.id.btn_home_q4);
        btn_show = findViewById(R.id.btn_show_q4);
        lw_q = findViewById(R.id.lw_q4);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(QueryActivity4.this, MainActivity.class);
            startActivity(intent);
        });

        btn_show.setOnClickListener((v) -> {
            DatabaseHelper databaseHelper = new DatabaseHelper(QueryActivity4.this);
            List<Query4> all = databaseHelper.getQuery4();

            ArrayAdapter<Query4> query3ArrayAdapter = new ArrayAdapter<>(QueryActivity4.this, R.layout.listrow, R.id.textView2, all);
            lw_q.setAdapter(query3ArrayAdapter);
        });
    }
}