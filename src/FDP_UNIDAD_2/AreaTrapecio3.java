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
public class AreaTrapecio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion de variables 
        //Tipo de dato "Scanner"
        Scanner lector = new Scanner(System.in);
        //Tipo de dato "Double"
        double basema, baseme, altura, area;
        //Entrada
        System.out.println("Ingresa la base mayor del trapecio: ");
        basema = lector.nextDouble();
        System.out.println("Ingresa la base menor del trapecio: ");
        baseme = lector.nextDouble();
        System.out.println("Ingresa la altura del Trapecio: ");
        altura = lector.nextDouble();
        //Proceso20
        area = ((basema + baseme) * altura) / 2;
        //Salida 
        System.out.println("El area del Trapecio es: " + area);
        

    }

}
