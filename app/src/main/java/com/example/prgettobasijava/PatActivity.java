package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prgettobasijava.Modelli.ModelloPatologia;
import com.example.prgettobasijava.Modelli.ModelloPaziente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PatActivity extends AppCompatActivity {
    Button btn_home, btn_add;
    EditText txt_pat, txt_paz, txt_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pat);

        btn_home = findViewById(R.id.bn_home_pat);
        btn_add = findViewById(R.id.bn_add_pat);
        txt_pat = findViewById(R.id.txt_pat);
        txt_paz = findViewById(R.id.txt_paz_pat);
        txt_data = findViewById(R.id.txt_dataR_pat);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(PatActivity.this, MainActivity.class);
            startActivity(intent);
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                ModelloPatologia modelloPatologia;

                try {
                    modelloPatologia = new ModelloPatologia(-1,txt_pat.getText().toString(), txt_paz.getText().toString(), LocalDate.parse(txt_data.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                    Toast.makeText( PatActivity.this, modelloPatologia.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e) {
                    Toast.makeText(PatActivity.this, "Errore nel generare paziente", Toast.LENGTH_SHORT).show();
                    modelloPatologia = new ModelloPatologia(-1, "errore", "errore", LocalDate.parse("01-01-1990"));
                }

                DatabaseHelper databaseHelper = new DatabaseHelper(PatActivity.this);

                boolean success = databaseHelper.addOne(modelloPatologia);

                Toast.makeText(PatActivity.this, "Successo=" + success, Toast.LENGTH_SHORT).show();

            }
        });
    }
}