public interface ChatMediator {

    void registrar(Usuario usuario);

    void enviar(String mensaje, Usuario emisor);
}