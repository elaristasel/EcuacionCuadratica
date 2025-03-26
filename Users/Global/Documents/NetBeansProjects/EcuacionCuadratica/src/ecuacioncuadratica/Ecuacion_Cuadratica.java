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

public class Ecuacion_Cuadratica {
   
    private double a;
    private double b;
    private double c;

   
    public Ecuacion_Cuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    
    public double getRaiz1() {
        double discriminante = getDiscriminante();
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    
    public double getRaiz2() {
        double discriminante = getDiscriminante();
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

   
    public void resolverEcuacion() {
        double discriminante = getDiscriminante();

        if (discriminante > 0) {
            double raiz1 = getRaiz1();
            double raiz2 = getRaiz2();
            System.out.println("La ecuacion tiene dos raíces: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuacion tiene una raíz: " + raiz);
        } else {
            System.out.println("La ecuacion no tiene raices reales.");
        }
    }
}

