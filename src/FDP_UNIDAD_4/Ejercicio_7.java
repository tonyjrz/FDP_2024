
package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de alumnos (N): ");
        int N = scanner.nextInt();

        int[] calificaciones = new int[N];
        System.out.println("Introduce las calificaciones de los exámenes:");
        for (int i = 0; i < N; i++) {
            calificaciones[i] = scanner.nextInt();
        }

        // Calcular media aritmética
        int suma = 0;
        for (int i = 0; i < N; i++) {
            suma += calificaciones[i];
        }
        double media = (double) suma / N;

        // Calcular varianza
        double sumaDesviacionesCuadradas = 0;
        for (int i = 0; i < N; i++) {
            sumaDesviacionesCuadradas += Math.pow(calificaciones[i] - media, 2);
        }
        double varianza = sumaDesviacionesCuadradas / N;

        // Calcular desviación estándar
        double desviacionEstandar = Math.sqrt(varianza);

        // Calcular moda
        int moda = calificaciones[0];
        int maxFrecuencia = 0;
        for (int i = 0; i < N; i++) {
            int frecuencia = 0;
            for (int j = 0; j < N; j++) {
                if (calificaciones[i] == calificaciones[j]) {
                    frecuencia++;
                }
            }
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = calificaciones[i];
            }
        }

        System.out.println("Media aritmética: " + media);
        System.out.println("Varianza: " + varianza);
        System.out.println("Desviación estándar: " + desviacionEstandar);
        System.out.println("Moda: " + moda);
    }
}
