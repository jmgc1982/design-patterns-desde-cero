import java.util.ArrayList;
import java.util.List;

public class Chat implements ChatMediator {

    private final List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void registrar(Usuario usuario) {

        usuarios.add(usuario);
    }

    @Override
    public void enviar(String mensaje, Usuario emisor) {

        for (Usuario usuario : usuarios) {

            if (usuario != emisor) {

                usuario.recibir(emisor.getNombre(), mensaje);
            }
        }
    }
}