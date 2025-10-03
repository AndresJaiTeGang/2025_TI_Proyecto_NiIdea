package domain;

/**
 * Representa una habilidad adquirida por el alumno mediante evidencias.
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
public class Logro {
    private int id;
    private String categoria;
    private String descripcion;

    /**
     * Obtiene el identificador del logro.
     *
     * @return Identificador numérico del logro.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del logro.
     *
     * @param id Identificador numérico del logro.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la categoría del logro.
     *
     * @return Categoría del logro.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del logro.
     *
     * @param categoria Categoría del logro.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene la descripción del logro.
     *
     * @return Descripción detallada del logro.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del logro.
     *
     * @param descripcion Descripción detallada del logro.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Constructor que inicializa un logro con su identificador, categoría y descripción.
     *
     * @param id Identificador del logro.
     * @param categoria Categoría del logro.
     * @param descripcion Descripción del logro.
     */
    public Logro(int id, String categoria, String descripcion) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }
}