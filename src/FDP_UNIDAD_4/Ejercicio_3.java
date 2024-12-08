package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        int[] primos = new int[100];
        int count = 0;
        int num = 2;

        while (count < 100) {
            int esPrimo = 1;
            if (num <= 1) {
                esPrimo = 0;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        esPrimo = 0;
                        break;
                    }
                }
            }

            if (esPrimo == 1) {
                primos[count] = num;
                count++;
            }
            num++;
        }

        // Mostrar los números primos en consola
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }
}
