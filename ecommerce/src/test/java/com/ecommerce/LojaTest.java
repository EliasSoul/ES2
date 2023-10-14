package com.ecommerce;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class LojaTest {
    private List<Loja> lojas;

    @Before
    public void setUp() {
        lojas = new ArrayList<>();
        // Algumas lojas de exemplo para testes
        Loja loja1 = new Loja(1, "12345678901", "Loja 1", "1234567890", "Descrição da Loja 1");
        Loja loja2 = new Loja(2, "98765432101", "Loja 2", "9876543210", "Descrição da Loja 2");
        lojas.add(loja1);
        lojas.add(loja2);
    }

    @Test
    public void testAdicionarLoja() {
        Loja lojaNova = new Loja(3, "11112222333", "Loja 3", "9876543210", "Descrição da Loja 3");
        lojas.add(lojaNova);

        assertEquals(3, lojas.size()); // Verifica se a loja foi adicionada com sucesso
    }

    @Test
    public void testBuscarLojaPorIDExistente() {
        Loja lojaEncontrada = null;
        for (Loja loja : lojas) {
            if (loja.getID() == 1) {
                lojaEncontrada = loja;
                break;
            }
        }

        assertNotNull(lojaEncontrada); // Verifica se a loja foi encontrada
        assertEquals("Loja 1", lojaEncontrada.getNome()); // Verifica se o nome da loja é correto
    }

    @Test
    public void testBuscarLojaPorIDNaoExistente() {
        Loja lojaEncontrada = null;
        for (Loja loja : lojas) {
            if (loja.getID() == 999) {
                lojaEncontrada = loja;
                break;
            }
        }

        assertNull(lojaEncontrada); // Verifica que a loja não foi encontrada
    }

    @Test
    public void testSettersEGetters() {
        Loja loja = new Loja(3, "44445555666", "Loja 4", "1234567890", "Descrição da Loja 4");

        loja.setNome("Nova Loja 4");
        assertEquals("Nova Loja 4", loja.getNome());

        loja.setTelefone("9876543210");
        assertEquals("9876543210", loja.getTelefone());
    }

    // Outros testes podem ser adicionados conforme necessário
}
