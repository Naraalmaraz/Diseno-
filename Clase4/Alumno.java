public class Alumno {
    // Atributo: nombre del alumno
    private String nombre;

    // Constructor: recibe el nombre del alumno
    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    // Método que calcula el promedio de dos notas
    public float promedio(float nota1, float nota2) {
        return (nota1 + nota2) / 2;
    }

    // Método para obtener el nombre del alumno
    public String getNombre() {
        return nombre;
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un alumno con un nombre
        Alumno alumno = new Alumno("Oscar");

        // Calcular y mostrar el promedio
        float promedioNotas = alumno.promedio(8.5f, 9.0f);
        System.out.println("El promedio de " + alumno.getNombre() + " es de: " + promedioNotas);
    }
}
