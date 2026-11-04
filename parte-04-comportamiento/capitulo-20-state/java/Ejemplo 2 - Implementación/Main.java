public class Main {

    public static void main(String[] args) {

        Pedido pedido =
                new Pedido();

        System.out.println(
            pedido.getEstado()
        );

        pedido.pagar();

        System.out.println(
            pedido.getEstado()
        );

        pedido.enviar();

        System.out.println(
            pedido.getEstado()
        );

        pedido.entregar();

        System.out.println(
            pedido.getEstado()
        );

        pedido.cancelar();
    }
}