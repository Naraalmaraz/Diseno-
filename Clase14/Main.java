public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.setState(new PlayingState());

        player.play();

        player.pause();

        player.pause();

        player.stop();

        player.stop();
    }
}
