# 📝 Ejercicios propuestos

## Ejercicio 1 - Usuario

Implementa un Builder para:

```java
Usuario
```

con:

```text
nombre
email
telefono
direccion
edad
activo
```

Considera obligatorios:

```text
nombre
email
```

El resto serán opcionales.

---

## Ejercicio 2 - Validación

Modifica:

```java
build()
```

para impedir:

- nombres vacíos;
- emails vacíos;
- edades negativas.

---

## Ejercicio 3 - Ordenador

Crea una clase:

```text
Ordenador
```

con:

```text
CPU
RAM
almacenamiento
GPU
sistemaOperativo
wifi
bluetooth
```

Implementa un Builder que permita construir diferentes configuraciones.

---

## Ejercicio 4 - Director

Añade:

```java
DirectorOrdenador
```

con dos configuraciones:

```text
construirOrdenadorOficina()
construirOrdenadorGaming()
```

Analiza si el `Director` mejora realmente el diseño.

---

## Ejercicio 5 - ¿Builder o constructor?

Decide qué opción utilizarías en cada caso:

### Caso A

```text
Punto(x, y)
```

### Caso B

```text
Usuario
- nombre
- email
- teléfono
- dirección
- ciudad
- país
- edad
- activo
```

### Caso C

```text
Color(r, g, b)
```

### Caso D

Una petición HTTP con:

```text
URL
método
headers
body
timeout
autenticación
cookies
redirects
```

Justifica cada decisión.

---

## Ejercicio 6 - Detectar un Builder innecesario

Analiza:

```java
public class Nombre {

    private final String valor;

    private Nombre(Builder builder) {

        this.valor = builder.valor;
    }

    public static class Builder {

        private String valor;

        public Builder valor(String valor) {

            this.valor = valor;
            return this;
        }

        public Nombre build() {

            return new Nombre(this);
        }
    }
}
```

Pregunta:

> **¿Aporta Builder suficiente valor en este caso?**

Razona tu respuesta.