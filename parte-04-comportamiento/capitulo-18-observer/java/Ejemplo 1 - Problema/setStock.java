public void setStock(
        int stock) {

    this.stock = stock;

    emailService.enviar(...);

    pushService.enviar(...);

    estadisticas.actualizar(...);

    logger.registrar(...);
}