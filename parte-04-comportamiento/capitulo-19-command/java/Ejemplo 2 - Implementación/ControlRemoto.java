public class ControlRemoto {

    private Command comando;

    public void setCommand(
            Command comando) {

        this.comando =
                comando;
    }

    public void pulsarBoton() {

        if (comando == null) {

            throw new IllegalStateException(
                "No existe ningún comando configurado"
            );
        }

        comando.execute();
    }
}