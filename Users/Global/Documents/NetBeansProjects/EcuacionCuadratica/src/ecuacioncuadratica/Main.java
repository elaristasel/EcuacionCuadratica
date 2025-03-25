/**
 * Clase de Ecuacion Cuadratica
 * 
 * @autor Gabriela Apaza Cauna
 * @oversion 1.0 24/03/2025
 * 
 */
package EcuacionCuadratica;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Asegura que el scanner lea los decimales con punto

        try {
            System.out.print("Ingrese a, b, c: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            // Crear un objeto de la clase EcuacionCuadratica
            Ecuacion_Cuadratica ecuacion = new Ecuacion_Cuadratica(a, b, c);

            // Llamar al método resolverEcuacion
            ecuacion.resolverEcuacion();
        } catch (Exception e) {
            System.out.println("Error: Verifica que los números estén bien escritos.");
        } finally {
            scanner.close();
        }
    }
}
