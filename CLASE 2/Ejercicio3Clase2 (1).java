import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3Clase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double acumulado = 0;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ventas.txt", true))) {
            while (true) {
                System.out.print("Nombre del producto (o 'fin' para terminar): ");
                String nombre = sc.nextLine();
                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Precio: ");
                double precio = Double.parseDouble(sc.nextLine());

                System.out.print("Cantidad vendida: ");
                int cantidad = Integer.parseInt(sc.nextLine());

                double subtotal = precio * cantidad;
                double descuento = 0;
                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }
                double totalPagar = subtotal - descuento;
                acumulado += totalPagar;

                System.out.printf("Subtotal: $%.2f | Descuento: $%.2f | Total a pagar: $%.2f%n",
                        subtotal, descuento, totalPagar);

                bw.write("Producto: " + nombre);
                bw.newLine();
                bw.write("Precio: " + precio + " | Cantidad: " + cantidad);
                bw.newLine();
                bw.write(String.format("Subtotal: %.2f | Descuento: %.2f | Total: %.2f",
                        subtotal, descuento, totalPagar));
                bw.newLine();
                bw.write("----------------------");
                bw.newLine();
            }

            bw.write(String.format("TOTAL ACUMULADO DE VENTAS: %.2f", acumulado));
            bw.newLine();
            bw.write("======================");
            bw.newLine();

            System.out.printf("Total acumulado: $%.2f%n", acumulado);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
        sc.close();
    }
}
