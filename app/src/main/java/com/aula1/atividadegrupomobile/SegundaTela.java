package com.aula1.atividadegrupomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaTela extends AppCompatActivity {

    TextView renda;
    Button btnMensal, btnAnual;
    double imposto;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        renda = findViewById(R.id.renda);
        btnMensal = findViewById(R.id.btnMensal);
        btnAnual = findViewById(R.id.btnAnual);

        double rendaUsuario = Double.parseDouble(renda.getText().toString());

        // fazer com que ao clicar no btnAnual pegar a renda e abrir outra tela com o calculo
        btnMensal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rendaUsuario <= 1903.98) {
                    imposto = 0;
                } else if (rendaUsuario <= 2826.65) {
                    imposto = (rendaUsuario * 0.075) - 142.80;
                } else if (rendaUsuario <= 3751.05) {
                    imposto = (rendaUsuario * 0.15) - 354.80;
                } else if (rendaUsuario <= 4664.68) {
                    imposto = (rendaUsuario * 0.225) - 636.13;
                } else {
                    imposto = (rendaUsuario * 0.275) - 869.36;
                }
            }


        });

        btnAnual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rendaUsuario <= 22847.76) {
                    imposto = 0;
                } else if (rendaUsuario <= 33919.80) {
                    imposto = (rendaUsuario * 0.075) - 1713.58;
                } else if (rendaUsuario <= 45012.60) {
                    imposto = (rendaUsuario * 0.15) - 4257.57;
                } else if (rendaUsuario <= 55976.16) {
                    imposto = (rendaUsuario * 0.225) - 7633.51;
                } else {
                    imposto = (rendaUsuario * 0.275) - 10432.32;
                }
            }
        });

        Bundle informacao = new Bundle();
        informacao.putDouble("imposto", imposto);
        Intent intent = new Intent(SegundaTela.this, TerceiraTela.class);
        intent.putExtras(informacao);
        startActivity(intent);
    }
}