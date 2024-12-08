package FDP_UNIDAD_5;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = obtenerNumeroAlumnos(scanner);
        int[] calificaciones = obtenerCalificaciones(scanner, N);

        double media = calcularMedia(calificaciones);
        double varianza = calcularVarianza(calificaciones, media);
        double desviacionEstandar = calcularDesviacionEstandar(varianza);
        int moda = calcularModa(calificaciones);

        mostrarResultados(media, varianza, desviacionEstandar, moda);
    }

    public static int obtenerNumeroAlumnos(Scanner scanner) {
        System.out.print("Introduce el número de alumnos (N): ");
        return scanner.nextInt();
    }

    public static int[] obtenerCalificaciones(Scanner scanner, int N) {
        int[] calificaciones = new int[N];
        System.out.println("Introduce las calificaciones de los exámenes:");
        for (int i = 0; i < N; i++) {
            calificaciones[i] = scanner.nextInt();
        }
        return calificaciones;
    }

    public static double calcularMedia(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    public static double calcularVarianza(int[] calificaciones, double media) {
        double sumaDesviacionesCuadradas = 0;
        for (int calificacion : calificaciones) {
            sumaDesviacionesCuadradas += Math.pow(calificacion - media, 2);
        }
        return sumaDesviacionesCuadradas / calificaciones.length;
    }

    public static double calcularDesviacionEstandar(double varianza) {
        return Math.sqrt(varianza);
    }

    public static int calcularModa(int[] calificaciones) {
        int moda = calificaciones[0];
        int maxFrecuencia = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            int frecuencia = 0;
            for (int j = 0; j < calificaciones.length; j++) {
                if (calificaciones[i] == calificaciones[j]) {
                    frecuencia++;
                }
            }
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = calificaciones[i];
            }
        }
        return moda;
    }

    public static void mostrarResultados(double media, double varianza, double desviacionEstandar, int moda) {
        System.out.println("Media aritmética: " + media);
        System.out.println("Varianza: " + varianza);
        System.out.println("Desviación estándar: " + desviacionEstandar);
        System.out.println("Moda: " + moda);
    }
}

