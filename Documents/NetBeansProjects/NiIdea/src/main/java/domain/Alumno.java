package domain;

/**
 * Representa a un alumno dentro del proyecto NiIdea. Contiene información
 * básica como número de control y nombre.
 *
 * Proyecto: NiIdea Materia: Taller de Investigación 1 Periodo: Agosto-Diciembre
 * 2025 Docente: FJMP Programador: Andres Mendoza Fecha: 02/10/2025
 *
 * @author Andres Mendoza
 * @version 1.0
 * @since 2025-10-02
 */
public class Alumno extends Usuario {

    private String ndc;

    public Alumno(String ndc, String nombre, String ndu, String clave) {
        super(nombre, ndu, clave);
        this.ndc = ndc;
    }

    public String getNdc() {
        return ndc;
    }

}
