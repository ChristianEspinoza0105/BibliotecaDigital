# BibliotecaDigital
> Alumno: Gustavo Christian Espinoza Cuevas

> Código: 22310360

> Materia: Computación Paralela

El objetivo del proyecto es crear una aplicación que permita gestionar una colección de libros de manera eficiente y accesible. Este sistema integrará funcionalidades avanzadas, base de datos con cientos de libros, algoritmos de ordenamiento y búsqueda, manejo de concurrencia con monitores, modelo productor-consumidor para la lectura de libros en tiempo real, y un servidor web con sockets para la interacción del usuario.

# Funcionalidades

## Ingreso de Datos

El sistema permitirá a los administradores/productores agregar nuevos libros manualmente a través de una interfaz amigable.

### Detalles Técnicos

- **Formulario de Ingreso:** Interfaz gráfica para la entrada de datos de nuevos libros.
- **Validación de Datos:** Se implementarán validaciones para asegurar que los datos ingresados sean correctos y completos.

## Uso de Monitores

Para manejar la concurrencia y asegurar la integridad de los datos, se utilizarán monitores que sincronizarán el acceso y actualización de la base de datos de libros entre múltiples hilos.

### Detalles Técnicos

- **Monitores:** Implementación de monitores en Java para sincronizar el acceso concurrente.
- **Bloqueos:** Se utilizarán bloqueos para prevenir conflictos y asegurar la consistencia de los datos.

## Modelo Productor-Consumidor

El **productor** enviará las páginas de los libros directamente al **usuario** en tiempo real, permitiendo que los usuarios lean mientras las páginas se cargan progresivamente. A continuación se describen los componentes y la implementación técnica.

### Detalles Técnicos

- **Hilos de Productor:**
    - Cada hilo productor será responsable de un libro específico.
    - Cuando un usuario solicita la lectura de un libro, se crea un hilo productor que comienza a enviar las páginas.
- **Hilos de Consumidor:**
    - Cada hilo consumidor corresponde a un usuario que está leyendo.
    - El hilo consumidor manejará la recepción y visualización de las páginas en tiempo real.

## Lectura y Búsqueda de Palabras en Archivos

El sistema permitirá buscar palabras clave en los textos de los libros digitalizados utilizando hilos para realizar búsquedas eficientes.

### Detalles Técnicos

- **Lectura de Archivos:** Implementación de métodos para leer textos de libros digitalizados.
- **Búsqueda de Palabras:** Uso de hilos para realizar búsquedas concurrentes y rápidas dentro de los textos.

## Servidor Web con Sockets

Se creará un servidor web que permitirá a los usuarios buscar y solicitar libros a través de sockets, facilitando la interacción en tiempo real.

### Detalles Técnicos

- **Servidor Web:** Implementación de un servidor web en Java.
