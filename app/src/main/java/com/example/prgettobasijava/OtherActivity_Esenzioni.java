package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prgettobasijava.Modelli.ModelloDescrEsame;
import com.example.prgettobasijava.Modelli.ModelloEsenzione;

public class OtherActivity_Esenzioni extends AppCompatActivity {

    Button btn_home, btn_add;
    EditText txt_esz, txt_esm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_esenzioni);

        btn_home = (Button) findViewById(R.id.bn_home_esenzione);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(OtherActivity_Esenzioni.this, MainActivity.class);
            startActivity(intent);
        });

        txt_esz = findViewById(R.id.txt_nome_esenzione);
        txt_esm = findViewById(R.id.txt_nome_esame_esenzione);
        btn_add = findViewById(R.id.bn_aggiungi_esenzione);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                ModelloEsenzione modelloEsenzione;

                try {
                    modelloEsenzione = new ModelloEsenzione( txt_esz.getText().toString(), txt_esm.getText().toString());
                    Toast.makeText( OtherActivity_Esenzioni.this, modelloEsenzione.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e) {
                    Toast.makeText(OtherActivity_Esenzioni.this, "Errore nel generare esenzione, controllare i vincoli d'integrità referenziale", Toast.LENGTH_SHORT).show();
                    modelloEsenzione = new ModelloEsenzione("errore","errore");
                }

                DatabaseHelper databaseHelper = new DatabaseHelper(OtherActivity_Esenzioni.this);

                boolean successo = databaseHelper.addOne(modelloEsenzione);

                Toast.makeText(OtherActivity_Esenzioni.this, "Successo=" + successo, Toast.LENGTH_SHORT).show();
            }
        });
    }
}