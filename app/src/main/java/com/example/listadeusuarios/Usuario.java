package com.example.listadeusuarios;


public class Usuario {

    public void setNome(String nome) {
        this.nome = nome;
    }

    String nome;
    int idade;
    String CPF;
    String email;
    String telefone;

    public Usuario(String nome, String CPF, String email, String telefone, int idade){
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }



}
