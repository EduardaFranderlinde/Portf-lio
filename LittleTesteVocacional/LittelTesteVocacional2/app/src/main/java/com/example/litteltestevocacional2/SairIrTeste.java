package com.example.litteltestevocacional2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SairIrTeste extends AppCompatActivity {
    Button irTeste, saiApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sair_ir_teste);
        getWindow().setStatusBarColor(Color.BLACK);
        getSupportActionBar().hide();
        irTeste = findViewById(R.id.irTeste);
    }

    public void irTeste(View p){
        Intent irTeste = new Intent(this, TelaAntesTeste.class);
        startActivity(irTeste);
    }
}