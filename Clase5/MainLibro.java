public class MainLibro {
    public static void main(String[] args) {
        // Usando constructor por defecto y luego seteando el título
        Libro l1 = new Libro();
        l1.setTitulo("Manuelita");

        // Usando constructor con solo el título
        Libro l2 = new Libro("Alicia en el País de las Maravillas");

        // Usando constructor con título y autor
        Libro l3 = new Libro("Caperucita Roja", "Anónimo");

        // Mostrar información
        l1.mostrarInfo();
        l2.mostrarInfo();
        l3.mostrarInfo();
    }
}

