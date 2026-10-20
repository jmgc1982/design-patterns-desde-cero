public class TipoArbol {

    private final String especie;
    private final String color;
    private final String textura;

    public TipoArbol(
            String especie,
            String color,
            String textura) {

        this.especie = especie;
        this.color = color;
        this.textura = textura;
    }

    public void dibujar(
            int x,
            int y) {

        System.out.println(
            "🌳 Dibujando "
            + especie
            + " en ("
            + x
            + ", "
            + y
            + ")"
        );
    }
}