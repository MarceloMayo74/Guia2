/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su Nombre");
        String nombre = sc.next();
        System.out.println("Su nombre es " + nombre);
    }
}
