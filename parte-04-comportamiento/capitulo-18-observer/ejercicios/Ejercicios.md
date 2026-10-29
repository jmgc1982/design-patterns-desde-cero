# 📝 Ejercicios propuestos

## Ejercicio 1 - Añadir SMS

Implementa:

```java
NotificadorSMS
```

como nuevo:

```java
ObservadorStock
```

Comprueba que puedes añadirlo sin modificar `Producto`.

---

## Ejercicio 2 - Desuscripción

Registra:

```text
Email
Push
SMS
```

Después elimina:

```text
Push
```

Cambia el stock y comprueba qué observadores reciben la notificación.

---

## Ejercicio 3 - Evento específico

Crea:

```java
public record StockActualizadoEvent(
        String producto,
        int stockAnterior,
        int stockNuevo) {
}
```

Modifica el patrón para trabajar con este evento.

---

## Ejercicio 4 - Cambio de precio

Añade otro tipo de evento:

```text
PrecioModificadoEvent
```

Diseña observadores interesados únicamente en cambios de precio.

---

## Ejercicio 5 - Observer o llamada directa

Tenemos:

```text
PedidoService
      ↓
FacturaService
```

Siempre que se completa un pedido debemos generar exactamente una factura.

No existen más interesados ni esperamos que aparezcan.

Pregunta:

> **¿Utilizarías Observer o una llamada directa?**

Justifica tu respuesta.

---

## Ejercicio 6 - Evitar notificaciones repetidas

Modifica:

```java
setStock(...)
```

para que no notifique cuando el valor nuevo sea igual al actual.

---

## Ejercicio 7 - Excepciones

Haz que un Observer lance una excepción.

Comprueba qué ocurre con los observadores posteriores.

Diseña una estrategia para gestionar este problema.

---

## Ejercicio 8 - Observer vs. Pub/Sub

Diseña conceptualmente dos soluciones:

### Observer

```text
Producto
 ↓
Observers
```

### Publisher/Subscriber

```text
Producto
 ↓
EventBus
 ↓
Subscribers
```

Explica en qué situaciones elegirías cada enfoque.