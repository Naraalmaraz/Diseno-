import java.util.ArrayList;

public class RegistroMunicipal {
    private ArrayList<Vehiculo> vehiculos;

    public RegistroMunicipal() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void buscarPorAño(int año) {
        System.out.println("\nVehículos del año " + año + ":");
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == año) {
                v.mostrarDatos();
                System.out.println("Impuesto: $" + v.calcularImpuesto());
                System.out.println("--------------------");
            }
        }
    }

    public void buscarPorDueño(String dueño) {
        System.out.println("\nVehículos de " + dueño + ":");
        for (Vehiculo v : vehiculos) {
            if (v.getDueño().equalsIgnoreCase(dueño)) {
                v.mostrarDatos();
                System.out.println("Impuesto: $" + v.calcularImpuesto());
                System.out.println("--------------------");
            }
        }
    }
}

