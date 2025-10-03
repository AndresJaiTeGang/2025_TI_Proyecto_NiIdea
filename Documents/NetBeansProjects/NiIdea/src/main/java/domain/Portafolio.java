package domain;

/**
 * Representa un portafolio que contiene evidencias de habilidades adquiridas por el alumno.
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
public class Portafolio {
    private int id;
    private String nombre;
    private String valor;

    /**
     * Obtiene el identificador del portafolio.
     *
     * @return Identificador numérico del portafolio.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del portafolio.
     *
     * @param id Identificador numérico del portafolio.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del portafolio.
     *
     * @return Nombre del portafolio.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del portafolio.
     *
     * @param nombre Nombre del portafolio.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el valor del portafolio.
     *
     * @return Valor asignado al portafolio.
     */
    public String getValor() {
        return valor;
    }

    /**
     * Establece el valor del portafolio.
     *
     * @param valor Valor asignado al portafolio.
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * Constructor que inicializa un portafolio con su identificador, nombre y valor.
     *
     * @param id Identificador del portafolio.
     * @param nombre Nombre del portafolio.
     * @param valor Valor asignado al portafolio.
     */
    public Portafolio(int id, String nombre, String valor) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
    }
}