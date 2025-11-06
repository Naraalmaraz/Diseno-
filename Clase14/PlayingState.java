public class PlayingState extends PlayerState {
    @Override
    public void play(MusicPlayer player) {
        System.out.println("El reproductor ya está en reproducción.");
    }

    @Override
    public void pause(MusicPlayer player) {
        player.setState(new PausedState());
        System.out.println("Cambiado a estado: Pausa");
    }

    @Override
    public void stop(MusicPlayer player) {
        player.setState(new StoppedState());
        System.out.println("Cambiado a estado: Detenido");
    }
}
