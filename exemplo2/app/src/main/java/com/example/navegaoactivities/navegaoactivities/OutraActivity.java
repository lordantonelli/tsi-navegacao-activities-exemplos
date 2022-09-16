package com.example.navegaoactivities.navegaoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OutraActivity extends AppCompatActivity {

    private TextView lblNome;
    private TextView lblEmail;
    private TextView lblSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outra);

        lblNome = findViewById(R.id.lblNome);
        lblEmail = findViewById(R.id.lblEmail);
        lblSexo = findViewById(R.id.lblSexo);

        // Recuperando o objeto Intent que criou esta activity
        Intent i = getIntent();

        // Recuperando os dados inseridos dentro do Intent
        // Acessamos a chave, retorna o valor armazenado
        String nome = i.getStringExtra("nome");
        String email = i.getStringExtra("email");
        String sexo = i.getStringExtra("sexo");

        // Colocando as informações recuperadas na interface gráfica
        lblNome.setText( nome );
        lblEmail.setText( email );
        lblSexo.setText( sexo );
    }
}