package FDP_UNIDAD_5;

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

        int n = solicitarNumeroElementos(scanner);

        int[] arreglo = crearArreglo(n, scanner);

        ArrayList<Integer> resultado = eliminarDuplicados(arreglo);

        imprimirArreglo(resultado);
    }

    public static int solicitarNumeroElementos(Scanner scanner) {
        System.out.print("Ingrese la cantidad de elementos: ");
        return scanner.nextInt();
    }

    public static int[] crearArreglo(int n, Scanner scanner) {
        int[] arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }
        return arreglo;
    }

    public static ArrayList<Integer> eliminarDuplicados(int[] arreglo) {
        HashSet<Integer> conjunto = new HashSet<>();
        ArrayList<Integer> resultado = new ArrayList<>();
        for (int num : arreglo) {
            if (conjunto.add(num)) {
                resultado.add(num);
            }
        }
        return resultado;
    }

    public static void imprimirArreglo(ArrayList<Integer> resultado) {
        System.out.println("Arreglo sin elementos duplicados:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}
