public class Aplicacion {

    private final Boton boton;
    private final Checkbox checkbox;

    public Aplicacion(
            GUIFactory factory) {

        this.boton =
                factory.crearBoton();

        this.checkbox =
                factory.crearCheckbox();
    }

    public void renderizar() {

        boton.renderizar();
        checkbox.renderizar();
    }
}