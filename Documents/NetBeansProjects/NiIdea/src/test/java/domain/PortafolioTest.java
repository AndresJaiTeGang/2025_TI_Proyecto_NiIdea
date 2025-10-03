package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase {@link Portafolio}.
 *
 * Proyecto: NiIdea
 * Materia: Taller de Investigación 1
 * Periodo: Agosto-Diciembre 2025
 * Docente: FJMP
 * Programador: Andres Mendoza
 * Fecha: 02/10/2025
 *
 * Esta clase verifica el correcto funcionamiento del constructor,
 * así como los métodos getter y setter de la clase Portafolio.
 *
 * @author Andres Mendoza
 * @version 1.0
 * @since 2025-10-02
 */
public class PortafolioTest {

    /**
     * Verifica que el constructor y los métodos getter funcionen correctamente.
     */
    @Test
    public void testConstructorYGetters() {
        Portafolio portafolio = new Portafolio(1, "Andres", "Excelente");
        assertEquals(1, portafolio.getId());
        assertEquals("Andres", portafolio.getNombre());
        assertEquals("Excelente", portafolio.getValor());
    }

    /**
     * Verifica que los métodos setter actualicen correctamente los atributos.
     */
    @Test
    public void testSetters() {
        Portafolio portafolio = new Portafolio(0, "", "");
        portafolio.setId(2);
        portafolio.setNombre("Andres Mendoza");
        portafolio.setValor("Bueno");

        assertEquals(2, portafolio.getId());
        assertEquals("Andres Mendoza", portafolio.getNombre());
        assertEquals("Bueno", portafolio.getValor());
    }
}