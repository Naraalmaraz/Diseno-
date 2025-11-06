public abstract class Vehiculo {
    private String patente;
    private int año;
    private String dueño;

    public Vehiculo(String patente, int año, String dueño) {
        this.patente = patente;
        this.año = año;
        this.dueño = dueño;
    }

    public abstract double calcularImpuesto();

    public void mostrarDatos() {
        System.out.println("Patente: " + patente);
        System.out.println("--------------------------");
        System.out.println("Año: " + año);
        System.out.println("--------------------------");
        System.out.println("Dueño: " + dueño);
    }

    public int getAño() {
        return año;
    }

    public String getDueño() {
        return dueño;
    }
}

