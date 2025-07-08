public class Programador extends Empleado {
    private String lenguaje;

    public Programador(String nombre, int edad, String lenguaje) {
        super(nombre, edad);
        this.lenguaje = lenguaje;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está programando en " + lenguaje + ".");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Programador: " + nombre + ", Edad: " + edad + ", Lenguaje: " + lenguaje);
    }
}
