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
public class EJERCICIO9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de horas trabajadas: ");
        int horas = sc.nextInt();
        double pago;

        if (horas <= 40) {
            pago = horas * 70;
        } else {
            pago = (40 * 70) + ((horas - 40) * 140);
        }

        System.out.println("El pago total es: $" + pago);
    }
}
