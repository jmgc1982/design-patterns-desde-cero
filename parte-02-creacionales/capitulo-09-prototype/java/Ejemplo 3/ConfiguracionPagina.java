public class ConfiguracionPagina implements Prototype<ConfiguracionPagina> {

    private String tamano;
    private String orientacion;
    private int margen;

    public ConfiguracionPagina(
            String tamano,
            String orientacion,
            int margen) {

        this.tamano = tamano;
        this.orientacion = orientacion;
        this.margen = margen;
    }

    @Override
    public ConfiguracionPagina clonar() {

        return new ConfiguracionPagina(
                tamano,
                orientacion,
                margen
        );
    }

    public String getTamano() {
        return tamano;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public int getMargen() {
        return margen;
    }
}