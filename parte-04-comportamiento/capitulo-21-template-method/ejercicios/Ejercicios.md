# 📝 Ejercicios propuestos

## Ejercicio 1 - Procesador Markdown

Crea:

```java
ProcesadorMarkdown
```

que extienda:

```java
ProcesadorDocumento
```

Personaliza:

```text
generarContenido()
aplicarFormato()
```

sin modificar el Template Method.

---

## Ejercicio 2 - Hook

Añade:

```java
protected void antesDeGuardar() {
}
```

al proceso.

Haz que:

```text
ProcesadorPDF
```

lo utilice para:

```text
firmar digitalmente
```

el documento.

---

## Ejercicio 3 - Importadores

Diseña:

```text
ImportadorDatos
```

con el flujo:

```text
abrir
leer
parsear
validar
guardar
cerrar
```

Implementa:

```text
ImportadorCSV
ImportadorJSON
ImportadorXML
```

---

## Ejercicio 4 - Template Method o Strategy

Analiza:

### Caso A

Todos los informes siguen:

```text
cargar
procesar
formatear
guardar
```

pero cambia cómo se formatean.

### Caso B

Una aplicación puede ordenar mediante:

```text
QuickSort
MergeSort
HeapSort
```

y queremos intercambiar el algoritmo en runtime.

Decide entre:

```text
Template Method
Strategy
```

y justifica.

---

## Ejercicio 5 - Eliminar duplicación

Partimos de tres clases que contienen:

```text
80 % del mismo proceso
20 % diferente
```

Refactorízalas utilizando Template Method.

---

## Ejercicio 6 - Template Method `final`

Elimina:

```java
final
```

de:

```java
procesar();
```

y sobrescribe el método desde una subclase cambiando el orden.

Analiza qué problemas podrían aparecer.

---

## Ejercicio 7 - Demasiados hooks

Imagina una clase base con:

```text
15 hooks
```

Analiza:

- legibilidad;
- acoplamiento;
- complejidad;
- mantenibilidad.

Pregunta:

> **¿Seguirías utilizando Template Method o considerarías composición?**

---

## Ejercicio 8 - Factory Method + Template Method

Añade al proceso:

```java
protected abstract Documento crearDocumento();
```

Haz que cada subclase cree su tipo de documento.

Analiza cómo pueden colaborar ambos patrones.