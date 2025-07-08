public class Diseñador extends Empleado {
    private String herramienta;

    public Diseñador(String nombre, int edad, String herramienta) {
        super(nombre, edad);
        this.herramienta = herramienta;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está diseñando con " + herramienta + ".");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Diseñador: " + nombre + ", Edad: " + edad + ", Herramienta: " + herramienta);
    }
}

