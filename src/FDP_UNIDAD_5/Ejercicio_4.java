package FDP_UNIDAD_5;

/**
 *
 * @author Antonio
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        int[] fibonacci = calcularFibonacci(100);
        mostrarFibonacci(fibonacci);
    }

    public static int[] calcularFibonacci(int cantidad) {
        int[] fibonacci = new int[cantidad];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < cantidad; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static void mostrarFibonacci(int[] fibonacci) {
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}

