public class Main {
    public static void main(String[] args) {
        Estado p = new PorHacer("Por hacer");
        Estado e = new EnProceso("En proceso");
        Estado h = new Hecho("Hecho");

        Tarea t1 = new Tarea(p);
        Tarea t2 = new Tarea(e);
        Tarea t3 = new Tarea(h);

        System.out.println("=== Datos de 'Por hacer' ===");
        t1.obtenerDato();

        System.out.println("\n=== Datos de 'En proceso' ===");
        t2.obtenerDato();

        System.out.println("\n=== Datos de 'Hecho' ===");
        t3.obtenerDato();

        System.out.println("\n=== Cambiar de 'Por hacer' a 'En proceso' ===");
        t1.mover(e);
        t1.obtenerDato();
    }

}
