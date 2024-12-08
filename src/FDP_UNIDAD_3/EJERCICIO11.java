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
public class EJERCICIO11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el semestre del alumno: ");
        int semestre = sc.nextInt();
        System.out.print("Ingresa el promedio del alumno: ");
        double promedio = sc.nextDouble();

        if (semestre >= 4 && semestre <= 9 && promedio >= 80) {
            System.out.println("Beca de manutención.");
        } else if (semestre >= 1 && semestre <= 3 && promedio >= 75) {
            System.out.println("Beca de transporte.");
        } else {
            System.out.println("No cumple con los requisitos para la beca.");
        }
    }
}
