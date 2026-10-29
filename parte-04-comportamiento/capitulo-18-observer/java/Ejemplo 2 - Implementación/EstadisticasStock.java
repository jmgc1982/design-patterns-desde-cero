public class EstadisticasStock
        implements ObservadorStock {

    @Override
    public void actualizar(
            Producto producto) {

        System.out.println(
            "📊 Estadísticas actualizadas. "
            + producto.getNombre()
            + " → stock: "
            + producto.getStock()
        );
    }
}