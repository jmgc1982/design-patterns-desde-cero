# 📝 Ejercicios propuestos

## Ejercicio 1 - Detectar responsabilidades

Analiza:

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

Identifica todas las responsabilidades que contiene.

Después responde:

> ¿Qué partes podrían cambiar de forma independiente?

---

## Ejercicio 2 - Detectar duplicación

Analiza dos métodos que contengan lógica prácticamente idéntica.

Identifica:

- Código duplicado.
- Posibles problemas.
- Qué ocurriría si la lógica cambia.
- Cómo podrías mejorar el diseño.

---

## Ejercicio 3 - Detectar overengineering

Imagina una aplicación con:

```text
10 usuarios
3 clases
1 base de datos
1 único tipo de notificación
```

Un desarrollador propone crear:

```text
Factory
Abstract Factory
Builder
Strategy
Observer
Mediator
```

¿Consideras que es una buena decisión?

Justifica tu respuesta.

---

## Ejercicio 4 - Analizar acoplamiento

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

1. ¿Qué dependencia existe?
2. ¿Qué ocurre si cambiamos MySQL?
3. ¿Cómo podríamos reducir el acoplamiento?
4. ¿Necesitamos realmente hacerlo en este contexto?

---

## Ejercicio 5 - Reflexión

Piensa en un proyecto en el que hayas trabajado.

¿Recuerdas alguna clase que terminara haciendo demasiadas cosas?

Describe:

- Qué responsabilidades tenía.
- Por qué terminó creciendo.
- Qué problemas generaba.
- Cómo la rediseñarías actualmente.