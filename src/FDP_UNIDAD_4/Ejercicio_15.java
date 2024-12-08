
package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] visitantes = new int[10][6];
        String[] centros = {"Centro 1", "Centro 2", "Centro 3", "Centro 4", "Centro 5", "Centro 6", "Centro 7", "Centro 8", "Centro 9", "Centro 10"};
        int[] totalVisitantes = new int[10];
        int[] totalMensual = new int[6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese los datos de visitantes para " + centros[i]);
            for (int j = 0; j < 6; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                visitantes[i][j] = scanner.nextInt();
                totalVisitantes[i] += visitantes[i][j];
                totalMensual[j] += visitantes[i][j];
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Total de visitantes en " + centros[i] + ": " + totalVisitantes[i]);
        }

        int maxVisitas = 0, minVisitas = Integer.MAX_VALUE, centroMax = 0, centroMin = 0;
        for (int i = 0; i < 10; i++) {
            if (totalVisitantes[i] > maxVisitas) {
                maxVisitas = totalVisitantes[i];
                centroMax = i;
            }
            if (totalVisitantes[i] < minVisitas) {
                minVisitas = totalVisitantes[i];
                centroMin = i;
            }
        }
        System.out.println("Centro turístico más visitado: " + centros[centroMax] + " con " + maxVisitas + " visitantes");
        System.out.println("Centro turístico menos visitado: " + centros[centroMin] + " con " + minVisitas + " visitantes");

        for (int i = 0; i < 6; i++) {
            if (visitantes[centroMax][i] == maxVisitas) {
                System.out.println("Mes de mayor afluencia para " + centros[centroMax] + ": Mes " + (i + 1) + " con " + visitantes[centroMax][i] + " visitantes");
            }
            if (visitantes[centroMin][i] == minVisitas) {
                System.out.println("Mes de menor afluencia para " + centros[centroMin] + ": Mes " + (i + 1) + " con " + visitantes[centroMin][i] + " visitantes");
            }
        }

        int maxMes = 0, minMes = Integer.MAX_VALUE, mesMax = 0, mesMin = 0;
        for (int j = 0; j < 6; j++) {
            if (totalMensual[j] > maxMes) {
                maxMes = totalMensual[j];
                mesMax = j;
            }
            if (totalMensual[j] < minMes) {
                minMes = totalMensual[j];
                mesMin = j;
            }
        }
        System.out.println("Mes de mayor afluencia turística: Mes " + (mesMax + 1) + " con " + maxMes + " visitantes");
        System.out.println("Mes de menor afluencia turística: Mes " + (mesMin + 1) + " con " + minMes + " visitantes");
    }
}
