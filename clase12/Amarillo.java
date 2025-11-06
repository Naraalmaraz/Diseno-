class Amarillo extends ColorSemaforo {
    @Override
    public String getNombreColor() {
        return "Amarillito";
    }

    @Override
        public CambiarEstado (){
            return new Rojo();
        }
}