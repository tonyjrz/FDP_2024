/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FDP_UNIDAD_2;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class SumaNumeros1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        //Tipo de dato "Scanner"
        Scanner lector = new Scanner(System.in);
        //Tipo de dato "Entero"
        int num1, num2, suma;
        //Entrada
        System.out.println("Ingresa el numero 1: ");
        num1 = lector.nextInt();
        System.out.println("Ingrese el numero 2");
        num2 = lector.nextInt();
        //Proceso
        suma = num1 + num2;
        //Salida
        System.out.println("El resultado de la suma es: " + suma);

    }

}
