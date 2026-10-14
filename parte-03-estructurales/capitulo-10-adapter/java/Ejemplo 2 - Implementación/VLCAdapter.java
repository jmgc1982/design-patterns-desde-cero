public class VLCAdapter
        implements ReproductorAudio {

    private final VLCPlayer vlcPlayer;

    public VLCAdapter(
            VLCPlayer vlcPlayer) {

        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void reproducir(
            String archivo) {

        vlcPlayer.playVlcFile(
                archivo
        );
    }
}