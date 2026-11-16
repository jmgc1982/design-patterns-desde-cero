public class Usuario {

    private final String nombre;

    private final ChatMediator mediator;

    public Usuario(String nombre, ChatMediator mediator) {

        this.nombre = nombre;

        this.mediator = mediator;
    }

    public void enviar(String mensaje) {

        System.out.println("📤 " + nombre + " envía: " + mensaje);

        mediator.enviar(mensaje, this);
    }

    public void recibir(String emisor, String mensaje) {

        System.out.println("📥 " + nombre + " recibe de " + emisor + ": " + mensaje);
    }

    public String getNombre() {

        return nombre;
    }
}