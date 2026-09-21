public class Aplicacion {

    public void crearInterfaz(String sistema) {

        if (sistema.equals("WINDOWS")) {

            BotonWindows boton =
                    new BotonWindows();

            CheckboxWindows checkbox =
                    new CheckboxWindows();

        } else if (sistema.equals("MAC")) {

            BotonMac boton =
                    new BotonMac();

            CheckboxMac checkbox =
                    new CheckboxMac();
        }
    }
}