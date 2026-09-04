public class Pedido {

    public void crear() {
        System.out.println("Creando pedido...");
    }

    public double calcularTotal() {
        return 100.0;
    }

    public void guardar() {
        System.out.println(
            "Guardando pedido en MySQL..."
        );
    }

    public void enviarEmail() {
        System.out.println(
            "Enviando email..."
        );
    }
}