import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba un mensaje: ");
        String mensaje = sc.nextLine();

        try {
            FileWriter escritor = new FileWriter("estudiantes.txt", true); // true = conserva lo anterior
            escritor.write(mensaje + System.lineSeparator());
            escritor.close();
            System.out.println("La información se guardó correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        sc.close();
    }
}
