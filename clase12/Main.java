public class Main {
    public static void main (string[] args){
        Semaforo semaforo = new Semaforo ();

        for (int i = 0; i ++) {
            semaforo.MostrarColor();
            semaforo.CambiarEstado();
        }
    }
}