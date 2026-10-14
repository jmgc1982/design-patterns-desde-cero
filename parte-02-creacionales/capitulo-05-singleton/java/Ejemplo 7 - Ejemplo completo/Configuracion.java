public class Configuracion {

    private static final Configuracion INSTANCIA =
            new Configuracion();

    private String entorno;
    private String urlApi;

    private Configuracion() {
        entorno = "produccion";
        urlApi = "https://api.example.com";
    }

    public static Configuracion getInstance() {
        return INSTANCIA;
    }

    public String getEntorno() {
        return entorno;
    }

    public String getUrlApi() {
        return urlApi;
    }
}