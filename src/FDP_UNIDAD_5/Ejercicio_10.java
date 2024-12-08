package FDP_UNIDAD_5;

public class Ejercicio_10 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] traspuesta = transponerMatriz(matriz);

        System.out.println("Matriz traspuesta:");
        imprimirMatriz(traspuesta);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] transponerMatriz(int[][] matriz) {
        int N = matriz.length;
        int M = matriz[0].length;
        int[][] traspuesta = new int[M][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        return traspuesta;
    }
}

