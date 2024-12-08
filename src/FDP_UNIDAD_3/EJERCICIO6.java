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
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }
    }
}

    
    

