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
public class EJERCICIO15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de materias: ");
        int numMaterias = sc.nextInt();
        double suma = 0;

        for (int i = 1; i <= numMaterias; i++) {
            System.out.print("Ingresa la calificación de la materia " + i + ": ");
            double calificacion = sc.nextDouble();
            suma += calificacion;
        }

        double promedio = suma / numMaterias;
        System.out.println("El promedio es: " + promedio);
    }
}
