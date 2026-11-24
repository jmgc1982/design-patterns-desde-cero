# 📝 Ejercicios propuestos

## Ejercicio 1 - Biblioteca básica

Implementa:

```java
Biblioteca
```

con:

```java
Iterable<Libro>
```

Comprueba que puedes utilizar:

```java
for (Libro libro : biblioteca) {
    System.out.println(libro);
}
```

---

## Ejercicio 2 - Iterator inverso

Crea un método:

```java
Iterator<Libro> iteratorInverso();
```

que recorra los libros desde el último hasta el primero.

Comprueba:

```text
A → B → C
```

frente a:

```text
C → B → A
```

---

## Ejercicio 3 - Dos recorridos independientes

Crea:

```java
Iterator<Libro> iterador1;
Iterator<Libro> iterador2;
```

Avanza dos veces en el primero y una vez en el segundo.

Comprueba que mantienen posiciones independientes.

---

## Ejercicio 4 - NoSuchElementException

Intenta llamar a:

```java
next();
```

después de terminar el recorrido.

Comprueba que se lanza la excepción correspondiente.

---

## Ejercicio 5 - Recorrido de números pares

Diseña una colección de números y un iterador que devuelva únicamente:

```text
2
4
6
8
...
```

sin que el cliente tenga que filtrar manualmente.

---

## Ejercicio 6 - Árbol binario

Diseña un árbol con los valores:

```text
        8
       / \
      4   12
     / \  / \
    2  6 10 14
```

Implementa conceptualmente recorridos:

```text
Preorden
Inorden
Postorden
```

Compara los resultados.

---

## Ejercicio 7 - Iterator vs. Stream

Dada una colección de libros, obtén los títulos de los libros de un determinado autor utilizando:

1. `Iterator<Libro>`.
2. `Stream<Libro>`.

Compara ambas soluciones en términos de:

```text
legibilidad
flexibilidad
control de recorrido
```

---

## Ejercicio 8 - Modificaciones durante el recorrido

Crea una lista:

```java
List<String> nombres = new ArrayList<>();
```

Intenta eliminar elementos durante un `for-each`.

Después utiliza:

```java
Iterator.remove();
```

cuando sea compatible.

Explica qué diferencias observas.

---

## Ejercicio 9 - Encapsulación

Modifica una biblioteca para impedir que los clientes accedan directamente a su lista interna.

Comprueba que pueden seguir recorriendo sus elementos mediante:

```java
Iterable<Libro>
```

---

## Ejercicio 10 - Iterator o solución directa

Analiza:

### Caso A

Tenemos un `ArrayList` y solo queremos mostrar sus elementos.

### Caso B

Tenemos un árbol personalizado con varios recorridos.

### Caso C

Queremos integrar una colección propia con `for-each`.

### Caso D

Queremos transformar elementos mediante filtros y operaciones encadenadas.

Decide entre:

```text
for-each
Iterator
Stream
```

y justifica tu elección.