public class Camion extends Vehiculo {
    private double cargaMaxima; // toneladas

    public Camion(String patente, int año, String dueño, double cargaMaxima) {
        super(patente, año, dueño);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public double calcularImpuesto() {
        return 8000 + (100 * cargaMaxima);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: Camión");
        System.out.println("Carga máxima: " + cargaMaxima + " toneladas");
    }
}

