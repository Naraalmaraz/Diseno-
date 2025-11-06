public class Documento {
    private String texto;
    private Estado estado;

    public Documento(String texto, Estado estado) {
        this.texto = texto;
        this.estado = estado;
    }

    public String getTexto() {
        return texto;
    }

    public void usarEstado(String accion) {
        if (accion == null || accion.isEmpty())
            return;

        char opcion = accion.charAt(0);
        if (opcion == 'E')
            estado.Escribir();
        else if (opcion == 'G')
            guardar();
    }

    private void guardar() {
        if (estado instanceof Edicion) {
            String nuevo = estado.Guardar();
            if (nuevo != null)
                texto = nuevo;
        } else {
            estado.Guardar();
        }
    }
}
