package com.aula1.atividadegrupomobile;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class QuartaTela extends AppCompatActivity {
    Button informacoes, download;
    ImageView imagem;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta_tela);
// Tela de informações
        informacoes = findViewById(R.id.informacoes);
        download = findViewById(R.id.download);
        imagem = findViewById(R.id.imageView);
        informacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle linkBotao = new Bundle();
                linkBotao.putString("url", "https://www.gov.br/receitafederal/pt-br");
                Intent intent = new Intent(QuartaTela.this, TelaWebView.class);
                intent.putExtras(linkBotao);
                startActivity(intent);
            }
        });
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle linkBotao = new Bundle();
                linkBotao.putString("url", ": https://www.gov.br/receitafederal/pt-br/centrais-deconteudo/download/pgd/dirpf");
                Intent intent = new Intent(QuartaTela.this, TelaWebView.class);
                intent.putExtras(linkBotao);
                startActivity(intent);
            }
        });

        Bundle linkBotao = getIntent().getExtras();
        boolean mensal = linkBotao.getBoolean("mensal");
        if (mensal == true) {
//            imagem.setImageResource(R.drawable.mensal);
        }else {
//            imagem.setImageResource(R.drawable.anual);
        }
    }
}