package com.example.navegaoactivities.navegaoactivities;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;
    private String email;
    private String sexo;

    public Pessoa(String nome, String email, String sexo) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSexo() {
        return sexo;
    }
}
