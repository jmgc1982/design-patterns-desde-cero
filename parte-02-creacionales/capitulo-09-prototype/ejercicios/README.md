# 📝 Ejercicios propuestos

## Ejercicio 1 - Documento

Implementa:

```java
Prototype<T>
```

y una clase:

```text
Documento
```

con:

```text
titulo
contenido
autor
idioma
```

Crea un documento original y genera una copia mediante:

```java
clonar()
```

Comprueba que:

```java
original == copia
```

devuelve:

```text
false
```

---

## Ejercicio 2 - Shallow Copy

Añade:

```java
ConfiguracionPagina
```

al documento.

Realiza una copia superficial.

Después modifica la configuración del documento original.

Observa qué ocurre con la copia.

Explica por qué.

---

## Ejercicio 3 - Deep Copy

Modifica el ejercicio anterior para realizar una copia profunda.

Comprueba que cambiar:

```text
ConfiguracionPagina
```

en el original no modifica la copia.

---

## Ejercicio 4 - Registro de prototipos

Implementa:

```java
RegistroPrototipos
```

que permita registrar:

```text
"informe"
"factura"
"carta"
```

Cada elemento deberá contener un `Documento` previamente configurado.

Permite crear nuevas instancias mediante:

```java
registro.crear("informe");
```

---

## Ejercicio 5 - Prototype o Builder

Analiza estos casos:

### Caso A

Un objeto con quince parámetros opcionales.

### Caso B

Un documento cuya configuración cuesta varios segundos y necesitamos crear veinte copias similares.

### Caso C

Un objeto:

```text
Punto(x, y)
```

### Caso D

Un ordenador que queremos configurar paso a paso.

Decide entre:

```text
Builder
Prototype
Constructor normal
```

y justifica cada decisión.

---

## Ejercicio 6 - Constructor de copia

Reimplementa `Documento` utilizando:

```java
public Documento(
        Documento original)
```

en lugar de:

```java
clonar()
```

Compara ambas soluciones.

Pregunta:

> **¿Cuál te parece más clara en este contexto?**