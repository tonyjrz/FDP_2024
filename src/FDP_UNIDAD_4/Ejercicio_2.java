
package FDP_UNIDAD_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de elementos
        System.out.print("Ingrese la cantidad de elementos: ");
        int n = scanner.nextInt();

        // Crear el arreglo para almacenar los elementos
        int[] arreglo = new int[n];

        // Ingresar los elementos en el arreglo
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        // Eliminar elementos duplicados usando un HashSet
        HashSet<Integer> conjunto = new HashSet<>();
        ArrayList<Integer> resultado = new ArrayList<>();

        for (int num : arreglo) {
            if (conjunto.add(num)) {
                resultado.add(num);
            }
        }

        // Imprimir el arreglo sin elementos duplicados
        System.out.println("Arreglo sin elementos duplicados:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}
