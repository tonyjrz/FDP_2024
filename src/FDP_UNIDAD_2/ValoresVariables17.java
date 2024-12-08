/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FDP_UNIDAD_2;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class ValoresVariables17 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a, b, aux;

        System.out.println("Ingrese un valor para 'a': ");
        a = lector.nextInt();
        System.out.println("Ingrese un valor para 'b': ");
        b = lector.nextInt();

        aux = a;
        a = b;
        b = aux;

        System.out.println("Los valores de a y b son: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
