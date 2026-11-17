# 📝 Ejercicios propuestos

## Ejercicio 1 - Más estado

Amplía:

```java
EditorTexto
```

con:

```text
selecciónInicio
selecciónFin
```

Haz que el Memento también permita restaurar esa información.

---

## Ejercicio 2 - Undo múltiple

Implementa un historial que permita:

```text
Undo
Undo
Undo
```

hasta llegar al primer snapshot.

---

## Ejercicio 3 - Redo

Añade:

```text
Redo
```

utilizando:

```text
pila Undo
+
pila Redo
```

---

## Ejercicio 4 - Límite de historial

Permite almacenar únicamente:

```text
10 snapshots
```

Cuando llegue el undécimo:

```text
elimina el más antiguo
```

---

## Ejercicio 5 - Editor gráfico

Diseña:

```text
Figura
```

con:

```text
x
y
ancho
alto
color
```

Implementa:

```text
FiguraMemento
```

y permite restaurar transformaciones anteriores.

---

## Ejercicio 6 - Memento vs. Command

Analiza:

### Caso A

Queremos guardar exactamente cómo estaba un documento.

### Caso B

Queremos recordar que ejecutamos `eliminarTexto()`.

### Caso C

Queremos implementar Undo mediante snapshots.

### Caso D

Queremos implementar Undo ejecutando una operación inversa.

Decide entre:

```text
Memento
Command
Ambos
```

y justifica.

---

## Ejercicio 7 - Deep Copy

Añade al editor:

```java
ConfiguracionDocumento
```

como objeto mutable.

Guárdalo dentro del Memento.

Después modifica la configuración original.

Comprueba qué ocurre.

Refactoriza la solución para evitar que el snapshot cambie.

---

## Ejercicio 8 - Checkpoints

Diseña una clase:

```text
Jugador
```

con:

```text
posición
vida
nivel
puntuación
```

Crea Mementos para representar:

```text
checkpoints
```

de una partida.