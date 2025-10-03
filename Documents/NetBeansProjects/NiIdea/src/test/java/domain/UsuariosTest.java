package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase {@link Usuarios}.
 *
 * Proyecto: NiIdea
 * Materia: Taller de Investigación 1
 * Periodo: Agosto-Diciembre 2025
 * Docente: FJMP
 * Programador: Andres Mendoza
 * Fecha: 02/10/2025
 *
 * Esta clase verifica el correcto funcionamiento del constructor,
 * así como los métodos getter y setter de la clase Usuarios.
 *
 * @author Andres Mendoza
 * @version 1.0
 * @since 2025-10-02
 */
public class UsuariosTest {

    /**
     * Verifica que el constructor y los métodos getter funcionen correctamente.
     */
    @Test
    public void testConstructorYGetters() {
        Usuarios usuario = new Usuarios(1, "Alumno");

        assertEquals(1, usuario.getId());
        assertEquals("Alumno", usuario.getNombre());
    }

    /**
     * Verifica que los métodos setter actualicen correctamente los atributos.
     */
    @Test
    public void testSetters() {
        Usuarios usuario = new Usuarios(0, "");

        usuario.setId(2);
        usuario.setNombre("Profesor");

        assertEquals(2, usuario.getId());
        assertEquals("Profesor", usuario.getNombre());
    }
}