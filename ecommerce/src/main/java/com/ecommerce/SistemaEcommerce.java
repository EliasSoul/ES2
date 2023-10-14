package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class SistemaEcommerce {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private List<Loja> lojas = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();
    private List<Realiza> realizas = new ArrayList<>();

       // Método para adicionar um usuário
       public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para buscar um usuário pelo CPF
    public Usuario buscarUsuarioPorCPF(String CPF) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCPF().equals(CPF)) {
                return usuario;
            }
        }
        return null; // Usuário não encontrado
    }

    // Método para adicionar um produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

     // Buscar produto por ID
     public Produto buscarProdutoPorID(int id) {
        for (Produto produto : produtos) {
            if (produto.getID() == id) {
                return produto;
            }
        }
        return null; // Retorna null se o produto não for encontrado
    }

    //Atualizar produto
    public void atualizarProduto(Produto produtoAtualizado) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoExistente = produtos.get(i);
            if (produtoExistente.getID() == produtoAtualizado.getID()) {
                // Produto encontrado, atualize os campos necessários
                produtoExistente.setNome(produtoAtualizado.getNome());
                produtoExistente.setDescricao(produtoAtualizado.getDescricao());
                produtoExistente.setPreco(produtoAtualizado.getPreco());
                produtoExistente.setCategoria(produtoAtualizado.getCategoria());
                produtoExistente.setClassificacao(produtoAtualizado.getClassificacao());
    
                // Atualize o produto na lista
                produtos.set(i, produtoExistente);
                break; // Saia do loop, pois encontramos o produto
            }
        }
    }
    
    //Excluir produto
    public void excluirProduto(Produto produto) {
        produtos.remove(produto);
    }
    
    // Método para adicionar uma loja
    public void adicionarLoja(Loja loja) {
        lojas.add(loja);
    }

    // Buscar loja por ID
    public Loja buscarLojaPorID(int id) {
        for (Loja loja : lojas) {
            if (loja.getID() == id) {
                return loja;
            }
        }
        return null; // Retorna null se a loja não for encontrada
    }

    // Método para criar um pedido e associá-lo a um usuário
    public void criarPedido(Usuario usuario, Produto produto, int quantidade, String metodoPagamento) {
        Pedido pedido = new Pedido(pedidos.size() + 1, produto.getID(), "data_do_pedido", quantidade, produto.getPreco() * quantidade, metodoPagamento);
        pedidos.add(pedido);

        // Associar o pedido ao usuário que o realizou
        Realiza realiza = new Realiza(pedido.getID(), usuario.getCPF());
        realizas.add(realiza);
    }

    // Buscar pedido por ID
    public Pedido buscarPedidoPorID(int id) {
        for (Pedido pedido : pedidos) {
            if (pedido.getID() == id) {
                return pedido;
            }
        }
        return null; // Retorna null se o pedido não for encontrado
    }

    // Realizar ação (Exemplo: Registrar que um cliente realizou um pedido)
    public void realizarAcao(Realiza realizacao) {
        realizas.add(realizacao);
    }

    public static void main(String[] args) {
        // Exemplo de utilização do sistema
        SistemaEcommerce sistema = new SistemaEcommerce();

        // Criação de usuários
        Usuario usuario1 = new Usuario("12345678901", "João", "joao@email.com", "senha123", "1234567890", "2000-01-01", "cliente", "5.0");
        Usuario usuario2 = new Usuario("98765432101", "Maria", "maria@email.com", "senha456", "9876543210", "1999-12-31", "cliente", "4.8");

        sistema.adicionarUsuario(usuario1);
        sistema.adicionarUsuario(usuario2);

        // Outras operações podem ser realizadas de maneira semelhante
    }

}
