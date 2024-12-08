
package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del primer arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo1 = new int[n];
        System.out.println("Ingrese los elementos del primer arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo1[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el tamaño del segundo arreglo: ");
        int m = scanner.nextInt();

        int[] arreglo2 = new int[m];
        System.out.println("Ingrese los elementos del segundo arreglo:");
        for (int i = 0; i < m; i++) {
            arreglo2[i] = scanner.nextInt();
        }

        int[] arregloMezclado = new int[n + m];

        System.arraycopy(arreglo1, 0, arregloMezclado, 0, n);
        System.arraycopy(arreglo2, 0, arregloMezclado, n, m);

        Arrays.sort(arregloMezclado);
        for (int i = 0; i < arregloMezclado.length / 2; i++) {
            int temp = arregloMezclado[i];
            arregloMezclado[i] = arregloMezclado[arregloMezclado.length - 1 - i];
            arregloMezclado[arregloMezclado.length - 1 - i] = temp;
        }

        System.out.println("Arreglo mezclado y ordenado en forma descendente:");
        for (int num : arregloMezclado) {
            System.out.print(num + " ");
        }

    }
}
