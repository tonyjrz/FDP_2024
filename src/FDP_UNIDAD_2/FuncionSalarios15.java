/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FDP_UNIDAD_2;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class FuncionSalarios15 {

    public static double calc_salarioq(double s) {
        return ((s * 15) - ((s * 15) * 0.135) - ((s * 15) * 0.025));
    }

    public static void main(String[] args) {
        //Definicion de variables
        //Tipo de dato "Scanner"
        Scanner lector = new Scanner(System.in);
        //Tipo de dato "Double"
        double salariod;

        //Entrada
        System.out.println("Ingresa tu sueldo diario: ");
        salariod = lector.nextDouble();

        //Salida
        System.out.println("Tu salario quincenal es de: " + calc_salarioq(salariod));
    }

}
