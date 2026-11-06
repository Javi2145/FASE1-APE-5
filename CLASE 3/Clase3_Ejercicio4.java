import java.io.File;
import java.io.IOException;

public class Clase3_Ejercicio4 {
    public static void main(String[] args) {
        // 1. Objeto File con la ruta indicada
        File archivo = new File("datos/temporal.txt");

        // Se crea la carpeta "datos" si no existe
        if (archivo.getParentFile() != null && !archivo.getParentFile().exists()) {
            archivo.getParentFile().mkdirs();
        }

        // 2. Consulta de estado y creación segura
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.println("Archivo creado: " + archivo.getPath());
            } catch (IOException e) {
                System.out.println("Error de E/S al crear el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo ya existe: " + archivo.getPath());
        }

        // 3. Validación (simula la confirmación del usuario)
        boolean confirmarBorrado = true;

        // 4. Borrado solo si hay confirmación
        if (confirmarBorrado) {
            boolean eliminado = archivo.delete();
            System.out.println("Resultado de delete(): " + eliminado);
        } else {
            System.out.println("Borrado cancelado.");
        }
    }
}
