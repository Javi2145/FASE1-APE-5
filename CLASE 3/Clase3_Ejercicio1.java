import java.io.File;
import java.io.IOException;

public class Clase3_Ejercicio1 {
    public static void main(String[] args) {
        File archivo = new File("datos/prueba.txt");

        // Se crea la carpeta "datos" si no existe
        if (archivo.getParentFile() != null && !archivo.getParentFile().exists()) {
            archivo.getParentFile().mkdirs();
        }

        // 1. Comprobación previa
        if (!archivo.exists()) {
            // 2. Creación controlada
            try {
                if (archivo.createNewFile()) {
                    System.out.println("El archivo no existía y fue creado.");
                }
            } catch (IOException e) {
                System.out.println("Error de E/S al crear el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo ya existía.");
        }

        // 3. Extracción de información
        System.out.println("Nombre: " + archivo.getName());
        System.out.println("Ruta: " + archivo.getPath());
    }
}
