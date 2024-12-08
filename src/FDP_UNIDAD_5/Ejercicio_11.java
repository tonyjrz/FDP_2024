package FDP_UNIDAD_5;

import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = obtenerTamanoMatriz(scanner);
        int[][] matriz = llenarMatriz(scanner, N);

        System.out.println("Matriz ingresada:");
        imprimirMatriz(matriz);

        if (esSimetrica(matriz)) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }

    public static int obtenerTamanoMatriz(Scanner scanner) {
        System.out.print("Ingrese el tamaño N de la matriz (NxN): ");
        return scanner.nextInt();
    }

    public static int[][] llenarMatriz(Scanner scanner, int N) {
        int[][] matriz = new int[N][N];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    public static boolean esSimetrica(int[][] matriz) {
        int N = matriz.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

