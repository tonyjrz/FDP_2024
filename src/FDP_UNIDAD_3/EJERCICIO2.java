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
public class EJERCICIO2 {

   
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad:");
        edad = lector.nextInt();
        if(edad>=18 && edad<30){
            System.out.println("Ya puedes votar");
        }
            else if(edad>=30 && edad<65){
                 System.out.println("Ya ten hijos ");
                 
            }
            else if(edad>=65){
                System.out.println("Ya consigue tu apoyo del bienestar");
            }
    }
}

                                                              
    
    

