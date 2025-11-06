public class EnProceso extends Estado {
    public EnProceso() {
    }

    public EnProceso(String nombre) {
        super(nombre);
    }

    @Override
    void mostrarNombre() {
        System.out.println("Estado: " + getNombre());
    }
}
