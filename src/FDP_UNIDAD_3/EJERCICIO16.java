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
public class EJERCICIO16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
                   int valorInicial, valorFinal;
        
        do {
            System.out.print("Ingrese el valor inicial: ");
            valorInicial = sc.nextInt();
            
            System.out.print("Ingrese el valor final: ");
            valorFinal = sc.nextInt();
            
            if (valorInicial - valorFinal < 5) {
                System.out.println("Error: El valor inicial debe ser mayor al final en al menos 5 unidades.");
                System.out.println("Por favor, ingrese los valores nuevamente.\n");
            }
            
        } while (valorInicial - valorFinal < 5);
        
        System.out.println("\nSecuencia de decremento:");
        
        while (valorInicial > valorFinal) {
            System.out.println("Valor actual: " + valorInicial);
            valorInicial -= 5;
        }
        
        System.out.println("Valor final alcanzado: " + valorInicial);
        sc.close();
    }
}

    
    
