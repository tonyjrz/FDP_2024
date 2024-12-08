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
public class EJERCICIO13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu signo zodiacal: ");
        String signo = sc.nextLine().toLowerCase();

        switch (signo) {
            case "aries", "leo", "sagitario" ->
                System.out.println("Eres compatible con signos de fuego.");
            case "géminis", "libra", "acuario" ->
                System.out.println("Eres compatible con signos de aire.");
            case "cáncer", "escorpión", "piscis" ->
                System.out.println("Eres compatible con signos de agua.");
            case "tauro", "virgo", "capricornio" ->
                System.out.println("Eres compatible con signos de tierra.");
            default ->
                System.out.println("Signo no válido.");
        }
    }
}
