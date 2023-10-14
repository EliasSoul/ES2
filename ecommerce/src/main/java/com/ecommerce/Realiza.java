package com.ecommerce;

public class Realiza {
    private int pedido_id;
    private String cliente_cpf;

    public Realiza(int pedido_id, String cliente_cpf) {
        this.pedido_id = pedido_id;
        this.cliente_cpf = cliente_cpf;
    }

    public int getPedido_id() {
        return pedido_id;
    }

    public String getCliente_cpf() {
        return cliente_cpf;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public void setCliente_cpf(String cliente_cpf) {
        this.cliente_cpf = cliente_cpf;
    }
}
