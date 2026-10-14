public class Configuracion {

    private static final Configuracion INSTANCIA =
            new Configuracion();

    private Configuracion() {
    }

    public static Configuracion getInstance() {
        return INSTANCIA;
    }
}