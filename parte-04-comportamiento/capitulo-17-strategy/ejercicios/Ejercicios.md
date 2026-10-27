# 📝 Ejercicios propuestos

## Ejercicio 1 - Añadir Bizum

Implementa:

```java
PagoBizum
```

como nueva:

```java
EstrategiaPago
```

Utilízala sin modificar:

```java
ProcesadorPago
```

---

## Ejercicio 2 - Métodos de envío

Diseña:

```java
EstrategiaEnvio
```

con:

```text
EnvioEstandar
EnvioExpress
RecogidaTienda
```

Cada estrategia deberá calcular:

```java
double calcularCoste();
```

---

## Ejercicio 3 - Descuentos

Diseña:

```java
EstrategiaDescuento
```

con:

```text
SinDescuento
DescuentoVIP
BlackFriday
```

El contexto deberá calcular el precio final de un producto.

---

## Ejercicio 4 - Lambdas

Convierte:

```java
EstrategiaDescuento
```

en:

```java
@FunctionalInterface
```

Después crea las estrategias mediante lambdas.

Compara esta solución con crear una clase para cada Strategy.

---

## Ejercicio 5 - Strategy o `if`

Tenemos:

```java
if (esMayorEdad) {
    permitirAcceso();
}
```

Pregunta:

> **¿Aplicarías Strategy?**

Justifica tu respuesta.

---

## Ejercicio 6 - Refactorizar condicionales

Tenemos:

```java
public double calcularEnvio(
        String tipo,
        double peso) {

    if (tipo.equals("ESTANDAR")) {

        return peso * 1.5;

    } else if (
        tipo.equals("EXPRESS")
    ) {

        return peso * 3.0;

    } else if (
        tipo.equals("INTERNACIONAL")
    ) {

        return peso * 6.0;
    }

    throw new IllegalArgumentException();
}
```

Refactorízalo utilizando Strategy.

---

## Ejercicio 7 - Strategy vs. State

Analiza estos casos:

### Caso A

El usuario elige entre:

```text
Tarjeta
PayPal
Transferencia
```

### Caso B

Un pedido cambia entre:

```text
Creado
Pagado
Enviado
Entregado
```

Pregunta:

> **¿Cuál parece Strategy y cuál parece State?**

Justifica tu respuesta.