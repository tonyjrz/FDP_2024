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
public class EJERCICIO20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();
        
        System.out.println("Números primos menores a " + numero + ":");
        
        for (int i = 2; i < numero; i++) {
            int divisores = 0;
            
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            
            if (divisores == 2) {
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}
