public class Main {
    public static void main(String[] args) {
        // Usando constructor por defecto
        Pelicula p1 = new Pelicula();
        
        // Usando constructor con título y director
        Pelicula p2 = new Pelicula("Inception", "Christopher Nolan");
        
        // Usando constructor con todos los parámetros
        Pelicula p3 = new Pelicula("El Padrino", "Francis Ford Coppola", 175);

        // Cambiando valores con setters
        p1.setTitulo("Rapidos y Furiosos");
        p1.setDirector("Toreto");
        p1.setDuracion(106);

        // Mostrar información
        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
    }
}