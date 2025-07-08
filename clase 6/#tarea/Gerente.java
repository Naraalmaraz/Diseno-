public class Gerente extends Empleado {
    private int numEmpleados;

    public Gerente(String nombre, int edad, int numEmpleados) {
        super(nombre, edad);
        this.numEmpleados = numEmpleados;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está supervisando un equipo de " + numEmpleados + " empleados.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Gerente: " + nombre + ", Edad: " + edad + ", A cargo de: " + numEmpleados + " empleados.");
    }
}
