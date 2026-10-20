# 📝 Ejercicios propuestos

## Ejercicio 1 - Añadir especies

Amplía el bosque con:

```text
Roble
Pino
Olivo
Palmera
```

Crea cientos de árboles.

Comprueba cuántos:

```text
Arbol
```

existen y cuántos:

```text
TipoArbol
```

ha creado la Factory.

---

## Ejercicio 2 - Comprobar reutilización

Solicita dos veces:

```java
TipoArbolFactory.obtenerTipo(
    "Roble",
    "Verde",
    "rugosa"
);
```

Comprueba:

```java
tipo1 == tipo2
```

¿Qué resultado esperas?

¿Por qué?

---

## Ejercicio 3 - Estado mutable

Añade:

```java
setColor(...)
```

a `TipoArbol`.

Cambia el color desde un árbol.

Observa qué ocurre con los demás árboles que utilizan el mismo Flyweight.

Después elimina el setter.

Explica por qué la inmutabilidad es importante.

---

## Ejercicio 4 - Editor de texto

Diseña un sistema donde muchos caracteres comparten:

```text
fuente
tamaño
color
estilo
```

Crea:

```text
EstiloCaracter
```

como Flyweight.

Mantén fuera:

```text
posición
carácter
```

---

## Ejercicio 5 - Videojuego

Imagina:

```text
50.000 enemigos
```

Todos comparten:

```text
modelo
textura
animaciones
tipo
```

Cada enemigo tiene:

```text
posición
vida
dirección
```

Identifica:

```text
estado intrínseco
estado extrínseco
```

y diseña una posible estructura Flyweight.

---

## Ejercicio 6 - Flyweight o no

Analiza:

### Caso A

10 objetos con dos propiedades simples.

### Caso B

500.000 objetos que comparten una textura de 5 MB.

### Caso C

1.000 objetos donde todos tienen estados completamente diferentes.

### Caso D

100.000 iconos donde existen solo 20 imágenes distintas.

Decide en cuáles considerarías Flyweight y justifica tu respuesta.

---

## Ejercicio 7 - Flyweight vs. Singleton

Tenemos:

```text
10 tipos de árbol
```

y miles de árboles.

Pregunta:

> **¿Debería `TipoArbol` ser Singleton?**

Explica por qué Flyweight y Singleton resuelven problemas distintos.