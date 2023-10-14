package com.ecommerce;

public class Usuario {
    private String CPF;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String nascimento;
    private String tipo;
    private String classificacao;

    public Usuario(String CPF, String nome, String email, String senha, String telefone, String nascimento, String tipo, String classificacao) {
        this.CPF = CPF;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.tipo = tipo;
        this.classificacao = classificacao;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getTipo() {
        return tipo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

}
