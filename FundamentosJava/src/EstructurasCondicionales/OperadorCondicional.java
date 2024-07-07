/*
 * programa que pide por teclado un número entero y muestra si es positivo o 
 * negativo. Consideramos el cero como positivo.
 */
package EstructurasCondicionales;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class OperadorCondicional {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            System.out.println("Introduzca numero: ");
            num = sc.nextInt();
            System.out.println(num >= 0 ? "POSITIVO" : "NEGATIVO");
        }
    }
}
