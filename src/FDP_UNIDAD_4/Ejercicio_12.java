
package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la matriz (N): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1;
            matriz[i][n - i - 1] = 1;
        }

        System.out.println("Matriz resultante:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
