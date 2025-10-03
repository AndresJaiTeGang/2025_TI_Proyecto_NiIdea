package domain;

/**
 * Representa a un tutor asignado a un alumno dentro del proyecto NiIdea.
 * Contiene información básica como identificador, nombre del tutor y nombre del alumno.
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
public class Tutor {
    private int id;
    private String nombre;
    private String nombreAlumno;

    /**
     * Obtiene el identificador del tutor.
     *
     * @return Identificador numérico del tutor.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del tutor.
     *
     * @param id Identificador numérico del tutor.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del tutor.
     *
     * @return Nombre completo del tutor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del tutor.
     *
     * @param nombre Nombre completo del tutor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del alumno asignado al tutor.
     *
     * @return Nombre completo del alumno.
     */
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * Establece el nombre del alumno asignado al tutor.
     *
     * @param nombreAlumno Nombre completo del alumno.
     */
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    /**
     * Constructor que inicializa un tutor con su identificador, nombre y nombre del alumno.
     *
     * @param id Identificador del tutor.
     * @param nombre Nombre del tutor.
     * @param nombreAlumno Nombre del alumno asignado.
     */
    public Tutor(int id, String nombre, String nombreAlumno) {
        this.id = id;
        this.nombre = nombre;
        this.nombreAlumno = nombreAlumno;
    }
}