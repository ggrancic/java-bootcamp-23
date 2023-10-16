package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	
    public static void main(String[] args) {
        if (args.length == 4) {
            // (a)
            double[] numeros = new double[3];
            for (int i = 0; i < 3; i++) {
                numeros[i] = Double.parseDouble(args[i]);
            }
            String orden = args[3];
            ordenar(numeros, orden);
        } else {
            // (b)
            double[] numeros = new double[3];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = scanner.nextDouble();
            }
            System.out.print("Ingrese 'a' o 'd': ");
            String orden = scanner.next();
            scanner.close();
            ordenar(numeros, orden);
        }

    }

    public static void ordenar(double[] numeros, String orden) {
        Arrays.sort(numeros);
        if (orden.equals("d")) {
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }
        } else if (orden.equals("a")) {
            for (double numero : numeros) {
                System.out.print(numero + " ");
            }
        } else {
            System.out.println("La opción de orden no es válida. Use 'a' o 'd'.");
        }
    }
}
