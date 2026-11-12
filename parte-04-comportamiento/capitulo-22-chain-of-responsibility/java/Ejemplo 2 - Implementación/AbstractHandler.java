public abstract class AbstractHandler
        implements Handler {

    private Handler siguiente;

    @Override
    public Handler setNext(
            Handler handler) {

        this.siguiente =
                handler;

        return handler;
    }

    protected boolean next(
            Peticion peticion) {

        if (
            siguiente == null
        ) {

            return true;
        }

        return siguiente.handle(
            peticion
        );
    }
}