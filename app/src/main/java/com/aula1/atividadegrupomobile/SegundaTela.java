package com.aula1.atividadegrupomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaTela extends AppCompatActivity {

    TextView renda;
    Button btnMensal, btnAnual;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        renda = findViewById(R.id.renda);
        btnMensal = findViewById(R.id.btnMensal);
        btnAnual = findViewById(R.id.btnAnual);

        // fazer com que ao clicar no btnAnual pegar a renda e abrir outra tela com o calculo
        btnMensal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}