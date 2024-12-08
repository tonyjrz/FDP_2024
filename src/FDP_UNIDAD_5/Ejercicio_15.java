package FDP_UNIDAD_5;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] centros = {"Centro 1", "Centro 2", "Centro 3", "Centro 4", "Centro 5", "Centro 6", "Centro 7", "Centro 8", "Centro 9", "Centro 10"};

        int[][] visitantes = obtenerDatosVisitantes(scanner, centros);
        int[] totalVisitantes = calcularTotalVisitantes(visitantes);
        int[] totalMensual = calcularTotalMensual(visitantes);

        imprimirTotalVisitantes(totalVisitantes, centros);
        imprimirCentroMasYMenosVisitado(totalVisitantes, centros, visitantes);
        imprimirMesMayorYMmenorAfluencia(totalMensual);
    }

    public static int[][] obtenerDatosVisitantes(Scanner scanner, String[] centros) {
        int[][] visitantes = new int[10][6];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese los datos de visitantes para " + centros[i]);
            for (int j = 0; j < 6; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                visitantes[i][j] = scanner.nextInt();
            }
        }
        return visitantes;
    }

    public static int[] calcularTotalVisitantes(int[][] visitantes) {
        int[] totalVisitantes = new int[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalVisitantes[i] += visitantes[i][j];
            }
        }
        return totalVisitantes;
    }

    public static int[] calcularTotalMensual(int[][] visitantes) {
        int[] totalMensual = new int[6];
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 10; i++) {
                totalMensual[j] += visitantes[i][j];
            }
        }
        return totalMensual;
    }

    public static void imprimirTotalVisitantes(int[] totalVisitantes, String[] centros) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Total de visitantes en " + centros[i] + ": " + totalVisitantes[i]);
        }
    }

    public static void imprimirCentroMasYMenosVisitado(int[] totalVisitantes, String[] centros, int[][] visitantes) {
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
    }

    public static void imprimirMesMayorYMmenorAfluencia(int[] totalMensual) {
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
