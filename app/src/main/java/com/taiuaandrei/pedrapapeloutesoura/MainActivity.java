package com.taiuaandrei.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        findViewById(R.id.paper).setOnClickListener(this);
//        findViewById(R.id.stone).setOnClickListener(this);
//        findViewById(R.id.scissors).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("Teste","TESOURA");
//            }
//        });
    }

    private void selecionadoPedra(View view){
        this.opcaoSelecionada("PEDRA");
    }
    private void selecionadoPapel(View view){
        this.opcaoSelecionada("PAPEL");
    }
    private void selecionadoTesoura(View view) {
        this.opcaoSelecionada("TESOURA");
    }

    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView imageResultado = findViewById(R.id.imageResultado);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"PEDRA","PAPEL","TESOURA"};
        String opcaoApp = opcoes[numero];

        switch(opcaoApp){
            case "PEDRA":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "PAPEL":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "TESOURA":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        System.out.println("Item selecionado: " + opcaoApp);
    }

    @Override
    public void onClick(View v) {
        Log.i("Teste","SELECIONOU");
        switch (v.getId()){
            case R.id.paper:
                Log.i("Teste","PAPEL");
                break;
            case R.id.stone:
                Log.i("Teste","PEDRA");
                break;
        }
    }
}
