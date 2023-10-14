package com.ecommerce;

public class Loja {
    private int ID;
    private String administrador_cpf;
    private String nome;
    private String telefone;
    private String descricao;

    public Loja(int ID, String administrador_cpf, String nome, String telefone, String descricao) {
        this.ID = ID;
        this.administrador_cpf = administrador_cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.descricao = descricao;
    }

    public int getID() {
        return ID;
    }

    public String getAdministrador_cpf() {
        return administrador_cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAdministrador_cpf(String administrador_cpf) {
        this.administrador_cpf = administrador_cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
