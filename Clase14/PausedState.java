public class PausedState extends PlayerState {
    @Override
    public void play(MusicPlayer player) {
        player.setState(new PlayingState());
        System.out.println("Cambiado a estado: Reproduciendo");
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("El reproductor ya está en pausa.");
    }

    @Override
    public void stop(MusicPlayer player) {
        player.setState(new StoppedState());
        System.out.println("Cambiado a estado: Detenido");
    }
}
