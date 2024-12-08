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
public class AreaTriangulo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion de variables
        //Tipo de dato "Scanner"
        Scanner lector = new Scanner(System.in);
        //Tipo de dato "Double"
        double b,h,area;
        //Entrada
        System.out.println("Ingresa la base del Triangulo: ");
        b = lector.nextDouble();
        System.out.println("Ingresa la altura del Triangulo: ");
        h = lector.nextDouble();
        //Proceso
        area = (b*h)/2;
        //Salida
        System.out.println("El area del Triangulo es: "+area);
    }
    
}
