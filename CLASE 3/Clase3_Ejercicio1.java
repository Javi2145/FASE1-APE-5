import java.io.File;
import java.io.IOException;

public class Clase3_Ejercicio1 {
    public static void main(String[] args) {
        File archivo = new File("datos/prueba.txt");

        
        if (archivo.getParentFile() != null && !archivo.getParentFile().exists()) {
            archivo.getParentFile().mkdirs();
        }

        if (!archivo.exists()) {

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


        System.out.println("Nombre: " + archivo.getName());
        System.out.println("Ruta: " + archivo.getPath());
    }
}
