# 📝 Ejercicios propuestos

## Ejercicio 1 - Reproductor multimedia

Añade una nueva clase externa:

```java
public class MP4Player {

    public void playMp4(
            String file) {

        // ...
    }
}
```

Crea:

```java
MP4Adapter
```

para que pueda utilizarse mediante:

```java
ReproductorAudio
```

---

## Ejercicio 2 - Sistema de pagos

Tenemos:

```java
public interface ServicioPago {

    void pagar(double euros);
}
```

Y una API externa:

```java
public class PaymentGateway {

    public void charge(
            long cents) {

        // ...
    }
}
```

Implementa:

```java
PaymentGatewayAdapter
```

El Adapter deberá convertir:

```text
euros → céntimos
```

---

## Ejercicio 3 - Código legado

Imagina una aplicación nueva que utiliza:

```java
public interface Logger {

    void log(String mensaje);
}
```

Pero debes integrar:

```java
public class LegacyLogger {

    public void writeMessage(
            String texto,
            int level) {

        // ...
    }
}
```

Diseña un Adapter adecuado.

Decide qué valor utilizarás para:

```text
level
```

y explica tu decisión.

---

## Ejercicio 4 - ¿Adapter o no?

Analiza estos escenarios.

### Caso A

Dos clases tienen métodos con nombres diferentes, pero representan exactamente la misma operación.

### Caso B

Dos clases representan responsabilidades completamente diferentes.

### Caso C

Una librería externa espera céntimos y nuestro dominio trabaja con euros.

### Caso D

Podemos modificar fácilmente ambas clases porque pertenecen a nuestro proyecto.

Para cada caso decide:

> **¿Utilizarías Adapter?**

Justifica tu respuesta.

---

## Ejercicio 5 - Composición vs. herencia

Implementa dos variantes:

```text
Object Adapter
Class Adapter
```

para `VLCPlayer`.

Compara:

- acoplamiento;
- flexibilidad;
- reutilización;
- facilidad de pruebas.

---

## Ejercicio 6 - Excepciones

Imagina que una API externa lanza:

```java
ExternalPaymentException
```

pero nuestro dominio trabaja con:

```java
PagoException
```

Modifica el Adapter para traducir también las excepciones.

Reflexiona:

> **¿Tiene sentido que el resto de la aplicación conozca la excepción del proveedor externo?**
