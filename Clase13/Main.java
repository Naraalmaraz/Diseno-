public class Main {
    public static void main(String[] args) {
        Estado lectura = new SoloLectura();
        Estado edicion = new Edicion();

        Documento doc1 = new Documento("Solo lectura", lectura);
        Documento doc2 = new Documento("Editable: A", edicion);

        probar(doc1);
        probar(doc2);
    }

    private static void probar(Documento doc) {
        System.out.println("Texto original:");
        System.out.println(doc.getTexto());

        System.out.println("\n--- Escribir ---");
        doc.usarEstado("Escribir");

        System.out.println("\n--- Guardar ---");
        doc.usarEstado("Guardar");

        System.out.println("\nTexto final:");
        System.out.println(doc.getTexto());
    }
}
