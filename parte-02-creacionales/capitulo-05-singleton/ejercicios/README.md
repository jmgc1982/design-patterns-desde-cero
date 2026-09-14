# 📝 Ejercicios propuestos

## Ejercicio 1 - Implementación básica

Implementa una clase:

```text
Configuracion
```

que utilice Singleton.

Debe:

- Tener un constructor privado.
- Mantener una única instancia.
- Proporcionar un método `getInstance()`.

Comprueba que:

```java
config1 == config2
```

devuelve:

```text
true
```

---

## Ejercicio 2 - Singleton con información

Añade a `Configuracion`:

```text
entorno
urlApi
nivelLog
```

y permite consultar estos valores desde la instancia Singleton.

---

## Ejercicio 3 - Detectar el problema

Analiza:

```java
public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }
}
```

Responde:

1. ¿Qué ocurre si dos hilos llaman simultáneamente a `getInstance()`?
2. ¿Podrían crearse dos instancias?
3. ¿Cómo solucionarías el problema?

---

## Ejercicio 4 - ¿Realmente necesitamos Singleton?

Analiza estas situaciones:

### Caso A

Una aplicación necesita una configuración global y única.

### Caso B

Una aplicación tiene un servicio que actualmente solamente utiliza una instancia.

### Caso C

Una clase necesita acceder a una base de datos.

### Caso D

Una clase mantiene el estado de la sesión del usuario.

Para cada caso responde:

> **¿Utilizarías Singleton? ¿Por qué?**

---

## Ejercicio 5 - Buscar una alternativa

Transforma este diseño:

```java
public class ServicioPedidos {

    public void procesar() {

        Configuracion config =
                Configuracion.getInstance();

        // ...
    }
}
```

para que `Configuracion` sea proporcionada mediante el constructor.

Compara ambos diseños.