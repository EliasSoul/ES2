package com.ecommerce;

public class Pedido {
    private int ID;
    private int produto_id;
    private String data;
    private int quantidade;
    private double valor_total;
    private String metodo_pagamento;

    public Pedido(int ID, int produto_id, String data, int quantidade, double valor_total, String metodo_pagamento) {
        this.ID = ID;
        this.produto_id = produto_id;
        this.data = data;
        this.quantidade = quantidade;
        this.valor_total = valor_total;
        this.metodo_pagamento = metodo_pagamento;
    }

    public int getID() {
        return ID;
    }

    public int getProduto_id() {
        return produto_id;
    }

    public String getData() {
        return data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return valor_total;
    }

    public String getMetodoPagamento() {
        return metodo_pagamento;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorTotal(double valor_total) {
        this.valor_total = valor_total;
    }

    public void setMetodoPagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }
}
