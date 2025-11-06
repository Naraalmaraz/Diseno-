public class Semaforo {
    private ColorSemaforo ColorActual;

    public Semaforo() {
        this.ColorActual = new Rojo();
    }

    public void CambiarEstado() {
        ColorActual = ColorActual.CambiarEstado();
    }

    public void MostrarColor() {
        system.out.println("el semaforo esta el: " + ColorActual.getNombreColor());
    }

    // abst
    abstract class ColorSemaforo {
        public abstract string getNombreColor();

        public abstract ColorSemaforo CambiarEstado();
    }
}