package FDP_UNIDAD_5;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = obtenerNumeroAlumnos(scanner);
        double[][] calificaciones = obtenerCalificaciones(scanner, N);

        imprimirPromedioAlumnos(calificaciones);
        imprimirPromedioExamenes(calificaciones);
        imprimirExamenMayorPromedio(calificaciones);
        imprimirAprobadosExamenes(calificaciones);
    }

    public static int obtenerNumeroAlumnos(Scanner scanner) {
        System.out.println("Ingrese el número de alumnos (1-50): ");
        return scanner.nextInt();
    }

    public static double[][] obtenerCalificaciones(Scanner scanner, int N) {
        double[][] calificaciones = new double[N][4];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese las calificaciones del alumno " + (i + 1) + " (4 exámenes): ");
            for (int j = 0; j < 4; j++) {
                calificaciones[i][j] = scanner.nextDouble();
            }
        }
        return calificaciones;
    }

    public static void imprimirPromedioAlumnos(double[][] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / calificaciones[i].length;
            System.out.println("Promedio del alumno " + (i + 1) + ": " + promedio);
        }
    }

    public static void imprimirPromedioExamenes(double[][] calificaciones) {
        for (int j = 0; j < calificaciones[0].length; j++) {
            double suma = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / calificaciones.length;
            System.out.println("Promedio del grupo en el examen " + (j + 1) + ": " + promedio);
        }
    }

    public static void imprimirExamenMayorPromedio(double[][] calificaciones) {
        double mayorPromedio = -1;
        int examenMayorPromedio = -1;
        for (int j = 0; j < calificaciones[0].length; j++) {
            double suma = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / calificaciones.length;
            if (promedio > mayorPromedio) {
                mayorPromedio = promedio;
                examenMayorPromedio = j + 1;
            }
        }
        System.out.println("El examen con mayor promedio de calificación es el examen " + examenMayorPromedio + " con un promedio de " + mayorPromedio);
    }

    public static void imprimirAprobadosExamenes(double[][] calificaciones) {
        for (int j = 0; j < calificaciones[0].length; j++) {
            int contadorAprobados = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                if (calificaciones[i][j] >= 70 && calificaciones[i][j] <= 100) {
                    contadorAprobados++;
                }
            }
            System.out.println("Número de alumnos con calificación aprobatoria en el examen " + (j + 1) + ": " + contadorAprobados);
        }
    }
}

