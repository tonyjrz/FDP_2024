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
public class AreaCirculo16 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double radio;
        
        System.out.println("Ingresa el radio del circulo: ");
        radio = lector.nextDouble();
        
        System.out.println("El area del circulo es: " + Math.PI * Math.pow(radio, 2));
        
    }

}
