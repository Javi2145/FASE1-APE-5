import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Clase3_Ejercicio2 {
    public static void main(String[] args) {
        String[] materias = {
            "Algoritmos y Lógica de Programación",
            "Matemáticas",
            "Física",
            "Pensamiento Computacional",
            "Comunicación"
        };

        BufferedWriter bw = null;
        try {
            // 1. BufferedWriter enlazado con FileWriter
            bw = new BufferedWriter(new FileWriter("materias.txt"));

            // 2 y 3. Escribir cada asignatura en una línea independiente
            for (String materia : materias) {
                bw.write(materia);
                bw.newLine();
            }
            System.out.println("Archivo materias.txt generado correctamente.");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        } finally {
            // 4. Liberar recursos
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
