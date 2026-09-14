public class Configuracion {

    private static Configuracion instancia;

    private String entorno;
    private String urlApi;

    private Configuracion() {
        this.entorno = "produccion";
        this.urlApi = "https://api.example.com";
    }

    public static Configuracion getInstance() {

        if (instancia == null) {
            instancia = new Configuracion();
        }

        return instancia;
    }

    public String getEntorno() {
        return entorno;
    }

    public String getUrlApi() {
        return urlApi;
    }
}