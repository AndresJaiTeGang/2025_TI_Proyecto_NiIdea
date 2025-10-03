package domain;

/**
 * Representa a un usuario dentro del sistema del proyecto NiIdea.
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
public class Usuarios {
    private int id;
    private String Nombre;

    /**
     * Obtiene el identificador del usuario.
     *
     * @return Identificador numérico del usuario.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del usuario.
     *
     * @param id Identificador numérico del usuario.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param Nombre Nombre completo del usuario.
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Constructor que inicializa un usuario con su identificador y nombre.
     *
     * @param id Identificador del usuario.
     * @param Nombre Nombre del usuario.
     */
    public Usuarios(int id, String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }
}