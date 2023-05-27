package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prgettobasijava.Modelli.ModelloDescrTerapia;
import com.example.prgettobasijava.Modelli.ModelloOspedale;

public class OtherActivity_hospital extends AppCompatActivity {

    Button btn_home, btn_add;
    EditText txt_nm, txt_ct, txt_via, txt_num, txt_nt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_hospital);

        btn_home = (Button) findViewById(R.id.btn_home_ospedale);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(OtherActivity_hospital.this, MainActivity.class);
            startActivity(intent);
        });

        txt_nm = findViewById(R.id.txt_Nome_ospedale);
        txt_ct = findViewById(R.id.txt_Città_ospedale);
        txt_via = findViewById(R.id.txt_Via_ospedale);
        txt_num = findViewById(R.id.txt_Numero_ospedale);
        txt_nt = findViewById(R.id.txt_nt_ospedale);
        btn_add = findViewById(R.id.bn_add_ospedale);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                ModelloOspedale modelloOspedale;

                try {
                    modelloOspedale = new ModelloOspedale(-1, txt_nm.getText().toString(), txt_ct.getText().toString(), txt_via.getText().toString(), txt_num.getText().toString(), txt_nt.getText().toString() );
                    Toast.makeText( OtherActivity_hospital.this, modelloOspedale.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e) {
                    Toast.makeText(OtherActivity_hospital.this, "Errore nel generare ospedale", Toast.LENGTH_SHORT).show();
                    modelloOspedale = new ModelloOspedale(-1,"errore", "errore", "errore", "errore", "errore");
                }

                DatabaseHelper databaseHelper = new DatabaseHelper(OtherActivity_hospital.this);

                boolean successo = databaseHelper.addOne(modelloOspedale);

                Toast.makeText(OtherActivity_hospital.this, "Successo=" + successo, Toast.LENGTH_SHORT).show();
            }
        });
    }
}