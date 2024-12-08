/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_6 {

    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arreglo[medio] == elemento) {
                return medio;
            }

            if (arreglo[medio] < elemento) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1;  // Elemento no encontrado
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        int[] arreglo = new int[tamano];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        Arrays.sort(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));

        System.out.print("Ingrese el elemento a buscar: ");
        int elementoBuscar = scanner.nextInt();

        int indice = busquedaBinaria(arreglo, elementoBuscar);

        // Mostrar resultado
        if (indice != -1) {
            System.out.println("Elemento " + elementoBuscar + " encontrado en el índice " + indice);
        } else {
            System.out.println("Elemento " + elementoBuscar + " no encontrado en el arreglo");
        }

    }

}
