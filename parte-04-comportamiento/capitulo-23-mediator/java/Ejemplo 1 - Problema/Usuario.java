public class Usuario {

    private String nombre;

    private List<Usuario> contactos;

    public void enviar(String mensaje) {

        for (Usuario usuario : contactos) {

            usuario.recibir(nombre, mensaje);
        }
    }

    public void recibir(String emisor, String mensaje) {

        System.out.println(emisor + ": " + mensaje);
    }
}