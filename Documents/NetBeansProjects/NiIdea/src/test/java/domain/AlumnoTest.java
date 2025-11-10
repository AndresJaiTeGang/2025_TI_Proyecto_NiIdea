package domain;

import org.junit.jupiter.api.BeforeAll;
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
 * @author Andres
 * @version 1.0
 * @since 2025-10-02  
 */
public class AlumnoTest {

    private static Alumno alumno;

    /**
     * Inicializa un objeto Alumno antes de ejecutar las pruebas.
     */
    @BeforeAll
    public static void setUp() {
        alumno = new Alumno("TI22110372", "Andres Mendoza");
    }

    /**
     * Verifica que el constructor y los métodos getter funcionen correctamente.
     */
    @Test
    public void testConstructorYGetters() {
        assertAll("alumno",
                () -> assertEquals("TI22110372", alumno.getNoControl(), "Número de control incorrecto"),
                () -> assertEquals("Andres Mendoza", alumno.getNombre(), "Nombre incorrecto")
        );
    }

    /**
     * Verifica que los métodos setter actualicen correctamente los atributos.
     */
    @Test
    public void testSetters() {
        Alumno alumnoLocal = new Alumno("", "");

        alumnoLocal.setNoControl("TI22110000");
        alumnoLocal.setNombre("Juan Pérez");

        assertEquals("TI22110000", alumnoLocal.getNoControl(), "Setter de noControl no funcionó");
        assertEquals("Juan Pérez", alumnoLocal.getNombre(), "Setter de nombre no funcionó");
    }
}
