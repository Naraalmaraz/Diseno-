import java.util.Scanner;

public class Edicion extends Estado {
    @Override
    public void Escribir() {
        System.out.print("Ingrese nuevo texto: ");
        Scanner sc = new Scanner(System.in);
        setNuevoTexto(sc.nextLine());
    }

    @Override
    public String Guardar() {
        System.out.println("Texto modificado exitosamente.");
        return getNuevoTexto();
    }
}
