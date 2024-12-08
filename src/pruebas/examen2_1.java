/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class examen2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double califExamen, califEjercicios, califInvestigacion, calFinal;

        System.out.println("Calcular la calificacion de la unidad 2");
        System.out.println("Ingrese la calificacion del examen: ");
        califExamen = lector.nextInt();
        System.out.println("Ingrese la calificacion de los ejercicios: ");
        califEjercicios = lector.nextInt();
        System.out.println("Ingrese la calificacion de la Investigacion: ");
        califInvestigacion = lector.nextInt();

        calFinal = califExamen * 0.4 + califEjercicios * 0.35 + califInvestigacion * 0.25;
        System.out.println("La calificacion Final de la Unidad 2 es : " + calFinal);

    }

}
