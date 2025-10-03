package domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
*   ITESS-TICS TInvestigación 1
*   Agosto-Diciembre 2025
*   Proyecto NiIdea
*   Clase LogroTest: utilizada para realizar un testing para la clase Logro
*   Docente: FJMP
*   Programador: Andres Mendoza
*   Fecha: 02/10/2025
*/
public class LogroTest {
    @Test
    public void TestConstructorYGetters() {
        Logro logro = new Logro (1, "Curso", "Scrum Master");
        assertEquals(1, logro.getId());
        assertEquals("Curso", logro.getCategoria());
        assertEquals("Scrum Master", logro.getDescripcion());
    }
    
    @Test
    public void testSetters() {
        Logro logro = new Logro(0, "", "");

        logro.setId(2);
        logro.setCategoria("Certificacion");
        logro.setDescripcion("Java");

        assertEquals(2, logro.getId());
        assertEquals("Certificacion", logro.getCategoria());
        assertEquals("Java", logro.getDescripcion());
    }

}
