package com.example.litteltestevocacional2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class TelaAntesTeste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_antes_teste);
        getWindow().setStatusBarColor(Color.BLACK);
        getSupportActionBar().hide();
    }

    public void irTeste(View i){
        Intent irTeste = new Intent(this, TelaTeste.class);
        startActivity(irTeste);
    }
}