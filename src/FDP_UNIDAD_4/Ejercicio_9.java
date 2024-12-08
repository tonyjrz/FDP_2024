
package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
public class Ejercicio_9 {

    public static void main(String[] args) {

        int N = 4;
        int M = 5;

        int[][] matriz = {
            {5, 3, 9, 1, 7},
            {2, 8, 6, 4, 10},
            {12, 14, 3, 7, 5},
            {9, 2, 8, 6, 11}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < N; i++) {
            int mayor = matriz[i][0];
            int menor = matriz[i][0];
            for (int j = 1; j < M; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            System.out.println("Fila " + (i + 1) + " - Mayor: " + mayor + ", Menor: " + menor);
        }
    }
}
