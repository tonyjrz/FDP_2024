package FDP_UNIDAD_5;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = obtenerTamanoMatriz(scanner);
        int[][] matriz = crearMatrizIdentidad(n);

        System.out.println("Matriz resultante:");
        imprimirMatriz(matriz);
    }

    public static int obtenerTamanoMatriz(Scanner scanner) {
        System.out.print("Introduce el tamaño de la matriz (N): ");
        return scanner.nextInt();
    }

    public static int[][] crearMatrizIdentidad(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1;
            matriz[i][n - i - 1] = 1;
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}

