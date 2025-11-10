package domain;

abstract class Usuario {
    private String nombre;
    private String ndu;
    private String clave;

    public Usuario(String nombre, String ndu, String clave) {
        this.nombre = nombre;
        this.ndu = ndu;
        this.clave = clave;
    }

    /**
     * Constructor simplificado para permitir crear objetos solo con el nombre.
     * Útil para clases derivadas que no requieren todos los datos al inicio.
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.ndu = "";
        this.clave = "";
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
