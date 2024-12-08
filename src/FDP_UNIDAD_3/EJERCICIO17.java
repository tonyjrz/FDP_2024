/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FDP_UNIDAD_3;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EJERCICIO17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int numero;
        int resultado;

        System.out.print("Ingrese un número entero positivo: ");
        numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Error: El número debe ser positivo");
            sc.close();
            return;
        }

        System.out.println("\nTabla de multiplicar del " + numero + ":");
        System.out.println("------------------------");

        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        sc.close();
    }
}
