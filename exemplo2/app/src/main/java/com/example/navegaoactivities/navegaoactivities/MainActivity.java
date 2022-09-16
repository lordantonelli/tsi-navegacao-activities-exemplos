package com.example.navegaoactivities.navegaoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText txtNome;
    private EditText txtEmail;
    private RadioGroup radioGroupSexo;
    private RadioButton radM;
    private RadioButton radF;
    private Button btnVai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);
        radioGroupSexo = findViewById(R.id.radioGroupSexo);
        radM = findViewById(R.id.radM);
        radF = findViewById(R.id.radF);
        btnVai = findViewById(R.id.btnVai);

        btnVai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Váriaveis para armazenar os dados a serem enviados
                // para a outra activity
                String nome, email, sexo;

                // Pegando as informações que foram digitadas pelo usuário
                nome = txtNome.getText().toString();
                email = txtEmail.getText().toString();

                // Pegando o sexo escolhido
                int s = radioGroupSexo.getCheckedRadioButtonId();

                if (s == -1) {
                    sexo = "Sexo não escolhido";
                } else if (s == R.id.radM) {
                    sexo = "Masculino";
                } else {
                    sexo = "Feminino";
                }

                // Criando o intent para abrir a outra activity
                Intent i = new Intent(getApplicationContext(), OutraActivity.class);

                // Colocando os dados dentro do intent como pares chave/valor
                i.putExtra("nome", nome);
                i.putExtra("email", email);
                i.putExtra("sexo", sexo);

                // Iniciando a outra activity
                startActivity(i);
            }
        });
    }

}