public class Hecho extends Estado {
    public Hecho() {
    }

    public Hecho(String nombre) {
        super(nombre);
    }

    @Override
    void mostrarNombre() {
        System.out.println("Estado: " + getNombre());
    }

}
