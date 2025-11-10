package domain;

/**
 * Representa a un alumno dentro del proyecto NiIdea. 
 * Contiene información básica como número de control (matrícula) y nombre.
 *
 * Proyecto: NiIdea 
 * Materia: Taller de Investigación 1 
 * Periodo: Agosto-Diciembre 2025 
 * Docente: FJMP 
 * Programador: Andres Mendoza 
 * Fecha: 02/10/2025
 *
 * @author Andres
 * @version 1.2
 * @since 2025-10-02
 */
public class Alumno extends Usuario {

    /** Número de control (matrícula) del alumno */
    private String noControl;

    /**
     * Constructor que inicializa un alumno solo con número de control y nombre.
     * No requiere usuario ni clave, ya que su acceso es básico.
     *
     * @param noControl Número de control (matrícula) del alumno.
     * @param nombre Nombre completo del alumno.
     */
    public Alumno(String noControl, String nombre) {
        // Llamamos al constructor simplificado de Usuario (solo nombre)
        super(nombre);
        this.noControl = noControl;
    }

    /** Obtiene el número de control del alumno. */
    public String getNoControl() {
        return noControl;
    }

    /** Modifica el número de control del alumno. */
    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
}
