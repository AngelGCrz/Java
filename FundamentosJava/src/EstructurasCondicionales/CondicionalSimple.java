/*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es                                      
 * mayor o igual que 5
 */
package EstructurasCondicionales;

import java.util.Scanner;

/**
 *
 * @author Angel
 */

public class CondicionalSimple {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Nota: ");
            int nota = sc.nextInt();
            if (nota >= 5) {// ----------------------inicio de la condición
                System.out.println("Enhorabuena!!");
                System.out.println("Has aprobado");
            } // -------------------------------------fin de la condición
            System.out.println("Hasta Pronto!");
        }
    }
}
