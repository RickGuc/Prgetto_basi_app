package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.prgettobasijava.Modelli.Query1;
import com.example.prgettobasijava.Modelli.Query2;

import java.util.List;

public class Query2Activity extends AppCompatActivity {

    Button btn_home, btn_show;
    ListView lw_q;
    EditText txt_anno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query2);

        btn_home = findViewById(R.id.btn_home_q2);
        btn_show = findViewById(R.id.btn_show_q2);
        txt_anno = findViewById(R.id.txt_anno_q2);
        lw_q = findViewById(R.id.lw_q2);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(Query2Activity.this, MainActivity.class);
            startActivity(intent);
        });

        btn_show.setOnClickListener((v) -> {
            DatabaseHelper databaseHelper = new DatabaseHelper(Query2Activity.this);
            List<Query2> all = databaseHelper.getQuery2(txt_anno.getText().toString());

            ArrayAdapter<Query2> query2ArrayAdapter = new ArrayAdapter<>(Query2Activity.this, R.layout.listrow, R.id.textView2, all);
            lw_q.setAdapter(query2ArrayAdapter);
        });
    }
}