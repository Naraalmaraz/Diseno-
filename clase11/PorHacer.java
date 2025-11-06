public class PorHacer extends Estado {
    public PorHacer() {
    }

    public PorHacer(String nombre) {
        super(nombre);
    }

    @Override
    void mostrarNombre() {
        System.out.println("Estado: " + getNombre());
    }
}
