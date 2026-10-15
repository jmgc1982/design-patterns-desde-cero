# 📝 Ejercicios propuestos

## Ejercicio 1 - Sistema de cine

Tenemos:

```text
Proyector
Amplificador
Pantalla
Luces
Reproductor
```

Cada uno dispone de sus propias operaciones.

Crea:

```java
CineFacade
```

con:

```java
verPelicula(String pelicula);
terminarPelicula();
```

El cliente no debería coordinar directamente todos los componentes.

---

## Ejercicio 2 - Pedido

Amplía:

```java
TiendaFacade
```

para incorporar:

```text
FacturaService
```

Después de crear el envío deberá generarse también una factura.

---

## Ejercicio 3 - Cancelación

Añade:

```java
cancelarPedido(...)
```

que coordine:

```text
devolver stock
cancelar pago
cancelar envío
enviar notificación
```

Reflexiona:

> **¿Sigue estando cohesionada nuestra Facade?**

---

## Ejercicio 4 - Inyección de dependencias

Refactoriza:

```java
TiendaFacade
```

para recibir sus dependencias mediante el constructor.

Compara esta solución con crear internamente:

```java
new InventarioService();
new PagoService();
...
```

---

## Ejercicio 5 - ¿Facade o Adapter?

Decide qué patrón parece más adecuado.

### Caso A

Una API externa utiliza:

```java
makePayment()
```

y nuestra aplicación espera:

```java
pagar()
```

### Caso B

Completar un pedido requiere coordinar cinco servicios.

### Caso C

Una librería multimedia contiene diez clases y queremos ofrecer:

```java
convertirVideo();
```

### Caso D

Dos componentes utilizan formatos de datos incompatibles.

Justifica cada respuesta.

---

## Ejercicio 6 - Detectar una Facade gigante

Imagina:

```text
ApplicationFacade
│
├── login()
├── logout()
├── crearUsuario()
├── procesarPago()
├── crearPedido()
├── enviarEmail()
├── generarFactura()
├── consultarStock()
├── generarInforme()
├── importarDatos()
└── ...
```

Analiza:

- cohesión;
- responsabilidades;
- acoplamiento;
- mantenibilidad.

Propón una posible división.

---

## Ejercicio 7 - ¿Necesitamos realmente Facade?

Tenemos:

```java
public class Conversor {

    public void convertir() {
        // ...
    }
}
```

El cliente solamente necesita llamar:

```java
conversor.convertir();
```

Pregunta:

> **¿Añadirías `ConversorFacade`?**

Justifica tu decisión.

Recuerda:

> **No utilizar ningún patrón también puede ser la mejor solución.**