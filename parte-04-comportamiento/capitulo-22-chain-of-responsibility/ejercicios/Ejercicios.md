# 📝 Ejercicios propuestos

## Ejercicio 1 - Rate Limit

Crea:

```java
RateLimitHandler
```

y sitúalo antes de:

```text
AutenticacionHandler
```

La cadena debería quedar:

```text
RateLimit
   ↓
Autenticación
   ↓
Autorización
   ↓
Validación
```

---

## Ejercicio 2 - Antivirus

Añade:

```java
AntivirusHandler
```

que pueda detener la cadena cuando detecte contenido no permitido.

---

## Ejercicio 3 - Aprobación de gastos

Diseña una cadena:

```text
Supervisor
   ↓
Manager
   ↓
Director
```

Cada Handler debe aprobar hasta un importe máximo.

Ejemplo:

```text
Supervisor → hasta 500 €
Manager → hasta 5.000 €
Director → sin límite
```

La cadena debe detenerse cuando alguien apruebe.

---

## Ejercicio 4 - Soporte técnico

Diseña:

```text
Nivel1Handler
Nivel2Handler
Nivel3Handler
```

Cada nivel debe decidir si puede resolver una incidencia o pasarla al siguiente.

---

## Ejercicio 5 - Cambiar el orden

Compara:

```text
Autenticación
↓
Validación
```

con:

```text
Validación
↓
Autenticación
```

Pregunta:

> **¿Puede el orden afectar al comportamiento o seguridad?**

Justifica tu respuesta.

---

## Ejercicio 6 - Chain vs. Command

Analiza:

### Caso A

Queremos almacenar una acción para ejecutarla mañana.

### Caso B

Una petición debe pasar por varias validaciones.

### Caso C

Queremos implementar Undo.

### Caso D

Una incidencia debe escalar hasta encontrar quien pueda resolverla.

Decide entre:

```text
Command
Chain of Responsibility
```

---

## Ejercicio 7 - Cadena dinámica

Crea dos cadenas diferentes:

```text
API_PUBLICA
```

con:

```text
RateLimit
↓
Validación
↓
Logging
```

y:

```text
ADMIN
```

con:

```text
Autenticación
↓
Autorización
↓
Auditoría
```

Reutiliza los Handlers cuando sea posible.

---

## Ejercicio 8 - Logging de la cadena

Añade trazabilidad para saber:

```text
qué Handlers se ejecutaron
cuánto tardó cada uno
dónde se detuvo la petición
```

Reflexiona sobre cómo facilitar el debugging.