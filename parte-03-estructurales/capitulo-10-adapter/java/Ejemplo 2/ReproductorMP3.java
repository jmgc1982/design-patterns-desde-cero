public class ReproductorMP3
        implements ReproductorAudio {

    @Override
    public void reproducir(String archivo) {

        System.out.println(
            "Reproduciendo MP3: " + archivo
        );
    }
}