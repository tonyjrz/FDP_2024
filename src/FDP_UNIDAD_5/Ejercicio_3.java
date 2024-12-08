package FDP_UNIDAD_5;

/**
 *
 * @author Antonio
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        int[] primos = calcularPrimos(100);
        mostrarPrimos(primos);
    }

    public static int[] calcularPrimos(int cantidad) {
        int[] primos = new int[cantidad];
        int count = 0;
        int num = 2;

        while (count < cantidad) {
            if (esPrimo(num)) {
                primos[count] = num;
                count++;
            }
            num++;
        }

        return primos;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void mostrarPrimos(int[] primos) {
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }
}
