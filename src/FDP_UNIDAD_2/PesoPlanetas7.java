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
public class PesoPlanetas7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion de variables 
        //Tipo de dato "Scanner"
        Scanner lector = new Scanner(System.in);
        //Tipo de dato "Double"
        double peso, pesoM, pesoL, pesoP;
        //Entrada
        System.out.println("Ingresa tu peso en la tierra: ");
        peso = lector.nextDouble();
        //Proceso 
        pesoL = peso * 0.165;
        pesoM = peso * 0.377;
        pesoP = peso * 0.0672;
        //Salida
        System.out.println("Tu peso en la luna es de: " + pesoL);
        System.out.println("Tu peso en marte es de: " + pesoM);
        System.out.println("Tu peso en pluton es de: " + pesoP);

    }

}
