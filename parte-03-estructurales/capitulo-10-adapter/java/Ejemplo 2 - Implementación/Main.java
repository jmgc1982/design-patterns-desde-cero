public class Main {

    public static void main(String[] args) {

        ReproductorAudio mp3 =
                new ReproductorMP3();

        mp3.reproducir(
                "cancion.mp3"
        );

        VLCPlayer vlcPlayer =
                new VLCPlayer();

        ReproductorAudio vlc =
                new VLCAdapter(
                        vlcPlayer
                );

        vlc.reproducir(
                "video.vlc"
        );
    }