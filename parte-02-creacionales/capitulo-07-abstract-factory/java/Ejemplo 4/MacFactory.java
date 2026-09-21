public class MacFactory
        implements GUIFactory {

    @Override
    public Boton crearBoton() {

        return new BotonMac();
    }

    @Override
    public Checkbox crearCheckbox() {

        return new CheckboxMac();
    }
}