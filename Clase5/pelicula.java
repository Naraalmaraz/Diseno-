public class Pelicula {
    // atributos
    private String titulo;
    private String director;
    private int duracion; // minutos

    // Constructor
    public Pelicula() {
        this.titulo = "Sin título";
        this.director = "Desconocido";
        this.duracion = 0;
    }

    // Constructor con título y director
    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = 0;
    }

    // Constructor con todos los parámetros
    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    // Getters y Setters (metodos para obtener o modificar los valores de los
    // atributos privados)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion + " min");
        System.out.println("-------------------------------");
    }
}
