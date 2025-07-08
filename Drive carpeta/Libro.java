public class Libro {
    // Atributos encapsulados
    private String titulo;
    private String autor;

    // Constructor por defecto
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Desconocido";
    }

    // Constructor con solo el título
    public Libro(String titulo) {
        this.titulo = titulo;
        this.autor = "Desconocido";
    }

    // Constructor con título y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getter para título
    public String getTitulo() {
        return titulo;
    }

    // Setter para título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("--------------------------");
    }
}
