
package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
public class Ejercicio_10 {

    public static void main(String[] args) {

        int N = 4; // Número de filas
        int M = 5; // Número de columnas

        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

        System.out.println("Matriz original:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] traspuesta = new int[M][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(traspuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
