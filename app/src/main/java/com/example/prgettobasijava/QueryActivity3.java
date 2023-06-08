package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.prgettobasijava.Modelli.Query3;

import java.util.List;

public class QueryActivity3 extends AppCompatActivity {

    Button btn_home, btn_show;
    ListView lw_q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query3);

        btn_home = findViewById(R.id.btn_home_q3);
        btn_show = findViewById(R.id.btn_show_q3);
        lw_q = findViewById(R.id.lw_q3);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(QueryActivity3.this, MainActivity.class);
            startActivity(intent);
        });

        btn_show.setOnClickListener((v) -> {
            DatabaseHelper databaseHelper = new DatabaseHelper(QueryActivity3.this);
            List<Query3> all = databaseHelper.getQuery3();

            ArrayAdapter<Query3> query3ArrayAdapter = new ArrayAdapter<>(QueryActivity3.this, R.layout.listrow, R.id.textView2, all);
            lw_q.setAdapter(query3ArrayAdapter);
        });
    }
}