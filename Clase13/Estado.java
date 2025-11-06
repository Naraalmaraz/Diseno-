public abstract class Estado {
    private String nuevoTexto;

    public String getNuevoTexto() {
        return nuevoTexto;
    }

    public void setNuevoTexto(String nuevoTexto) {
        this.nuevoTexto = nuevoTexto;
    }

    public void Escribir() {
    }

    public String Guardar() {
        return null;
    }
}
