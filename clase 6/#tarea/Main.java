public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Gerente("Laura", 45, 10);
        empleados[1] = new Programador("Carlos", 30, "Java");
        empleados[2] = new Diseñador("Marta", 28, "Photoshop");

        for (Empleado e : empleados) {
            e.mostrarDatos();
            e.trabajar();
            System.out.println("------------");
        }
    }
}

