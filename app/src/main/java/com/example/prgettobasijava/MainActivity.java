package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button  next_page_queries, next_page_pat, next_page, next_page_PazientiShow, next_page_Terapie, next_page_other, next_page_add_ter, next_page_add_esame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next_page =(Button) findViewById(R.id.Btn_PageAddPazienti);
        next_page_PazientiShow =(Button) findViewById(R.id.btn_PazientiShow);
        next_page_Terapie =(Button) findViewById(R.id.btn_TerapieAdd);
        next_page_other =(Button) findViewById(R.id.btn_altro);
        next_page_pat = (Button) findViewById(R.id.btn_pat);
        next_page_queries = (Button) findViewById(R.id.btn_QueryPage);
        next_page_add_ter = findViewById(R.id.btn_programma_terapia);
        next_page_add_esame = findViewById(R.id.btn_programma_esame);

        next_page.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        next_page_Terapie.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            startActivity(intent);
        });

        next_page_queries.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, QueriesActivity.class);
            startActivity(intent);
        });

        next_page_pat.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PatActivity.class);
            startActivity(intent);
        });


        next_page_other.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OtherActivity.class);
            startActivity(intent);
        });

        next_page_PazientiShow.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ShowPazientiActivity.class);
            startActivity(intent);
        });

        next_page_add_ter.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProgrammaTerapieActivity.class);
            startActivity(intent);
        });

        next_page_add_esame.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProgrammaEsamiActivity.class);
            startActivity(intent);
        });


    }
}