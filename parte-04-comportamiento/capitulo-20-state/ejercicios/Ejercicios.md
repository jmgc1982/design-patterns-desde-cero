# 📝 Ejercicios propuestos

## Ejercicio 1 - Añadir estado PREPARANDO

Modifica el flujo:

```text
PAGADO
  ↓
PREPARANDO
  ↓
ENVIADO
```

Crea:

```java
PedidoPreparando
```

y adapta las transiciones necesarias.

---

## Ejercicio 2 - Devolución

Añade:

```text
DEVUELTO
```

Permite:

```text
ENTREGADO
   ↓
DEVUELTO
```

mediante:

```java
devolver();
```

Decide si todos los estados deben declarar esta operación.

---

## Ejercicio 3 - Máquina de estados

Dibuja todas las transiciones posibles entre:

```text
CREADO
PAGADO
PREPARANDO
ENVIADO
ENTREGADO
CANCELADO
DEVUELTO
```

Identifica estados terminales.

---

## Ejercicio 4 - Reproductor

Diseña:

```text
Reproductor
```

con estados:

```text
Detenido
Reproduciendo
Pausado
```

y operaciones:

```java
play();
pause();
stop();
```

Implementa cada comportamiento utilizando State.

---

## Ejercicio 5 - State o switch

Tenemos:

```text
SEMÁFORO
```

con:

```text
ROJO
AMARILLO
VERDE
```

y una única operación:

```java
siguiente();
```

Pregunta:

> **¿Aplicarías State o utilizarías enum + switch?**

Justifica tu decisión.

---

## Ejercicio 6 - State vs. Strategy

Analiza:

### Caso A

El usuario selecciona:

```text
pagar con tarjeta
pagar con PayPal
```

### Caso B

Un pedido está:

```text
creado
pagado
enviado
```

### Caso C

Un reproductor cambia entre:

```text
detenido
reproduciendo
pausado
```

Decide entre:

```text
Strategy
State
```

y justifica.

---

## Ejercicio 7 - Estados compartidos

Haz que los objetos State sean inmutables.

Analiza si podrías reutilizar:

```text
una única instancia
```

de cada Concrete State para múltiples pedidos.

---

## Ejercicio 8 - Observer + State

Añade un mecanismo Observer para notificar:

```text
CambioEstadoPedidoEvent
```

cada vez que:

```java
Pedido
```

cambie de estado.

Reflexiona sobre cómo pueden colaborar ambos patrones.