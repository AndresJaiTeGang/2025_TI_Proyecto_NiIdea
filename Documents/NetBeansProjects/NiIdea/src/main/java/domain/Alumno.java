package domain;

/**
 * Representa a un alumno dentro del proyecto NiIdea.
 * Contiene información básica como número de control y nombre.
 *
 * Proyecto: NiIdea
 * Materia: Taller de Investigación 1
 * Periodo: Agosto-Diciembre 2025
 * Docente: FJMP
 * Programador: Andres Mendoza
 * Fecha: 02/10/2025
 *
 * @author Andres Mendoza
 * @version 1.0
 * @since 2025-10-02
 */
public class Alumno {
    private String NoControl;
    private String Nombre;

    /**
     * Establece el número de control del alumno.
     *
     * @param NoControl Número de control único del alumno.
     */
    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }

    /**
     * Establece el nombre del alumno.
     *
     * @param Nombre Nombre completo del alumno.
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Obtiene el número de control del alumno.
     *
     * @return Número de control del alumno.
     */
    public String getNoControl() {
        return NoControl;
    }

    /**
     * Obtiene el nombre del alumno.
     *
     * @return Nombre del alumno.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Constructor que inicializa un objeto Alumno con su número de control y nombre.
     *
     * @param NoControl Número de control del alumno.
     * @param Nombre Nombre del alumno.
     */
    public Alumno(String NoControl, String Nombre) {
        this.NoControl = NoControl;
        this.Nombre = Nombre;
    }
}