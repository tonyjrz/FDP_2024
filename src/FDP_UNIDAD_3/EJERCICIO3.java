/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FDP_UNIDAD_3;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EJERCICIO3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = sc.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = sc.nextInt();

        System.out.println("\nResultados de las comparaciones:");

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        }

        if (numero1 < numero2) {
            System.out.println(numero1 + " es menor que " + numero2);
        }

        if (numero1 == numero2) {
            System.out.println(numero1 + " es igual a " + numero2);
        }

        if (numero1 >= numero2) {
            System.out.println(numero1 + " es mayor o igual que " + numero2);
        }

        if (numero1 <= numero2) {
            System.out.println(numero1 + " es menor o igual que " + numero2);
        }

        if (numero1 != numero2) {
            System.out.println(numero1 + " es diferente de " + numero2);
        }

        sc.close();
    }
}
