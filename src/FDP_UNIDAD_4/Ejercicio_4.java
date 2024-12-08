
package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
public class Ejercicio_4 {

    public static void main(String[] args) {

        int[] fibonacci = new int[100];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < 100; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Imprimir los números de Fibonacci
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}
