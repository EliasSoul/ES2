package com.ecommerce;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class PedidoTest {
    private List<Pedido> pedidos;

    @Before
    public void setUp() {
        pedidos = new ArrayList<>();
        // Adicione alguns pedidos de exemplo para testes
        Pedido pedido1 = new Pedido(1, 1, "data_do_pedido1", 3, 30.0, "Visa");
        Pedido pedido2 = new Pedido(2, 2, "data_do_pedido2", 2, 40.0, "Mastercard");
        pedidos.add(pedido1);
        pedidos.add(pedido2);
    }

    @Test
    public void testAdicionarPedido() {
        Pedido pedidoNovo = new Pedido(3, 3, "data_do_pedido3", 4, 50.0, "Elo");
        pedidos.add(pedidoNovo);

        assertEquals(3, pedidos.size()); // Verifica se o pedido foi adicionado com sucesso
    }

    @Test
    public void testBuscarPedidoPorIDExistente() {
        Pedido pedidoEncontrado = null;
        for (Pedido pedido : pedidos) {
            if (pedido.getID() == 1) {
                pedidoEncontrado = pedido;
                break;
            }
        }

        assertNotNull(pedidoEncontrado); // Verifica se o pedido foi encontrado
        assertEquals("data_do_pedido1", pedidoEncontrado.getData()); // Verifica se a data do pedido é correta
    }

    @Test
    public void testBuscarPedidoPorIDNaoExistente() {
        Pedido pedidoEncontrado = null;
        for (Pedido pedido : pedidos) {
            if (pedido.getID() == 999) {
                pedidoEncontrado = pedido;
                break;
            }
        }

        assertNull(pedidoEncontrado); // Verifica que o pedido não foi encontrado
    }

    @Test
    public void testSettersEGetters() {
        Pedido pedido = new Pedido(3, 4, "data_do_pedido4", 1, 10.0, "Visa");

        pedido.setMetodoPagamento("Mastercard");
        assertEquals("Mastercard", pedido.getMetodoPagamento());

        pedido.setQuantidade(5);
        assertEquals(5, pedido.getQuantidade());

        pedido.setValorTotal(25.0);
        assertEquals(25.0, pedido.getValorTotal(), 0.001); // O terceiro argumento é a margem de erro
    }
}
