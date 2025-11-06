 // Verdecito
    class Verde extends ColorSemaforo {
        @Override
            public string getNombreColor() {
            return "Verde";
        }

        @Override
        public CambiarEstado (){
            return new Amarillo();
        }
    }
