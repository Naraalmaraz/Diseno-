public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Auto("ABC123", 2020, "Juan Perez", 4);
        vehiculos[1] = new Moto("XYZ789", 2018, "Maria Gomez", 150);
        vehiculos[2] = new Camion("LMN456", 2020, "Carlos Diaz", 12);

        RegistroMunicipal registro = new RegistroMunicipal();

        // Agregar al registro
        for (Vehiculo v : vehiculos) {
            registro.agregarVehiculo(v);
        }

        // Mostrar datos e impuestos
        for (Vehiculo v : vehiculos) {
            v.mostrarDatos();
            System.out.println("Impuesto: $" + v.calcularImpuesto());
            System.out.println("--------------------");
        }

        // Buscar por año y dueño
        registro.buscarPorAño(2020);
        registro.buscarPorDueño("Maria Gomez");
    }
}

