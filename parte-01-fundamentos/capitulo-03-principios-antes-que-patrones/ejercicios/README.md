# 📝 Ejercicios propuestos

## Ejercicio 1 - Detectar responsabilidades

Analiza la siguiente clase:

```java
public class UsuarioService {

    public void registrarUsuario() {
        // ...
    }

    public void validarEmail() {
        // ...
    }

    public void guardarEnBaseDatos() {
        // ...
    }

    public void enviarEmailBienvenida() {
        // ...
    }

    public void generarPDF() {
        // ...
    }
}
```

Identifica las diferentes responsabilidades que contiene.

¿Consideras que deberían permanecer todas en la misma clase?

Justifica tu respuesta.

---

## Ejercicio 2 - Identificar acoplamiento

Observa:

```java
public class ServicioPedidos {

    private final MySQLPedidoRepository repository;

    public ServicioPedidos() {
        repository = new MySQLPedidoRepository();
    }
}
```

Responde:

1. ¿De qué implementación depende directamente?
2. ¿Qué ocurriría si cambiamos MySQL?
3. ¿Podríamos introducir una abstracción?
4. ¿Qué ventajas tendría?

---

## Ejercicio 3 - Buscar simplicidad

Imagina una aplicación que solamente tiene:

```text
3 clases
20 usuarios
1 base de datos
```

¿Tendría sentido introducir múltiples interfaces, factories y capas de abstracción "por si algún día crece"?

Explica qué factores tendrías en cuenta antes de hacerlo.

---

## Ejercicio 4 - Diseñar pensando en el cambio

Piensa en una aplicación que utilices habitualmente.

Identifica:

1. Una parte que probablemente cambie.
2. Una parte que debería permanecer estable.
3. Qué dependencias existen entre ambas.
4. Cómo podrías reducir el impacto del cambio.
