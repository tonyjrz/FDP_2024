package FDP_UNIDAD_5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo1 = crearArreglo(scanner, "Ingrese el tamaño del primer arreglo: ", "Ingrese los elementos del primer arreglo:");
        int[] arreglo2 = crearArreglo(scanner, "Ingrese el tamaño del segundo arreglo: ", "Ingrese los elementos del segundo arreglo:");

        int[] arregloMezclado = mezclarArreglos(arreglo1, arreglo2);
        ordenarArregloDescendente(arregloMezclado);

        System.out.println("Arreglo mezclado y ordenado en forma descendente:");
        imprimirArreglo(arregloMezclado);
    }

    private static int[] crearArreglo(Scanner scanner, String mensajeTamanio, String mensajeElementos) {
        System.out.print(mensajeTamanio);
        int n = scanner.nextInt();
        int[] arreglo = new int[n];
        System.out.println(mensajeElementos);
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }
        return arreglo;
    }

    private static int[] mezclarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] arregloMezclado = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, arregloMezclado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, arregloMezclado, arreglo1.length, arreglo2.length);
        return arregloMezclado;
    }

    private static void ordenarArregloDescendente(int[] arreglo) {
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }

    private static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

