package com.aula1.atividadegrupomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashScreen extends AppCompatActivity {

    ImageView gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        gif = findViewById(R.id.gif);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                abrirSegundaTela();
            }
        },5000);

        Glide.with(SplashScreen.this)
                .load("https://gestaodeclinicas.ajmed.com.br/wp-content/uploads/2021/08/como-pagar-menos-imposto-na-clinica-medica.gif")
                .into(gif);
    }
    public void abrirSegundaTela(){
//        Abrindo a tela
        Intent intent = new Intent(SplashScreen.this, SegundaTela.class);
        startActivity(intent);
//        Finish fecha a tela
        finish();
    }
}