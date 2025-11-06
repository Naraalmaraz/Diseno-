public class SoloLectura extends Estado {
    @Override
    public void Escribir() {
        System.out.println("No se puede escribir en modo lectura.");
    }

    @Override
    public String Guardar() {
        System.out.println("No se puede guardar en modo lectura.");
        return null;
    }
}
