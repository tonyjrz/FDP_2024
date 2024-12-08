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
public class EJERCICIO1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad:");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Ya eres mayor de edad, ya puedes ir al MMITAS_PUEBLA ");
        } else {
            System.out.println("Mira tu mama te habla, anda ve");
        }
    }
}


