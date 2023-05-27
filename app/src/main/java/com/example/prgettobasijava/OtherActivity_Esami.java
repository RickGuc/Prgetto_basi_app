package com.example.prgettobasijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prgettobasijava.Modelli.ModelloDescrEsame;
import com.example.prgettobasijava.Modelli.ModelloOspedale;

public class OtherActivity_Esami extends AppCompatActivity {

    Button btn_home, btn_add;
    EditText txt_nm, txt_tp, txt_cs, txt_spc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_esami);

        btn_home = (Button) findViewById(R.id.bn_home_esami_add);

        btn_home.setOnClickListener(v -> {
            Intent intent = new Intent(OtherActivity_Esami.this, MainActivity.class);
            startActivity(intent);
        });

        txt_nm = findViewById(R.id.txt_nome_esame);
        txt_tp = findViewById(R.id.txt_tipo_esame);
        txt_cs = findViewById(R.id.txt_costo_esame);
        txt_spc = findViewById(R.id.txt_spec_esame);
        btn_add = findViewById(R.id.bn_add_esami);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                ModelloDescrEsame modelloDescrEsame;

                try {
                    modelloDescrEsame = new ModelloDescrEsame( txt_nm.getText().toString(), txt_tp.getText().toString(),  Integer.parseInt(txt_cs.getText().toString()), txt_spc.getText().toString());
                    Toast.makeText( OtherActivity_Esami.this, modelloDescrEsame.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e) {
                    Toast.makeText(OtherActivity_Esami.this, "Errore nel generare Esame", Toast.LENGTH_SHORT).show();
                    modelloDescrEsame = new ModelloDescrEsame("errore","errore", 0, "errore");
                }

                DatabaseHelper databaseHelper = new DatabaseHelper(OtherActivity_Esami.this);

                boolean successo = databaseHelper.addOne(modelloDescrEsame);

                Toast.makeText(OtherActivity_Esami.this, "Successo=" + successo, Toast.LENGTH_SHORT).show();
            }
        });
    }
}