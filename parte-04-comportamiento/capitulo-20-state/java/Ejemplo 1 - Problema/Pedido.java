public class Pedido {

    private String estado;

    public Pedido() {

        this.estado = "CREADO";
    }

    public void pagar() {

        if (
            estado.equals("CREADO")
        ) {

            System.out.println(
                "💳 Pedido pagado"
            );

            estado = "PAGADO";

        } else {

            System.out.println(
                "❌ No se puede pagar "
                + "desde el estado "
                + estado
            );
        }
    }

    public void enviar() {

        if (
            estado.equals("PAGADO")
        ) {

            System.out.println(
                "🚚 Pedido enviado"
            );

            estado = "ENVIADO";

        } else {

            System.out.println(
                "❌ No se puede enviar "
                + "desde el estado "
                + estado
            );
        }
    }

    public void entregar() {

        if (
            estado.equals("ENVIADO")
        ) {

            System.out.println(
                "📦 Pedido entregado"
            );

            estado = "ENTREGADO";

        } else {

            System.out.println(
                "❌ No se puede entregar "
                + "desde el estado "
                + estado
            );
        }
    }

    public void cancelar() {

        if (
            estado.equals("CREADO")
            || estado.equals("PAGADO")
        ) {

            System.out.println(
                "🚫 Pedido cancelado"
            );

            estado = "CANCELADO";

        } else {

            System.out.println(
                "❌ No se puede cancelar "
                + "desde el estado "
                + estado
            );
        }
    }
}