# 📝 Ejercicios propuestos

## Ejercicio 1 - Añadir un dispositivo

Implementa:

```text
Proyector
```

como nueva implementación de:

```java
Dispositivo
```

Comprueba que puedes utilizarlo con:

```text
Mando
MandoAvanzado
```

sin modificar esas clases.

---

## Ejercicio 2 - Añadir una abstracción

Crea:

```text
MandoConVoz
```

que permita ejecutar:

```java
ejecutarComando(String comando)
```

Debe poder utilizarse con cualquier implementación de `Dispositivo`.

---

## Ejercicio 3 - Identificar la explosión de clases

Imagina:

```text
3 tipos de notificación
```

y:

```text
4 canales
```

Calcula cuántas clases podríamos necesitar si modelamos cada combinación mediante herencia.

Después diseña una posible estructura Bridge.

---

## Ejercicio 4 - Bridge o Adapter

Decide qué patrón parece más adecuado.

### Caso A

Tenemos una API antigua con:

```text
sendMessage()
```

y nuestra aplicación espera:

```text
enviar()
```

### Caso B

Tenemos:

```text
NotificacionNormal
NotificacionUrgente
```

y:

```text
Email
SMS
Push
```

Ambas dimensiones evolucionarán independientemente.

### Caso C

Una librería externa devuelve pulgadas y nuestra aplicación utiliza centímetros.

Justifica cada decisión.

---

## Ejercicio 5 - Diseño sin Bridge

Implementa primero:

```text
MandoTV
MandoRadio
MandoAvanzadoTV
MandoAvanzadoRadio
```

Después añade:

```text
Proyector
```

Observa cuántas nuevas clases necesitas.

Refactoriza finalmente utilizando Bridge.

---

## Ejercicio 6 - ¿Realmente necesitamos Bridge?

Tenemos:

```text
InformePDF
InformeHTML
```

y no esperamos nuevos formatos ni nuevas dimensiones de variación.

Pregunta:

> **¿Aplicarías Bridge?**

Justifica la decisión.

Recuerda:

> **No utilizar ningún patrón también puede ser una buena decisión de diseño.**
