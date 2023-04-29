/*
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
 */
package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una Frase");
        String frase = sc.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }
}
