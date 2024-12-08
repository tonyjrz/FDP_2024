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
public class EJERCICIO19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPersonas, contadorMujeres = 0, contadorHombres = 0;
        double pesoTotalMujeres = 0, pesoTotalHombres = 0;

        System.out.print("Ingrese el número de personas: ");
        totalPersonas = sc.nextInt();

        for (int i = 0; i < totalPersonas; i++) {
            System.out.println("Persona " + (i + 1) + ":");

            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            System.out.print("Sexo (M/F): ");
            String sexo = sc.next().toUpperCase();

            if (edad >= 18) {
                if (sexo.equals("M")) {
                    pesoTotalHombres += peso;
                    contadorHombres++;
                } else if (sexo.equals("F")) {
                    pesoTotalMujeres += peso;
                    contadorMujeres++;
                }
            }
        }

        double promedioMujeres = contadorMujeres > 0 ? pesoTotalMujeres / contadorMujeres : 0;
        double promedioHombres = contadorHombres > 0 ? pesoTotalHombres / contadorHombres : 0;

      

        sc.close();
    }
}
