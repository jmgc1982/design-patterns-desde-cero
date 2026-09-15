# 📝 Ejercicios propuestos

## Ejercicio 1 - Añadir Push

Partiendo del ejemplo del capítulo, implementa:

```java
PushNotificacion
```

y:

```java
PushNotificacionCreator
```

Comprueba que puedes enviar una notificación Push sin modificar `NotificacionCreator`.

---

## Ejercicio 2 - WhatsApp

Añade un nuevo producto:

```text
WhatsAppNotificacion
```

y su creador correspondiente.

El resultado debería permitir:

```java
NotificacionCreator creator =
        new WhatsAppNotificacionCreator();

creator.notificar(
        "Tu pedido está preparado"
);
```

---

## Ejercicio 3 - Sistema de documentos

Diseña un Factory Method para crear:

```text
DocumentoPDF
DocumentoCSV
DocumentoExcel
```

Todos deberán implementar:

```java
Documento
```

con un método:

```java
void generar();
```

---

## Ejercicio 4 - Detectar Simple Factory

Analiza:

```java
public class NotificacionFactory {

    public static Notificacion crear(
            String tipo) {

        if (tipo.equals("EMAIL")) {
            return new EmailNotificacion();
        }

        if (tipo.equals("SMS")) {
            return new SMSNotificacion();
        }

        throw new IllegalArgumentException(
                "Tipo no soportado"
        );
    }
}
```

Responde:

1. ¿Es Factory Method?
2. ¿Qué tipo de solución representa?
3. ¿Qué ventajas tiene?
4. ¿Qué problemas puede presentar cuando aumentan los tipos?
5. ¿Cuándo mantendrías esta solución en lugar de Factory Method?

---

## Ejercicio 5 - ¿Necesitamos realmente el patrón?

Tenemos:

```java
public class Factura {

    public void imprimir() {
        // ...
    }
}
```

Y solamente existe una implementación.

Pregunta:

> **¿Introducirías Factory Method?**

Justifica tu respuesta teniendo en cuenta:

- Complejidad.
- Posibles cambios.
- Número de implementaciones.
- Necesidades reales.