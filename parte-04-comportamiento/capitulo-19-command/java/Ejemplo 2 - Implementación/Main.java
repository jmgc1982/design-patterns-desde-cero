public class Main {

    public static void main(String[] args) {

        Luz luz =
                new Luz();

        Command encender =
                new EncenderLuzCommand(
                    luz
                );

        Command apagar =
                new ApagarLuzCommand(
                    luz
                );

        ControlRemoto control =
                new ControlRemoto();

        control.setCommand(
            encender
        );

        control.pulsarBoton();

        control.setCommand(
            apagar
        );

        control.pulsarBoton();
    }
}