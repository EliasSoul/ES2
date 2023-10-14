package com.ecommerce;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

public class ProdutoTest {
    private List<Produto> produtos;

    @Before
    public void setUp() {
        produtos = new ArrayList<>();
        // Alguns produtos de exemplo para testes
        Produto produto1 = new Produto(1, 1, "Produto 1", "Descrição do Produto 1", 10.0, "Eletrônicos", "4.5");
        Produto produto2 = new Produto(2, 2, "Produto 2", "Descrição do Produto 2", 20.0, "Roupas", "4.2");
        produtos.add(produto1);
        produtos.add(produto2);
    }

    @Test
    public void testAdicionarProduto() {
        Produto produtoNovo = new Produto(3, 3, "Produto 3", "Descrição do Produto 3", 15.0, "Acessórios", "4.7");
        produtos.add(produtoNovo);

        assertEquals(3, produtos.size()); // Verifica se o produto foi adicionado com sucesso
    }

    @Test
    public void testBuscarProdutoPorIDExistente() {
        Produto produtoEncontrado = null;
        for (Produto produto : produtos) {
            if (produto.getID() == 1) {
                produtoEncontrado = produto;
                break;
            }
        }

        assertNotNull(produtoEncontrado); // Verifica se o produto foi encontrado
        assertEquals("Produto 1", produtoEncontrado.getNome()); // Verifica se o nome do produto é correto
    }

    @Test
    public void testBuscarProdutoPorIDNaoExistente() {
        Produto produtoEncontrado = null;
        for (Produto produto : produtos) {
            if (produto.getID() == 999) {
                produtoEncontrado = produto;
                break;
            }
        }

        assertNull(produtoEncontrado); // Verifica que o produto não foi encontrado
    }

    @Test
    public void testSettersEGetters() {
        Produto produto = new Produto(3, 4, "Produto 4", "Descrição do Produto 4", 30.0, "Livros", "4.9");

        produto.setPreco(25.0);
        assertEquals(25.0, produto.getPreco(), 0.001); // O terceiro argumento é a margem de erro

        produto.setCategoria("Eletrônicos");
        assertEquals("Eletrônicos", produto.getCategoria());
    }

}
