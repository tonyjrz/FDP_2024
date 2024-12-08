package FDP_UNIDAD_4;

//* @author Antonio
import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de alumnos (1-50): ");
        int N = scanner.nextInt();
        double[][] calificaciones = new double[N][4];

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese las calificaciones del alumno " + (i + 1) + " (4 exámenes): ");
            for (int j = 0; j < 4; j++) {
                calificaciones[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < N; i++) {
            double suma = 0;
            for (int j = 0; j < 4; j++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / 4;
            System.out.println("Promedio del alumno " + (i + 1) + ": " + promedio);
        }

        for (int j = 0; j < 4; j++) {
            double suma = 0;
            for (int i = 0; i < N; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / N;
            System.out.println("Promedio del grupo en el examen " + (j + 1) + ": " + promedio);
        }

        double mayorPromedio = -1;
        int examenMayorPromedio = -1;
        for (int j = 0; j < 4; j++) {
            double suma = 0;
            for (int i = 0; i < N; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / N;
            if (promedio > mayorPromedio) {
                mayorPromedio = promedio;
                examenMayorPromedio = j + 1;
            }
        }
        System.out.println("El examen con mayor promedio de calificación es el examen " + examenMayorPromedio + " con un promedio de " + mayorPromedio);

        for (int j = 0; j < 4; j++) {
            int contadorAprobados = 0;
            for (int i = 0; i < N; i++) {
                if (calificaciones[i][j] >= 70 && calificaciones[i][j] <= 100) {
                    contadorAprobados++;
                }
            }
            System.out.println("Número de alumnos con calificación aprobatoria en el examen " + (j + 1) + ": " + contadorAprobados);
        }

    }
}
