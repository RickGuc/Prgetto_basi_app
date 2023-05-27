package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.prgettobasijava.Modelli.Query5;

import java.util.List;

public class QueryActivity5 extends AppCompatActivity {

    Button btn_home, btn_show;
    EditText txt_nome, txt_anno;
    ListView lw_q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query5);

        btn_home = findViewById(R.id.btn_home_q5);
        btn_show = findViewById(R.id.btn_show_q5);
        lw_q = findViewById(R.id.lw_q5);
        txt_nome = findViewById(R.id.txt_name_q5);
        txt_anno = findViewById(R.id.txt_anno_q5);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(QueryActivity5.this, MainActivity.class);
            startActivity(intent);
        });

        btn_show.setOnClickListener((v) -> {
            DatabaseHelper databaseHelper = new DatabaseHelper(QueryActivity5.this);
            List<Query5> all = databaseHelper.getQuery5(txt_nome.getText().toString(), txt_anno.getText().toString());

            ArrayAdapter<Query5> query5ArrayAdapter = new ArrayAdapter<>(QueryActivity5.this, android.R.layout.simple_list_item_1, all);
            lw_q.setAdapter(query5ArrayAdapter);
        });
    }
}