/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
 * El programa deberá después mostrar el resultado de la suma
 */
package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un Números");
        int num1 = sc.nextInt();
        System.out.println("Ingresa otro Números");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los dos numeros es " + suma);
    }

}
