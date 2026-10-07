# 📝 Ejercicios propuestos

## Ejercicio 1 - Sistema de archivos

Amplía el ejemplo para añadir:

```text
EnlaceSimbolico
```

Debe implementar:

```java
ElementoSistema
```

Define qué debería devolver:

```java
obtenerTamano()
```

y justifica tu decisión.

---

## Ejercicio 2 - Contar elementos

Añade:

```java
int contarElementos();
```

El comportamiento debería ser:

```text
Archivo
   ↓
1

Carpeta
   ↓
1 + todos sus descendientes
```

Implementa la operación de forma recursiva.

---

## Ejercicio 3 - Buscar archivos

Añade una operación:

```java
buscar(String nombre)
```

que recorra toda la estructura.

Reflexiona:

> **¿Debería estar esta operación en Component o en otro servicio?**

Justifica tu diseño.

---

## Ejercicio 4 - Interfaz gráfica

Diseña un Composite para:

```text
ComponenteUI
```

con:

```text
Boton
Texto
Panel
```

`Panel` debe poder contener otros `ComponenteUI`.

Todos deberán implementar:

```java
renderizar();
```

---

## Ejercicio 5 - Productos y cajas

Diseña:

```text
ElementoEnvio
```

con:

```text
Producto
Caja
```

Cada elemento debe proporcionar:

```java
double obtenerPeso();
```

Una caja puede contener productos u otras cajas.

---

## Ejercicio 6 - Composite seguro o transparente

Implementa las dos variantes:

### Variante A

```text
agregar()
eliminar()
```

solo en `Carpeta`.

### Variante B

Estas operaciones forman parte de:

```java
ElementoSistema
```

Compara:

- seguridad;
- uniformidad;
- facilidad de uso;
- coherencia semántica.

---

## Ejercicio 7 - Evitar ciclos

Imagina:

```text
Carpeta A contiene Carpeta B
```

y después intentamos:

```text
Carpeta B contiene Carpeta A
```

Diseña una estrategia para impedir esta situación.