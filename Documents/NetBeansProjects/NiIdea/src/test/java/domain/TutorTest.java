package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase {@link Tutor}.
 *
 * Proyecto: NiIdea  
 * Materia: Taller de Investigación 1  
 * Periodo: Agosto-Diciembre 2025  
 * Docente: FJMP  
 * Programador: Andres Mendoza  
 * Fecha: 02/10/2025
 *
 * Esta clase verifica el correcto funcionamiento del constructor,
 * así como los métodos getter y setter de la clase Tutor.
 *
 * @author Andres Mendoza
 * @version 1.0
 * @since 2025-10-02
 */
public class TutorTest {

    /**
     * Verifica que el constructor y los métodos getter funcionen correctamente.
     */
    @Test
    public void testConstructorYGetters() {
        Tutor tutor = new Tutor(1, "Juan", "Andres");

        assertEquals(1, tutor.getId());
        assertEquals("Juan", tutor.getNombre());
        assertEquals("Andres", tutor.getNombreAlumno());
    }

    /**
     * Verifica que los métodos setter actualicen correctamente los atributos.
     */
    @Test
    public void testSetters() {
        Tutor tutor = new Tutor(0, "", "");

        tutor.setId(2);
        tutor.setNombre("Jose");
        tutor.setNombreAlumno("Mendoza");

        assertEquals(2, tutor.getId());
        assertEquals("Jose", tutor.getNombre());
        assertEquals("Mendoza", tutor.getNombreAlumno());
    }
}