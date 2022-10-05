package com.example.litteltestevocacional2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class TelaLogin extends AppCompatActivity {
    private EditText email_login, senha_login;
    private Button entrar;
    CheckBox mostrarSenha;
    String[] mensagens = {"Preencha todos os campos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);
        //Intent irDireto = new Intent (this, TelaTeste.class);
        //startActivity(irDireto);
        getWindow().setStatusBarColor(Color.BLACK);
        getSupportActionBar().hide();
        mostrarSenha = findViewById(R.id.mostrarSenha);
        IniciarComponentes();
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = email_login.getText().toString();
                String senha = senha_login.getText().toString();

                if (email.isEmpty() || senha.isEmpty()){
                    Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_LONG);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }else {
                    AutenticarUsuario(v);
                }
            }
        });
    }

    private void AutenticarUsuario(View view){
        Intent sairIrTeste = new Intent(this, SairIrTeste.class);

        String email = email_login.getText().toString();
        String senha = senha_login.getText().toString();

        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    startActivity(sairIrTeste);
                }else {
                    String erro;

                    try {
                        throw task.getException();
                    }catch (Exception e){
                        erro = "Erro ao logar o usuário";
                    }
                    Snackbar snackbar = Snackbar.make(view,erro,Snackbar.LENGTH_LONG);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }
            }
        });
    }

    public void recuperarSenha(View r){

        String email = email_login.getText().toString();

        if (email.isEmpty()){
            email_login.setError("Você precisa inserir o seu email para recuperar a sua senha");
        }else{
            enviarEmail(email);
        }
    }

    private void enviarEmail(String email){
        FirebaseAuth.getInstance().sendPasswordResetEmail(email).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                Toast.makeText(getBaseContext(), "Enviamos uma mensagem para o seu email com um link para redefinição da senha", Toast.LENGTH_LONG).show();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getBaseContext(), "Erro ao enviar o email", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void IniciarComponentes(){
        email_login = findViewById(R.id.email);
        senha_login = findViewById(R.id.senha);
        entrar = findViewById(R.id.entrar);
    }

    public void mostrarSenha(View s) {
        if (mostrarSenha.isChecked()){
            senha_login.setInputType(InputType.TYPE_CLASS_TEXT);
        }else{
            senha_login.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
    }

    public void irTelaCadastro(View i){
        Intent go = new Intent(this, TelaCadastro.class);
        startActivity(go);
    }

}