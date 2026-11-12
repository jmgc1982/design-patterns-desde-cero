public interface Handler {

    Handler setNext(
        Handler handler
    );

    boolean handle(
        Peticion peticion
    );
}