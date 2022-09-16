package com.example.navegaoactivities.navegaoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnPreencher;
    private TextView lblNome;
    private TextView lblEmail;
    private TextView lblSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPreencher = (Button) findViewById( R.id.btnPreenche );
        lblNome = (TextView) findViewById( R.id.lblNome );
        lblEmail = (TextView) findViewById( R.id.lblEmail );
        lblSexo = (TextView) findViewById( R.id.lblSexo );

        btnPreencher.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Criando o intent para chamar a outra activity
                Intent i = new Intent(getApplicationContext(), OutraActivity.class);

                // Chamando a outra activity, de forma a obter resposta
                startActivityForResult(i, 1);
            }
        } );
    }

    // O método abaixo vai ser chamado automaticamente quando a 2a activity
    // encerrar, para pegar as informacoes
    public void onActivityResult(int requestCode, int resultCode, Intent i) {
        super.onActivityResult(requestCode, resultCode, i);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                lblNome.setText(i.getStringExtra("nome"));
                lblEmail.setText(i.getStringExtra("email"));
                lblSexo.setText(i.getStringExtra("sexo"));
            }
        }
    }
}