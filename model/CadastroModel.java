package com.example.demo.model;



public class CadastroModel {
     int id;
     String nome;
     String telefone;

    public CadastroModel(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
      
    }

    public int getId(){
        return id;
    }


    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

}




