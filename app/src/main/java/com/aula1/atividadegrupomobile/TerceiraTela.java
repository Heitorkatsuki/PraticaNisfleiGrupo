package com.aula1.atividadegrupomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TerceiraTela extends AppCompatActivity {
    TextView impostoUsuario;
    Button btnTabelaMensal, btnTabelaAnual;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);

        btnTabelaMensal = findViewById(R.id.btnTabelaMensal);
        btnTabelaAnual = findViewById(R.id.btnTabelaAnual);
        Bundle bundle = getIntent().getExtras();

        double imposto = bundle.getDouble("imposto");

        impostoUsuario = findViewById(R.id.impostoUsuario);
        impostoUsuario.setText(String.valueOf(imposto));


    }
}