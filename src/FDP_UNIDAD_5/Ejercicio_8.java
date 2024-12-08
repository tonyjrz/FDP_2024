package FDP_UNIDAD_5;

public class Ejercicio_8 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36}
        };

        int[] sumasColumnas = calcularSumasColumnas(matriz);

        imprimirSumasColumnas(sumasColumnas);
    }

    public static int[] calcularSumasColumnas(int[][] matriz) {
        int[] sumasColumnas = new int[matriz[0].length];

        for (int columna = 0; columna < matriz[0].length; columna++) {
            for (int fila = 0; fila < matriz.length; fila++) {
                sumasColumnas[columna] += matriz[fila][columna];
            }
        }

        return sumasColumnas;
    }

    public static void imprimirSumasColumnas(int[] sumasColumnas) {
        for (int columna = 0; columna < sumasColumnas.length; columna++) {
            System.out.println("Suma de la columna " + (columna + 1) + ": " + sumasColumnas[columna]);
        }
    }
}

