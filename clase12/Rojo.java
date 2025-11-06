class Rojo extends ColorSemaforo {
    @Override
    public string getNombreColor() {
        return "Rojo";
    }

    @Override
        public CambiarEstado (){
            return new Verde();
        }
}