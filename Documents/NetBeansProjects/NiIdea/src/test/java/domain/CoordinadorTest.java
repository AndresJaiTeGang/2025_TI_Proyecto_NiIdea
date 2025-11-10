package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase {@link Coordinador}.
 *
 * Proyecto: NiIdea  
 * Materia: Taller de Investigación 1  
 * Periodo: Agosto-Diciembre 2025  
 * Docente: FJMP  
 * Programador: Andres Mendoza  
 * Fecha: 02/10/2025
 *
 * Esta clase verifica el correcto funcionamiento del constructor,
 * así como los métodos getter y setter de la clase Coordinador.
 *
 * @author Andres Mendoza
 * @version 1.0
 * @since 2025-10-02
 */
public class CoordinadorTest {

    /**
     * Verifica que el constructor y los métodos getter funcionen correctamente.
     */
    @Test
    public void testConstructorYGetters() {
        Coordinador coordinador = new Coordinador(1, "Alex");

        assertEquals(1, coordinador.getId());
        assertEquals("Alex", coordinador.getNombre());
    }

    /**
     * Verifica que los métodos setter actualicen correctamente los atributos.
     */
    @Test
    public void testSetters() {
        Coordinador coordinador = new Coordinador(3, "");

        coordinador.setId(2);
        coordinador.setNombre("Joaquin");

        assertEquals(2, coordinador.getId());
        assertEquals("Joaquin", coordinador.getNombre());
    }
}