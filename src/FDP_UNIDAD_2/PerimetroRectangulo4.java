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
public class PerimetroRectangulo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion de variables 
        //Tipo de dato "Scanner"
        Scanner lector = new Scanner(System.in);
        //Tipo de dato "Entero"
        int base, altura, perimetro;
        //Entrada
        System.out.println("Ingresa la base del rectangulo: ");
        base = lector.nextInt();
        System.out.println("Ingresa la altura del rectangulo");
        altura = lector.nextInt();
        //Proceso
        perimetro = (base + altura) * 2;
        //Salida
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

}
