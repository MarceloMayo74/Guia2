/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
 * el triple y la raíz cuadrada de ese número.
 */
package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un Numero");
        int num1 = sc.nextInt();
        int doble = num1 * 2;
        int triple = num1 * 3;
        System.out.println("El Doble es: " + doble);
        System.out.println("El Triple es: " + triple);
        System.out.println("La Raiz Cuadrada es: " + Math.sqrt(num1));
    }
}
