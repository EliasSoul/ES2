package com.ecommerce;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class UsuarioTest {
    private List<Usuario> usuarios;
     // Alguns usuários de exemplo para testes
    @Before
    public void setUp() {
        usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario("12345678901", "João", "joao@email.com", "senha123", "1234567890", "2000-01-01", "cliente", "5.0");
        Usuario usuario2 = new Usuario("98765432101", "Maria", "maria@email.com", "senha456", "9876543210", "1999-12-31", "cliente", "4.8");
        usuarios.add(usuario1);
        usuarios.add(usuario2);
    }

    @Test
    public void testAdicionarUsuario() {
        Usuario usuarioNovo = new Usuario("11112222333", "Carlos", "carlos@email.com", "senhacarlos", "9876543210", "1998-11-15", "cliente", "4.5");
        usuarios.add(usuarioNovo);

        assertEquals(3, usuarios.size()); // Verifica se o usuário foi adicionado com sucesso
    }

    @Test
    public void testBuscarUsuarioPorCPFExistente() {
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getCPF().equals("12345678901")) {
                usuarioEncontrado = usuario;
                break;
            }
        }

        assertNotNull(usuarioEncontrado); // Verifica se o usuário foi encontrado
        assertEquals("João", usuarioEncontrado.getNome()); // Verifica se o nome do usuário é correto
    }

    @Test
    public void testBuscarUsuarioPorCPFNaoExistente() {
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getCPF().equals("99999999999")) {
                usuarioEncontrado = usuario;
                break;
            }
        }

        assertNull(usuarioEncontrado); // Verifica que o usuário não foi encontrado
    }

    @Test
    public void testSettersEGetters() {
        Usuario usuario = new Usuario("11112222333", "Carlos", "carlos@email.com", "senhacarlos", "9876543210", "1998-11-15", "cliente", "4.5");

        usuario.setSenha("novasenha");
        assertEquals("novasenha", usuario.getSenha());

        usuario.setClassificacao("3.7");
        assertEquals("3.7", usuario.getClassificacao());
    }
}
