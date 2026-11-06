import java.io.File;
import java.io.IOException;

public class Clase3_Ejercicio4 {
    public static void main(String[] args) {
     
        File archivo = new File("datos/temporal.txt");

       
        if (archivo.getParentFile() != null && !archivo.getParentFile().exists()) {
            archivo.getParentFile().mkdirs();
        }

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

       
        boolean confirmarBorrado = true;

       
        if (confirmarBorrado) {
            boolean eliminado = archivo.delete();
            System.out.println("Resultado de delete(): " + eliminado);
        } else {
            System.out.println("Borrado cancelado.");
        }
    }
}
