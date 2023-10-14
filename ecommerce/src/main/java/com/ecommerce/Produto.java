package com.ecommerce;

public class Produto {
    private int ID;
    private int loja_id;
    private String nome;
    private String descricao;
    private double preco;
    private String categoria;
    private String classificacao;

    public Produto(int ID, int loja_id, String nome, String descricao, double preco, String categoria, String classificacao) {
        this.ID = ID;
        this.loja_id = loja_id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.classificacao = classificacao;
    }

    public int getID() {
        return ID;
    }

    public int getLoja_id() {
        return loja_id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setLoja_id(int loja_id) {
        this.loja_id = loja_id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
