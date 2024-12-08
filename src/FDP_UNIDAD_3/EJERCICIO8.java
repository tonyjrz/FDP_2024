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
public class EJERCICIO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el dividendo: ");
        double dividendo = sc.nextDouble();
        System.out.print("Ingresa el divisor: ");
        double divisor = sc.nextDouble();

        if (divisor != 0) {
            double resultado = dividendo / divisor;
            System.out.println("Resultado de la división: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}
