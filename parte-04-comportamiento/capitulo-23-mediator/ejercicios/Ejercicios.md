# 📝 Ejercicios propuestos

## Ejercicio 1 - Mensajes privados

Añade:

```java
void enviarPrivado(
    String mensaje,
    Usuario origen,
    Usuario destino
);
```

al Mediator.

El usuario no debe llamar directamente al destinatario.

---

## Ejercicio 2 - Usuario bloqueado

Permite que un usuario pueda bloquear a otro.

El Mediator deberá comprobar:

```text
¿el receptor ha bloqueado al emisor?
```

antes de entregar el mensaje.

---

## Ejercicio 3 - Sala de chat

Añade:

```text
Sala
```

Permite que diferentes usuarios pertenezcan a salas distintas.

El Mediator deberá enviar mensajes únicamente a usuarios de la misma sala.

---

## Ejercicio 4 - Formulario

Diseña un:

```text
FormMediator
```

para coordinar:

```text
Checkbox
TextField
Button
```

Cuando se marque un checkbox:

```text
habilitar botón
deshabilitar campo
```

sin que los componentes se conozcan directamente.

---

## Ejercicio 5 - Torre de control

Diseña:

```text
ControlTowerMediator
```

con:

```text
Avion
Pista
```

Los aviones deben solicitar permiso al Mediator para aterrizar.

---

## Ejercicio 6 - Mediator vs. Observer

Analiza:

### Caso A

Un precio cambia y varios componentes deben actualizarse.

### Caso B

Cinco componentes necesitan coordinar acciones entre ellos.

### Caso C

Una noticia debe enviarse a varios suscriptores.

### Caso D

Un formulario tiene múltiples controles que afectan unos a otros.

Decide entre:

```text
Observer
Mediator
```

y justifica.

---

## Ejercicio 7 - Detectar God Mediator

Imagina:

```text
ApplicationMediator
├── login()
├── procesarPago()
├── crearPedido()
├── enviarEmail()
├── actualizarStock()
├── crearFactura()
├── generarInforme()
└── ...
```

Analiza:

- cohesión;
- responsabilidades;
- acoplamiento;
- mantenibilidad.

Propón una división más adecuada.

---

## Ejercicio 8 - Sin Mediator

Implementa primero una versión donde:

```text
Usuario
```

conoce directamente a otros usuarios.

Después refactorízala mediante Mediator.

Compara:

```text
dependencias
complejidad
extensibilidad
testing
```