// Creamos el prototipo original:

ConfiguracionPagina configuracion = new ConfiguracionPagina(
    "A4",
    "vertical",
    20
);

Documento original = new Documento(
    "Plantilla de informe",
    "Contenido base",
    "Departamento de Ingeniería",
    "es",
    "PDF",
    configuracion
);

// Ahora podemos clonarlo:

Documento copia = original.clonar();

// Y modificar únicamente aquello que necesitamos:

copia.setTitulo(
    "Informe septiembre"
);

copia.setContenido(
    "Contenido del informe de septiembre"
);