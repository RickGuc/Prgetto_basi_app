package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prgettobasijava.Modelli.ModelloPaziente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SecondActivity extends AppCompatActivity {



    EditText txt_Nm, txt_Cm, txt_CF, txt_CS, txt_Ct, txt_Via, txt_Num, date_NP, txt_Gen;
    Button btn_Add, btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_home = (Button) findViewById(R.id.btn_home);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                    startActivity(intent);
        });

        txt_Nm = findViewById(R.id.text_NomeP);
        txt_Cm = findViewById(R.id.text_CognomeP);
        txt_CF = findViewById(R.id.text_CodiceF);
        txt_CS = findViewById(R.id.text_CodiceS);
        txt_Ct = findViewById(R.id.text_Cta);
        txt_Via = findViewById(R.id.text_ViaP);
        txt_Num = findViewById(R.id.text_Nm);
        date_NP = findViewById(R.id.date_NascitaP);
        txt_Gen = findViewById(R.id.text_Gn);
        btn_Add = findViewById(R.id.btn_Add);


        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                ModelloPaziente modelloPaziente;

                try {
                    modelloPaziente = new ModelloPaziente(txt_Nm.getText().toString(), txt_Cm.getText().toString(), LocalDate.parse(date_NP.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd")), txt_CS.getText().toString(), txt_CF.getText().toString(), txt_Ct.getText().toString(), txt_Via.getText().toString(), txt_Num.getText().toString(), txt_Gen.getText().toString());
                    Toast.makeText( SecondActivity.this, modelloPaziente.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e) {
                    Toast.makeText(SecondActivity.this, "Errore nel generare paziente", Toast.LENGTH_SHORT).show();
                    modelloPaziente = new ModelloPaziente("errore", "errore", LocalDate.parse("1990-01-01"), "errore", "errore", "errore", "errore", "errore", "errore" );
                }

                DatabaseHelper databaseHelper = new DatabaseHelper(SecondActivity.this);

                boolean success = databaseHelper.addOne(modelloPaziente);

                Toast.makeText(SecondActivity.this, "Successo=" + success, Toast.LENGTH_SHORT).show();

            }
    });

  }
}