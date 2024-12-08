/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FDP_UNIDAD_5;

/**
 *
 * @author Antonio
 */ 
public class Ejercicio_1 {

    public static void main(String[] args) {
        double[] numeros = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        double sumaCuadrados = calcularSumaCuadrados(numeros);
        mostrarResultado(sumaCuadrados);
    }

    public static double calcularSumaCuadrados(double[] numeros) {
        double sumaCuadrados = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            sumaCuadrados += Math.pow(numeros[i], 2);
        }
        return sumaCuadrados;
    }

    public static void mostrarResultado(double sumaCuadrados) {
        System.out.println("La suma del cuadrado de los números es: " + sumaCuadrados);
    }
}

