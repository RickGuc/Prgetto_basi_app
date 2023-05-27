package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prgettobasijava.Modelli.ModelloEsame;
import com.example.prgettobasijava.Modelli.ModelloPaziente;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ProgrammaEsamiActivity extends AppCompatActivity {
    Button btn_home, btn_add;
    EditText txt_esame, txt_data, txt_ora, txt_paz, txt_pat, txt_ops, txt_osp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programma_esami);

    btn_add = findViewById(R.id.btn_esame_progr_add);
    btn_home = (Button) findViewById(R.id.btn_prog_esami_home);
    txt_esame = findViewById(R.id.txt_nome_esame_programmato);
    txt_data = findViewById(R.id.txt_data_esame);
    txt_ora = findViewById(R.id.txt_ora_esame);
    txt_pat = findViewById(R.id.txt_pat_esame);
    txt_ops = findViewById(R.id.txt_opS_esame);
    txt_paz = findViewById(R.id.txt_pat_esame);
    txt_osp = findViewById(R.id.txt_osp_esame);

        btn_home.setOnClickListener(v -> {
        Intent intent = new Intent(ProgrammaEsamiActivity.this, MainActivity.class);
        startActivity(intent);
    });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                ModelloEsame modelloEsame;

                try {
                    modelloEsame = new ModelloEsame(-1, txt_esame.getText().toString(), LocalDate.parse(txt_data.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd")), LocalTime.parse(txt_ora.getText(), DateTimeFormatter.ofPattern("HH:mm")), txt_paz.getText().toString(), Integer.parseInt(txt_pat.getText().toString()), txt_ops.getText().toString(), Integer.parseInt(txt_osp.getText().toString()));
                    Toast.makeText( ProgrammaEsamiActivity.this, modelloEsame.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e) {
                    Toast.makeText(ProgrammaEsamiActivity.this, "Errore nel generare paziente, controllare i vincoli d'integrità referenziale", Toast.LENGTH_SHORT).show();
                    modelloEsame = new ModelloEsame(-1, "errore", LocalDate.parse("1990-01-01"), LocalTime.parse("00:00"), "errore", -1, "errore", -1);
                }

                DatabaseHelper databaseHelper = new DatabaseHelper(ProgrammaEsamiActivity.this);

                boolean success = databaseHelper.addOne(modelloEsame);

                Toast.makeText(ProgrammaEsamiActivity.this, "Successo=" + success, Toast.LENGTH_SHORT).show();

            }
        });
  }
}