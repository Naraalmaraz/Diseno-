public abstract class Estado {
    private String nombre;

    public Estado() {
    }

    public Estado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    abstract void mostrarNombre();
}
