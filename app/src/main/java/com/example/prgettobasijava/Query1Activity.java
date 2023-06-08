package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.prgettobasijava.Modelli.Query1;

import java.util.List;

public class Query1Activity extends AppCompatActivity {
    Button btn_home, btn_show;
    ListView lw_q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query1);

        btn_home = findViewById(R.id.btn_home_q1);
        btn_show = findViewById(R.id.btn_show_q1);
        lw_q = findViewById(R.id.lw_q1);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(Query1Activity.this, MainActivity.class);
            startActivity(intent);
        });

        btn_show.setOnClickListener((v) -> {
            DatabaseHelper databaseHelper = new DatabaseHelper(Query1Activity.this);
            List<Query1> all = databaseHelper.getQuery1();

            ArrayAdapter<Query1> query1ArrayAdapter = new ArrayAdapter<>(Query1Activity.this,  R.layout.listrow, R.id.textView2, all);
            lw_q.setAdapter(query1ArrayAdapter);
        });

    }

}
