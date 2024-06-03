package com.aula1.atividadegrupomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class TerceiraTela extends AppCompatActivity {
    TextView impostoUsuario;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);
        Bundle bundle = getIntent().getExtras();

        double imposto = bundle.getDouble("imposto");

        impostoUsuario = findViewById(R.id.impostoUsuario);
        impostoUsuario.setText(String.valueOf(imposto));
    }
}