public enum Configuracion {

    INSTANCE;

    private String entorno = "produccion";
    private String urlApi =
            "https://api.example.com";

    public String getEntorno() {
        return entorno;
    }

    public String getUrlApi() {
        return urlApi;
    }
}