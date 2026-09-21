# 📝 Ejercicios propuestos

## Ejercicio 1 - Añadir Linux

Amplía el ejemplo para incorporar una nueva familia:

```text
Linux
```

Implementa:

```text
BotonLinux
CheckboxLinux
LinuxFactory
```

Después comprueba que `Aplicacion` puede utilizar la nueva familia sin modificar su implementación.

---

## Ejercicio 2 - Añadir un nuevo producto

Añade un nuevo producto abstracto:

```java
public interface Menu {

    void renderizar();
}
```

Implementa:

```text
MenuWindows
MenuMac
```

Y modifica:

```java
GUIFactory
```

para que pueda crearlo.

Reflexiona:

> **¿Cuántas clases e interfaces hemos tenido que modificar?**

---

## Ejercicio 3 - Productos incompatibles

Imagina este código:

```java
Boton boton =
        new BotonWindows();

Checkbox checkbox =
        new CheckboxMac();
```

Responde:

1. ¿Qué problema representa?
2. ¿Cómo ayuda Abstract Factory a evitarlo?
3. ¿Puede el patrón impedir absolutamente cualquier uso incorrecto?
4. ¿Qué responsabilidad sigue teniendo el código cliente?

---

## Ejercicio 4 - Cloud Providers

Diseña una Abstract Factory para:

```text
AWS
Azure
```

Cada familia deberá proporcionar:

```text
Storage
Database
Queue
```

Diseña las interfaces, productos concretos y fábricas correspondientes.

---

## Ejercicio 5 - Factory Method o Abstract Factory

Decide qué patrón considerarías en cada escenario:

### Caso A

Necesitamos crear diferentes tipos de notificaciones:

```text
Email
SMS
Push
```

### Caso B

Necesitamos componentes gráficos compatibles:

```text
Windows:
    Botón
    Checkbox

macOS:
    Botón
    Checkbox
```

### Caso C

Solo tenemos una clase:

```text
FacturaPDF
```

Justifica cada decisión.

Recuerda que:

> **"Ningún patrón" también puede ser una respuesta correcta.**