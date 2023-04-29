/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese grados C°");
        float C = sc.nextFloat();
        float F = 32 + (9 * C / 5);
        System.out.println("Grados Fahrenheit " + F);
    }
}
