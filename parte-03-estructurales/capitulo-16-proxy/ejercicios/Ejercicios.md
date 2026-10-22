# 📝 Ejercicios propuestos

## Ejercicio 1 - Lazy Image

Implementa:

```text
Imagen
ImagenReal
ProxyImagen
```

Comprueba que:

```text
ImagenReal
```

solo se crea al ejecutar:

```java
mostrar();
```

por primera vez.

---

## Ejercicio 2 - Protection Proxy

Crea:

```java
public interface Documento {

    void eliminar();
}
```

Implementa:

```text
DocumentoReal
DocumentoProxy
```

Solo:

```text
ADMIN
```

debe poder eliminar documentos.

---

## Ejercicio 3 - Caching Proxy

Crea:

```java
public interface ServicioClima {

    String obtenerTemperatura(
        String ciudad
    );
}
```

Implementa un servicio real costoso y un Proxy que guarde respuestas por ciudad.

---

## Ejercicio 4 - Logging Proxy

Añade un Proxy que registre:

```text
fecha
operación
duración
resultado
```

antes y después de delegar.

---

## Ejercicio 5 - Proxy vs. Decorator

Analiza:

### Caso A

Queremos añadir compresión a una respuesta.

### Caso B

Queremos bloquear el acceso según permisos.

### Caso C

Queremos retrasar la creación del objeto.

### Caso D

Queremos añadir logging funcional opcional.

Decide entre:

```text
Proxy
Decorator
Otro enfoque
```

y justifica.

---

## Ejercicio 6 - Remote Proxy conceptual

Diseña una interfaz:

```java
public interface Catalogo {

    Producto obtener(
        long id
    );
}
```

Imagina que la implementación real está en otro servidor.

Diseña una clase:

```text
CatalogoRemoteProxy
```

que conceptualmente realizaría:

```text
HTTP
serialización
deserialización
```

No es necesario implementar la red real.

---

## Ejercicio 7 - Proxy innecesario

Tenemos:

```java
public class Calculadora {

    public int sumar(
            int a,
            int b) {

        return a + b;
    }
}
```

No existe:

```text
seguridad
caché
red
coste de creación
```

Pregunta:

> **¿Crearías `CalculadoraProxy`?**

Justifica tu respuesta.