public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String patente, int año, String dueño, int cilindrada) {
        super(patente, año, dueño);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularImpuesto() {
        return cilindrada < 250 ? 3000 : 6000;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: Moto");
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}

