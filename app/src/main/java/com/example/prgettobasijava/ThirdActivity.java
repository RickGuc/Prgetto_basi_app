package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prgettobasijava.Modelli.ModelloDescrTerapia;
import com.example.prgettobasijava.Modelli.ModelloTerapia;

public class ThirdActivity extends AppCompatActivity {
    Button btn_home, btn_add;
    EditText txt_nm, txt_dos, txt_vas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btn_home = (Button) findViewById(R.id.btn_home2);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
            startActivity(intent);
        });

        txt_nm = findViewById(R.id.txt_NomeT);
        txt_dos = findViewById(R.id.text_Dosaggio);
        txt_vas = findViewById(R.id.nb_VaS);
        btn_add = findViewById(R.id.btn_add_ter);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                ModelloDescrTerapia modelloDescrTerapia;

                try {
                    modelloDescrTerapia = new ModelloDescrTerapia(txt_nm.getText().toString(), txt_dos.getText().toString(), Integer.parseInt(txt_vas.getText().toString()));
                    Toast.makeText( ThirdActivity.this, modelloDescrTerapia.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e) {
                    Toast.makeText(ThirdActivity.this, "Errore nel generare terapia, controllare i vincoli d'integrità referenziale", Toast.LENGTH_SHORT).show();
                    modelloDescrTerapia = new ModelloDescrTerapia("errore", "errore", 0);
                }

                DatabaseHelper databaseHelper = new DatabaseHelper(ThirdActivity.this);

                boolean successo = databaseHelper.addOne(modelloDescrTerapia);

                Toast.makeText(ThirdActivity.this, "Successo=" + successo, Toast.LENGTH_SHORT).show();
            }
            });



    }
}