package domain;

/**
 * Representa al coordinador dentro del sistema del proyecto NiIdea.
 * Contiene información básica como identificador y nombre.
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
public class Coordinador {
    private int id;
    private String Nombre;

    /**
     * Constructor que inicializa un coordinador con su identificador y nombre.
     *
     * @param id Identificador del coordinador.
     * @param Nombre Nombre completo del coordinador.
     */
    public Coordinador(int id, String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }

    /**
     * Obtiene el identificador del coordinador.
     *
     * @return Identificador numérico del coordinador.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del coordinador.
     *
     * @param id Identificador numérico del coordinador.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del coordinador.
     *
     * @return Nombre completo del coordinador.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre del coordinador.
     *
     * @param Nombre Nombre completo del coordinador.
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}