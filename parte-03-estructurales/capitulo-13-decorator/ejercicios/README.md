# 📝 Ejercicios propuestos

## Ejercicio 1 - Compresión

Añade:

```text
CompresionDecorator
```

Debe modificar el mensaje antes de delegar.

Después combina:

```text
Cifrado
+
Compresión
+
Email
```

---

## Ejercicio 2 - Auditoría

Crea:

```text
AuditoriaDecorator
```

que registre:

```text
fecha
mensaje
resultado
```

antes o después del envío.

---

## Ejercicio 3 - Orden de decoradores

Compara:

```java
new CifradoDecorator(
    new CompresionDecorator(
        new NotificacionEmail()
    )
);
```

con:

```java
new CompresionDecorator(
    new CifradoDecorator(
        new NotificacionEmail()
    )
);
```

Responde:

> **¿El orden puede modificar el comportamiento?**

Explica por qué.

---

## Ejercicio 4 - Cafetería

Diseña:

```text
Bebida
```

con:

```java
double precio();
String descripcion();
```

Implementa:

```text
Cafe
LecheDecorator
AzucarDecorator
CarameloDecorator
```

Permite construir:

```text
Café + leche + caramelo
```

sin crear una subclase específica para esa combinación.

---

## Ejercicio 5 - Decorator o herencia

Tenemos:

```text
Documento
```

y solo necesitamos una variante fija:

```text
DocumentoFirmado
```

No habrá combinaciones adicionales.

Pregunta:

> **¿Utilizarías Decorator o una solución más sencilla?**

Justifica tu respuesta.

---

## Ejercicio 6 - Decorator vs. Adapter

Analiza:

### Caso A

Queremos añadir logging a un servicio manteniendo su interfaz.

### Caso B

Queremos hacer compatible una API externa que utiliza métodos diferentes.

### Caso C

Queremos añadir cifrado y compresión opcionalmente.

Decide si utilizarías:

```text
Decorator
Adapter
Otro enfoque
```

---

## Ejercicio 7 - Decoradores excesivos

Imagina una cadena:

```text
A
↓
B
↓
C
↓
D
↓
E
↓
F
↓
G
↓
Componente
```

Analiza:

- legibilidad;
- debugging;
- orden;
- mantenimiento.

Propón alguna estrategia para simplificar su construcción.