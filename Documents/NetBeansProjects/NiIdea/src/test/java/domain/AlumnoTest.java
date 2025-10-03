package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase {@link Alumno}.
 *
 * Proyecto: NiIdea
 * Materia: Taller de Investigación 1
 * Periodo: Agosto-Diciembre 2025
 * Docente: FJMP
 * Programador: Andres Mendoza
 * Fecha: 02/10/2025
 *
 * Esta clase verifica el correcto funcionamiento del constructor,
 * los métodos getter y setter de la clase Alumno.
 *
 * @author Andres Mendoza
 * @version 1.0
 * @since 2025-10-02
 */
public class AlumnoTest {

    /**
     * Verifica que el constructor y los métodos getter funcionen correctamente.
     */
    @Test
    public void testContructorYGetters() {
        Alumno alumno = new Alumno("TI22110372", "Andres");
        assertEquals("TI22110372", alumno.getNoControl());
        assertEquals("Andres", alumno.getNombre());
    }

    /**
     * Verifica que los métodos setter actualicen correctamente los atributos.
     */
    @Test
    public void testSetters() {
        Alumno alumno = new Alumno("", "");

        alumno.setNoControl("TI22110372");
        alumno.setNombre("Andres Mendoza");

        assertEquals("TI22110372", alumno.getNoControl());
        assertEquals("Andres Mendoza", alumno.getNombre());
    }
}