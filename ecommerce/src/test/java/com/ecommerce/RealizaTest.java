package com.ecommerce;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class RealizaTest {
    private List<Realiza> realizas;

    @Before
    public void setUp() {
        realizas = new ArrayList<>();
        // Adicione algumas realizações de exemplo para testes
        Realiza realiza1 = new Realiza(1, "12345678901");
        Realiza realiza2 = new Realiza(2, "98765432101");
        realizas.add(realiza1);
        realizas.add(realiza2);
    }

    @Test
    public void testAdicionarRealiza() {
        Realiza realizaNova = new Realiza(3, "11112222333");
        realizas.add(realizaNova);

        assertEquals(3, realizas.size()); // Verifica se a realização foi adicionada com sucesso
    }

    @Test
    public void testBuscarRealizaPorPedidoExistente() {
        Realiza realizaEncontrada = null;
        for (Realiza realiza : realizas) {
            if (realiza.getPedido_id() == 1) {
                realizaEncontrada = realiza;
                break;
            }
        }

        assertNotNull(realizaEncontrada); // Verifica se a realização foi encontrada
        assertEquals("12345678901", realizaEncontrada.getCliente_cpf()); // Verifica se o CPF do cliente é correto
    }

    @Test
    public void testBuscarRealizaPorPedidoNaoExistente() {
        Realiza realizaEncontrada = null;
        for (Realiza realiza : realizas) {
            if (realiza.getPedido_id() == 999) {
                realizaEncontrada = realiza;
                break;
            }
        }

        assertNull(realizaEncontrada); // Verifica que a realização não foi encontrada
    }
}
