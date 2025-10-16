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
 * @since 2025-10-16
 */
abstract class Usuario {
    private String nombre;
    private String ndu;
    private String clave;

    public Usuario(String nombre, String ndu, String clave) {
        this.nombre = nombre;
        this.ndu = ndu;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNdu() {
        return ndu;
    }

    public String getClave() {
        return clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNdu(String ndu) {
        this.ndu = ndu;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}