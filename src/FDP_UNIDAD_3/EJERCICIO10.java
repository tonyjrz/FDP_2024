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
public class EJERCICIO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la edad del chico: ");
        int edadChico = sc.nextInt();
        System.out.print("Ingresa la edad de la chica: ");
        int edadChica = sc.nextInt();
        System.out.print("Ingresa la estatura del chico (en metros): ");
        double estatura = sc.nextDouble();
        sc.nextLine(); // Limpiar el buffer
        System.out.print("Ingresa el artista favorito del chico: ");
        String artista = sc.nextLine();

        if (edadChico > edadChica && estatura >= 1.80 && artista.equalsIgnoreCase("Linkin Park")) {
            System.out.println("Es compatible.");
        } else {
            System.out.println("No es compatible.");
        }
    }
}
