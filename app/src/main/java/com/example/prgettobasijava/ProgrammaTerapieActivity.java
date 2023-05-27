package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prgettobasijava.Modelli.ModelloEsame;
import com.example.prgettobasijava.Modelli.ModelloTerapia;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ProgrammaTerapieActivity extends AppCompatActivity {
    Button btn_home, btn_add;
    EditText txt_terapia, txt_data_inizio, txt_data_fine, txt_paz, txt_pat, txt_care, txt_ops, txt_note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programma_terapie);

        txt_terapia = findViewById(R.id.txt_terapia_programmata);
        txt_paz = findViewById(R.id.txt_paz_terapia);
        txt_care = findViewById(R.id.txt_care_terapia);
        txt_ops = findViewById(R.id.txt_ops_terapia);
        txt_pat = findViewById(R.id.txt_pat_terapia);
        txt_data_inizio = findViewById(R.id.txt_data_inizio);
        txt_data_fine = findViewById(R.id.txt_data_fine);
        txt_note = findViewById(R.id.txt_note);
        btn_home = findViewById(R.id.btn_home_terapie_program);
        btn_add = findViewById(R.id.btn_add_terapia_prog);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(ProgrammaTerapieActivity.this, MainActivity.class);
            startActivity(intent);
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                ModelloTerapia modelloTerapia;

                try {
                    modelloTerapia = new ModelloTerapia(-1, txt_terapia.getText().toString(), txt_paz.getText().toString(), Integer.parseInt(txt_pat.getText().toString()), txt_ops.getText().toString(), txt_care.getText().toString(), LocalDate.parse(txt_data_inizio.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd")), LocalDate.parse(txt_data_fine.getText(), DateTimeFormatter.ofPattern("HH:mm")), txt_note.getText().toString());
                    Toast.makeText( ProgrammaTerapieActivity.this, modelloTerapia.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e) {
                    Toast.makeText(ProgrammaTerapieActivity.this, "Errore nel generare paziente, controllare i vincoli d'integrità referenziale", Toast.LENGTH_SHORT).show();
                    modelloTerapia = new ModelloTerapia(-1, "errore", "errore" , -1 , "errore", "errore", LocalDate.parse("1990-01-01"), LocalDate.parse("1990-01-01"), "errore");
                }

                DatabaseHelper databaseHelper = new DatabaseHelper(ProgrammaTerapieActivity.this);

                boolean success = databaseHelper.addOne(modelloTerapia);

                Toast.makeText(ProgrammaTerapieActivity.this, "Successo=" + success, Toast.LENGTH_SHORT).show();

            }
        });
    }
}