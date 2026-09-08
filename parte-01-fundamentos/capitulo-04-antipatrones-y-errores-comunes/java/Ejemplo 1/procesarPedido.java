public void procesarPedido(Pedido pedido) {

    if (pedido != null) {

        if (pedido.getCliente() != null) {

            if (pedido.getTotal() > 0) {

                if (pedido.getCliente().estaActivo()) {

                    // Calcular descuentos

                    if (pedido.getTotal() > 100) {
                        // Descuento
                    } else {
                        // Sin descuento
                    }

                    // Guardar pedido

                    // Enviar email

                    // Actualizar inventario

                    // Generar factura

                }
            }
        }
    }
}