public void procesarPedidoPresencial(Pedido pedido) {

    validarPedido(pedido);

    calcularTotal(pedido);

    guardarPedido(pedido);

    enviarEmail(pedido);
}