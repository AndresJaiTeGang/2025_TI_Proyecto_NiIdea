package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase {@link Usuario}.
 *
 * Proyecto: NiIdea
 * Materia: Taller de Investigación 1
 * Periodo: Agosto-Diciembre 2025
 * Docente: FJMP
 * Programador: Andres Mendoza
 * Fecha: 02/10/2025
 *
 * Esta clase verifica el correcto funcionamiento del constructor,
 * así como los métodos getter y setter de la clase Usuario.
 *
 * @author Andres
 * @version 1.1
 * @since 2025-10-02
 */
public class UsuariosTest {

    /**
     * Clase auxiliar concreta que extiende Usuario
     * para poder realizar pruebas unitarias sobre sus métodos.
     */
    private static class UsuarioConcreto extends Usuario {
        public UsuarioConcreto(String nombre, String ndu, String clave) {
            super(nombre, ndu, clave);
        }
    }

    /**
     * Verifica que el constructor y los métodos getter funcionen correctamente.
     */
    @Test
    public void testConstructorYGetters() {
        Usuario usuario = new UsuarioConcreto("Andres", "amendoza", "1234");

        assertEquals("Andres", usuario.getNombre());
        assertEquals("amendoza", usuario.getNdu());
        assertEquals("1234", usuario.getClave());
    }

    /**
     * Verifica que los métodos setter actualicen correctamente los atributos.
     */
    @Test
    public void testSetters() {
        Usuario usuario = new UsuarioConcreto("", "", "");

        usuario.setNombre("Juan Pérez");
        usuario.setNdu("jperez");
        usuario.setClave("abcd");

        assertEquals("Juan Pérez", usuario.getNombre());
        assertEquals("jperez", usuario.getNdu());
        assertEquals("abcd", usuario.getClave());
    }
}
