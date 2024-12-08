
package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
public class Ejercicio_8 {

    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36}
        };

        int[] sumasColumnas = new int[6];

        for (int columna = 0; columna < 6; columna++) {
            for (int fila = 0; fila < 6; fila++) {
                sumasColumnas[columna] += matriz[fila][columna];
            }
        }

        for (int columna = 0; columna < 6; columna++) {
            System.out.println("Suma de la columna " + (columna + 1) + ": " + sumasColumnas[columna]);
        }
    }
}
