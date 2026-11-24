# 📝 Ejercicios propuestos

## Ejercicio 1 - Visitante Markdown

Implementa:

```java
VisitanteMarkdown
```

que permita convertir:

```text
Parrafo
Imagen
Tabla
```

a una representación Markdown.

Comprueba que puedes añadir la operación sin modificar las clases de elementos.

---

## Ejercicio 2 - Estadísticas avanzadas

Amplía:

```java
VisitanteEstadisticas
```

para calcular:

```text
Número de párrafos
Número de imágenes
Número de tablas
Número total de caracteres
Número total de celdas
```

---

## Ejercicio 3 - Añadir Video

Crea:

```java
Video
```

como nuevo:

```java
ElementoDocumento
```

Modifica:

```java
VisitanteDocumento
```

y adapta todos los visitantes existentes.

Reflexiona sobre el coste de añadir nuevos tipos.

---

## Ejercicio 4 - Doble despacho

Analiza:

```java
ElementoDocumento elemento = new Parrafo("Hola");
```

Después:

```java
elemento.aceptar(new VisitanteHTML());
```

Explica paso a paso:

1. Qué implementación de `aceptar()` se ejecuta.
2. Qué sobrecarga de `visitar()` se selecciona.
3. Qué implementación concreta del visitante se ejecuta.

---

## Ejercicio 5 - Visitor o Strategy

Analiza:

### Caso A

Una aplicación debe elegir entre diferentes algoritmos de compresión.

### Caso B

Un documento contiene varios tipos de elementos y queremos exportarlos a HTML.

### Caso C

Queremos intercambiar algoritmos de cálculo.

### Caso D

Queremos generar estadísticas sobre una estructura de objetos heterogéneos.

Decide entre:

```text
Strategy
Visitor
```

y justifica.

---

## Ejercicio 6 - Visitor + Iterator

Crea una colección de elementos que implemente:

```java
Iterable<ElementoDocumento>
```

Recórrela utilizando:

```java
for-each
```

y aplica un visitante a cada elemento.

---

## Ejercicio 7 - Árbol de expresiones

Diseña una estructura con:

```text
Numero
Suma
Multiplicacion
```

Implementa:

```java
EvaluarVisitor
```

para calcular el resultado.

Después crea:

```java
ImprimirVisitor
```

para generar una representación textual.

---

## Ejercicio 8 - Visitor + Composite

Diseña un árbol de componentes:

```text
Documento
    │
    ├── Seccion
    │     ├── Parrafo
    │     └── Imagen
    │
    └── Seccion
          └── Tabla
```

Permite recorrerlo y aplicar diferentes visitantes.

---

## Ejercicio 9 - Visitor vs. solución directa

Tenemos:

```text
dos tipos de elementos
+
una única operación
```

Pregunta:

> **¿Aplicarías Visitor?**

Analiza si una implementación más sencilla podría resultar suficiente.

---

## Ejercicio 10 - Evolución del modelo

Imagina dos proyectos.

### Proyecto A

Tiene:

```text
20 tipos de elementos estables
```

y cada mes aparecen:

```text
nuevas operaciones
```

### Proyecto B

Tiene:

```text
3 operaciones estables
```

pero cada mes aparecen:

```text
nuevos tipos de elementos
```

Pregunta:

> **¿En cuál de los dos proyectos tendría más sentido Visitor?**

Justifica tu respuesta.