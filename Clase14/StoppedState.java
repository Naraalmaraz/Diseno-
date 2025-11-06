public class StoppedState extends PlayerState {
    @Override
    public void play(MusicPlayer player) {
        player.setState(new PlayingState());
        System.out.println("Cambiado a estado: Reproduciendo");
    }

    @Override
    public void pause(MusicPlayer player) {
        player.setState(new PausedState());
        System.out.println("Cambiado a estado: Pausa");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("El reproductor ya está detenido.");
    }
}
