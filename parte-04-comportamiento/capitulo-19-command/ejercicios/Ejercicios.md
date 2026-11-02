# 📝 Ejercicios propuestos

## Ejercicio 1 - Televisor

Crea:

```text
Televisor
```

con:

```java
encender();
apagar();
```

Después implementa:

```text
EncenderTelevisorCommand
ApagarTelevisorCommand
```

Comprueba que el mismo:

```text
ControlRemoto
```

puede utilizar comandos de `Luz` y `Televisor`.

---

## Ejercicio 2 - Undo

Amplía:

```java
Command
```

con:

```java
void undo();
```

Implementa correctamente:

```text
EncenderLuzCommand
ApagarLuzCommand
```

---

## Ejercicio 3 - Historial

Modifica `ControlRemoto` para mantener:

```java
Deque<Command>
```

con todos los comandos ejecutados.

Permite ejecutar:

```text
undo
undo
undo
```

---

## Ejercicio 4 - Macro Command

Implementa:

```java
MacroCommand
```

que contenga:

```java
List<Command>
```

Crea:

```text
ModoCine
```

con:

```text
ApagarLuzCommand
BajarPersianaCommand
EncenderTelevisorCommand
```

---

## Ejercicio 5 - Cola de comandos

Crea:

```java
Queue<Command>
```

Añade varios comandos.

Después crea un:

```text
Worker
```

que los ejecute secuencialmente.

---

## Ejercicio 6 - Command con Lambda

Convierte:

```java
Command
```

en interfaz funcional.

Sustituye:

```java
new EncenderLuzCommand(luz)
```

por:

```java
luz::encender
```

Compara ambas soluciones.

---

## Ejercicio 7 - Command o llamada directa

Tenemos:

```java
calculadora.sumar(
    10,
    20
);
```

No necesitamos:

```text
undo
historial
colas
logging
programación
```

Pregunta:

> **¿Aplicarías Command?**

Justifica tu respuesta.

---

## Ejercicio 8 - Editor de texto

Diseña comandos para:

```text
Copiar
Pegar
Eliminar
Guardar
```

Piensa cuáles deberían soportar:

```text
undo
```

y cuáles no necesariamente.