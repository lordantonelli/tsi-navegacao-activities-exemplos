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

        // Recuperando o objeto Pessoa que foi armazenado dentro do intent
        Pessoa p = (Pessoa) i.getSerializableExtra("pessoa");

        // Colocando as informações recuperadas na interface gráfica
        lblNome.setText(p.getNome());
        lblEmail.setText(p.getEmail());
        lblSexo.setText(p.getSexo());
    }
}