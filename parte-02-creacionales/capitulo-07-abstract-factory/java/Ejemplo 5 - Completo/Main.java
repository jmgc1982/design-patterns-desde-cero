public class Main {

    public static void main(String[] args) {

        GUIFactory factory = new WindowsFactory();

        /*
            Si queremos utilizar macOS, substituir por:

            GUIFactory factory = new MacFactory();
        */

        Aplicacion aplicacion = new Aplicacion(factory);

        aplicacion.renderizar();
    }
}