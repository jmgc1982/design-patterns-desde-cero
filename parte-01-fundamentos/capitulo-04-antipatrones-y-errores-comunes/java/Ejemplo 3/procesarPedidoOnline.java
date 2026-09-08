public void procesarPedidoOnline(Pedido pedido) {

    validarPedido(pedido);

    calcularTotal(pedido);

    guardarPedido(pedido);

    enviarEmail(pedido);
}