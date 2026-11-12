public class Peticion {

    private final boolean autenticada;

    private final boolean autorizada;

    private final boolean valida;

    public Peticion(
            boolean autenticada,
            boolean autorizada,
            boolean valida) {

        this.autenticada =
                autenticada;

        this.autorizada =
                autorizada;

        this.valida =
                valida;
    }

    public boolean estaAutenticada() {

        return autenticada;
    }

    public boolean estaAutorizada() {

        return autorizada;
    }

    public boolean esValida() {

        return valida;
    }
}