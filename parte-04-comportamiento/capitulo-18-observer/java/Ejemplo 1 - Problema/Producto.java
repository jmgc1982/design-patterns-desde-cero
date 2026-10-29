public class Producto {

    private String nombre;
    private int stock;

    public Producto(
            String nombre,
            int stock) {

        this.nombre = nombre;
        this.stock = stock;
    }

    public void setStock(
            int stock) {

        this.stock = stock;

        // ¿A quién debemos avisar?
    }
}