
package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño N de la matriz (NxN): ");
        int N = scanner.nextInt();

        int[][] matriz = new int[N][N];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz ingresada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int discrepancias = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    discrepancias++;
                }
            }
        }

        if (discrepancias == 0) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }

    }
}
