import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Clase3_Ejercicio3 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            // 1. FileWriter en modo adición (append = true)
            bw = new BufferedWriter(new FileWriter("materias.txt", true));

            // 2. Añadir dos nuevas asignaturas al final
            bw.write("Inglés");
            bw.newLine();
            bw.write("Cálculo Diferencial");
            bw.newLine();

            System.out.println("Asignaturas añadidas al final de materias.txt.");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        } finally {
            // 3. Cerrar el flujo
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el flujo: " + e.getMessage());
            }
        }
    }
}
