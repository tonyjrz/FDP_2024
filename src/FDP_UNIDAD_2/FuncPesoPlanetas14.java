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
public class FuncPesoPlanetas14 {

    public static double calpesoL(double p) {
        return p * 0.165;
    }
        
    public static double calpesoM(double p) {
        return p * 0.377;
    }

    public static double calpesoP(double p) {
        return p * 0.0632;
    }

    public static void main(String[] args) {
        //Definicion de variables
        //Tipo de dato "Scanner"
        Scanner lector = new Scanner(System.in);
        //Tipo de dato "Double"
        double peso;

        //Entrada
        System.out.println("Ingresa tu peso: ");
        peso = lector.nextDouble();

        //Salida
        System.out.println("Tu peso en la luna es de:" + calpesoL(peso));
        System.out.println("Tu peso en marte es de: " + calpesoM(peso));
        System.out.println("Tu peso en Plutón es de: " + calpesoP(peso));

    }

}
