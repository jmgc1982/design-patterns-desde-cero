public class WindowsFactory
        implements GUIFactory {

    @Override
    public Boton crearBoton() {

        return new BotonWindows();
    }

    @Override
    public Checkbox crearCheckbox() {

        return new CheckboxWindows();
    }
}