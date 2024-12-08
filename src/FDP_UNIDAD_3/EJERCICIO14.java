/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FDP_UNIDAD_3;

/**
 *
 * @author Antonio
 */
public class EJERCICIO14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ciclo for
        System.out.println("Ciclo FOR:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // Ciclo while
        System.out.println("\nCiclo WHILE:");
        int i = 8;
        while (i <= 24) {
            System.out.print(i + " ");
            i += 4;
        }

        // Ciclo do-while
        System.out.println("\nCiclo DO-WHILE:");
        i = 5;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 1);
    }
}
