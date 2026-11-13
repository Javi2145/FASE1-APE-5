<p align="center">
  <img src="banner.svg" alt="FASE 1 APE 5" width="100%">
</p>



Ejercicios prácticos en **Java** sobre **manejo de archivos (E/S)**, organizados por clase. Cada clase aumenta un poco la dificultad: primero se crean y eliminan archivos, luego se escriben datos desde el teclado y al final se aplica un manejo más robusto de recursos y errores.

## Estructura del repositorio

```
FASE1-APE-5/
├── CLASE 1/
│   ├── Clase1_Ejercicio1.java
│   ├── Clase1_Ejercicio2.java
│   └── Clase1_Ejercicio3.java
├── CLASE 2/
│   ├── Ejercicio1Clase2 (1).java
│   ├── Ejercicio2Clase2 (1).java
│   └── Ejercicio3Clase2 (1).java
├── CLASE 3/
│   ├── Clase3_Ejercicio1.java
│   ├── Clase3_Ejercicio2.java
│   ├── Clase3_Ejercicio3.java
│   └── Clase3_Ejercicio4.java
├── banner.svg
└── README.md
```

## Clase 1: Operaciones básicas con archivos

Uso de la clase `File`, `FileWriter` y `Scanner`.

| Archivo | Descripción |
|---|---|
| `Clase1_Ejercicio1.java` | Crea el archivo `curso.txt` con `createNewFile()`, avisa si ya existía y muestra su nombre. |
| `Clase1_Ejercicio2.java` | Pide un mensaje por teclado y lo guarda en `estudiantes.txt` con `FileWriter` en modo *append* (conserva el contenido anterior). |
| `Clase1_Ejercicio3.java` | Elimina el archivo `estudiantes.txt` con `delete()` y confirma si se pudo borrar. |

## Clase 2: Escritura con `BufferedWriter` y datos del usuario

Uso de `BufferedWriter`, `try-with-resources` y validaciones numéricas.

| Archivo | Descripción |
|---|---|
| `Ejercicio1Clase2 (1).java` | Registra el nombre y la calificación de 3 estudiantes en `estudiantes.txt`. |
| `Ejercicio2Clase2 (1).java` | Registra productos (nombre, precio, cantidad) en `productos.txt`, calcula el valor total de cada uno y repite mientras el usuario responda "s". |
| `Ejercicio3Clase2 (1).java` | Registra ventas en `ventas.txt`: calcula subtotal, aplica un 10 % de descuento si el subtotal es ≥ $100 y guarda el total acumulado al finalizar con "fin". |

## Clase 3: Directorios y manejo seguro de recursos

Uso de `mkdirs()`, bloques `try-catch-finally` y cierre manual de flujos.

| Archivo | Descripción |
|---|---|
| `Clase3_Ejercicio1.java` | Crea la carpeta `datos/` si no existe y el archivo `prueba.txt` dentro; muestra su nombre y ruta. |
| `Clase3_Ejercicio2.java` | Genera `materias.txt` con una lista de 5 asignaturas usando `BufferedWriter` y cierre en `finally`. |
| `Clase3_Ejercicio3.java` | Añade nuevas asignaturas (Inglés y Cálculo Diferencial) al final de `materias.txt` sin borrar lo existente. |
| `Clase3_Ejercicio4.java` | Crea `datos/temporal.txt` y lo elimina con `delete()`, mostrando el resultado de la operación. |

## Conceptos aplicados

- Creación, verificación y eliminación de archivos y carpetas (`File`, `createNewFile`, `mkdirs`, `delete`)
- Escritura en archivos de texto (`FileWriter`, `BufferedWriter`)
- Modo *append* para conservar datos existentes
- Manejo de excepciones (`IOException`, `try-catch`, `try-with-resources`, `finally`)
- Lectura de datos por consola con `Scanner`

## Cómo ejecutar

```bash
javac NombreDelArchivo.java
java NombreDeLaClase
```
