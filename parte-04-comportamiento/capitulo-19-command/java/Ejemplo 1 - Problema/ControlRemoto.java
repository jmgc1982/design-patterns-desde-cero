public class ControlRemoto {

    private Luz luz;

    public ControlRemoto(
            Luz luz) {

        this.luz = luz;
    }

    public void pulsarEncender() {

        luz.encender();
    }

    public void pulsarApagar() {

        luz.apagar();
    }
}