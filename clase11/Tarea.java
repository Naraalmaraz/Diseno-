public class Tarea {
    private Estado estado;

    public Tarea() {
    }

    public Tarea(Estado estado) {
        this.estado = estado;
    }

    public void obtenerDato() {
        estado.mostrarNombre();
    }

    public void mover(Estado nuevoEstado) {
        this.estado = nuevoEstado;
    }

}
