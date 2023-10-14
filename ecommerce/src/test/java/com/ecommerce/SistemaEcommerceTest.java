package com.ecommerce;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SistemaEcommerceTest {
    private SistemaEcommerce sistema;

    @Before
    public void setUp() {
        sistema = new SistemaEcommerce();
        // Adicione alguns dados de exemplo para testes
        Usuario usuario1 = new Usuario("12345678901", "João", "joao@email.com", "senha123", "1234567890", "2000-01-01", "cliente", "5.0");
        Usuario usuario2 = new Usuario("98765432101", "Maria", "maria@email.com", "senha456", "9876543210", "1999-12-31", "cliente", "4.8");
        Produto produto1 = new Produto(1, 1, "Produto 1", "Descrição do produto 1", 50.0, "Eletrônicos", "5.0");
        Loja loja1 = new Loja(1, "12345678901", "Loja do João", "1234567890", "Loja de eletrônicos");
        sistema.adicionarUsuario(usuario1);
        sistema.adicionarUsuario(usuario2);
        sistema.adicionarProduto(produto1);
        sistema.adicionarLoja(loja1);
    }

    @Test
    public void testAdicionarUsuario() {
        Usuario novoUsuario = new Usuario("99999999999", "Carlos", "carlos@email.com", "senha789", "9999999999", "2001-05-15", "cliente", "4.5");
        sistema.adicionarUsuario(novoUsuario);

        Usuario usuarioEncontrado = sistema.buscarUsuarioPorCPF("99999999999");
        assertNotNull(usuarioEncontrado); // Verifica se o usuário foi adicionado
    }

    @Test
    public void testAdicionarProduto() {
        Produto novoProduto = new Produto(2, 1, "Produto 2", "Descrição do produto 2", 60.0, "Eletrônicos", "4.7");
        sistema.adicionarProduto(novoProduto);

        Produto produtoEncontrado = sistema.buscarProdutoPorID(2);
        assertNotNull(produtoEncontrado); // Verifica se o produto foi adicionado
    }

    @Test
    public void testAdicionarLoja() {
        Loja novaLoja = new Loja(2, "98765432101", "Loja da Maria", "9876543210", "Loja de roupas");
        sistema.adicionarLoja(novaLoja);

        Loja lojaEncontrada = sistema.buscarLojaPorID(2);
        assertNotNull(lojaEncontrada); // Verifica se a loja foi adicionada
    }

    @Test
    public void testCriarPedido() {
        Usuario usuario = sistema.buscarUsuarioPorCPF("12345678901");
        Produto produto = sistema.buscarProdutoPorID(1);

        sistema.criarPedido(usuario, produto, 2, "Visa");

        Pedido pedido = sistema.buscarPedidoPorID(1);
        assertNotNull(pedido); // Verifica se o pedido foi criado
    }

     // Teste para atualizar informações de um produto
     @Test
     public void testAtualizarProduto() {
         Produto produto = sistema.buscarProdutoPorID(1);
         produto.setNome("Novo Nome do Produto");
         sistema.atualizarProduto(produto);
         assertEquals("Novo Nome do Produto", sistema.buscarProdutoPorID(1).getNome());
     }
 
     // Teste para excluir um produto
     @Test
     public void testExcluirProduto() {
         Produto produto = sistema.buscarProdutoPorID(1);
         sistema.excluirProduto(produto);
         assertNull(sistema.buscarProdutoPorID(1));
     }
 
     // Teste para criar um pedido associado a um usuário e produto
     @Test
     public void testCriarPedidoAssociado() {
         Usuario usuario = sistema.buscarUsuarioPorCPF("12345678901");
         Produto produto = sistema.buscarProdutoPorID(1);
         sistema.criarPedido(usuario, produto, 2, "Visa");
         Pedido pedido = sistema.buscarPedidoPorID(1);
         assertNotNull(pedido);
     }

}
