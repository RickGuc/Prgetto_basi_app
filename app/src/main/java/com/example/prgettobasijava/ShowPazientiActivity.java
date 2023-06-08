package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.prgettobasijava.Modelli.ModelloDescrTerapia;
import com.example.prgettobasijava.Modelli.ModelloPatologia;
import com.example.prgettobasijava.Modelli.ModelloPaziente;

import java.util.List;

public class ShowPazientiActivity extends AppCompatActivity {
    Button btn_home, btn_show;
    ListView lv_paz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_pazienti);

        btn_home = (Button) findViewById(R.id.btn_home4);
        btn_show = (Button) findViewById(R.id.btn_ShowP);
        lv_paz = (ListView) findViewById(R.id.lv_paz);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(ShowPazientiActivity.this, MainActivity.class);
            startActivity(intent);
        });

        btn_show.setOnClickListener((v) -> {
            DatabaseHelper databaseHelper = new DatabaseHelper(ShowPazientiActivity.this);

            List<ModelloPaziente> all = databaseHelper.getAll();

            ArrayAdapter pazientiArrayAdapter = new ArrayAdapter<ModelloPaziente>(ShowPazientiActivity.this, R.layout.listrow, R.id.textView2, all);
            lv_paz.setAdapter(pazientiArrayAdapter);
            //Toast.makeText(ShowPazientiActivity.this, all.toString(), Toast.LENGTH_SHORT).show();
        });
    }
}