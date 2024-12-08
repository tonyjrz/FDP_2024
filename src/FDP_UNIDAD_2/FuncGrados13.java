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
public class FuncGrados13 {

    public static double calcular_f(double celsius){
        return (celsius * 1.8) + 32;
    }
    
    public static double calcular_k(double celsius){
        return celsius + 273.15 ;
    }
    
    public static double calcular_r(double celsius){
        return calcular_k(celsius) * 1.8;
    }
    
    public static void main(String[] args) {
        //Definicion de variables
        //tipo de dato "Scanner"
        Scanner lector = new Scanner(System.in);
        //Tipo de dato "Double"
        double c;
        
        //Entrada
        System.out.println("Ingresa el valor en grados celsius: ");
        c = lector.nextDouble();
        
        //Salida 
        System.out.println("El valor " + c + " en grados Celsius equivale a: ");
        System.out.println(calcular_f(c) + " Grados fahrenheit");
        System.out.println(calcular_k(c) + " Grados Kelvin");
        System.out.println(calcular_r(c) + " Grados Rankine");
        
        
    }
    
}
