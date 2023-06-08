package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.prgettobasijava.Modelli.QueryShowEsamiP;
import com.example.prgettobasijava.Modelli.QueryShowPat;
import com.example.prgettobasijava.Modelli.QueryShowterapie;

import java.util.List;

public class EsamiTerapieShowActivity extends AppCompatActivity {

    Button btn_home, btn_esami, btn_terapie;
    TextView txt_nome, txt_cognome;
    ListView lw_q, lw_w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esami_terapie_show);

        btn_home = findViewById(R.id.btn_home_esami_terapie);
        btn_esami = findViewById(R.id.btn_show_esami);
        btn_terapie = findViewById(R.id.btn_show_terapie);
        txt_nome = findViewById(R.id.txt_nome_paz_esami_terapie);
        txt_cognome = findViewById(R.id.txt_cognome_paz_esami_terapie);
        lw_q = findViewById(R.id.lw_esami);
        lw_w = findViewById(R.id.lw_terapie);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(EsamiTerapieShowActivity.this, MainActivity.class);
            startActivity(intent);
        });

        btn_esami.setOnClickListener((v) -> {
            DatabaseHelper databaseHelper = new DatabaseHelper(EsamiTerapieShowActivity.this);
            List<QueryShowEsamiP> all = databaseHelper.getQueryShowEsamiP(txt_nome.getText().toString(), txt_cognome.getText().toString());

            ArrayAdapter<QueryShowEsamiP> queryShowEsamiPArrayAdapter = new ArrayAdapter<>(EsamiTerapieShowActivity.this, android.R.layout.simple_list_item_1, all);
            lw_q.setAdapter(queryShowEsamiPArrayAdapter);
        });

        btn_terapie.setOnClickListener((v) -> {
            DatabaseHelper databaseHelper = new DatabaseHelper(EsamiTerapieShowActivity.this);
            List<QueryShowterapie> all = databaseHelper.getQueryShowterapie(txt_nome.getText().toString(), txt_cognome.getText().toString());

            ArrayAdapter<QueryShowterapie> queryShowterapieArrayAdapter2 = new ArrayAdapter<>(EsamiTerapieShowActivity.this, android.R.layout.simple_list_item_1, all);
            lw_w.setAdapter(queryShowterapieArrayAdapter2);
        });

    }
}