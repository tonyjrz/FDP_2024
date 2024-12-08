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
public class EJERCICIO18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        System.out.print("Ingrese la cantidad de números a analizar: ");
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = sc.nextInt();
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("\nResultados del análisis:");
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
        
        sc.close();
    }
}
