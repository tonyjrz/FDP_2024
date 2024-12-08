package FDP_UNIDAD_5;

public class Ejercicio_9 {

    public static void main(String[] args) {
        int[][] matriz = {
            {5, 3, 9, 1, 7},
            {2, 8, 6, 4, 10},
            {12, 14, 3, 7, 5},
            {9, 2, 8, 6, 11}
        };

        imprimirMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            int mayor = encontrarMayor(matriz[i]);
            int menor = encontrarMenor(matriz[i]);
            System.out.println("Fila " + (i + 1) + " - Mayor: " + mayor + ", Menor: " + menor);
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    public static int encontrarMayor(int[] fila) {
        int mayor = fila[0];
        for (int elemento : fila) {
            if (elemento > mayor) {
                mayor = elemento;
            }
        }
        return mayor;
    }

    public static int encontrarMenor(int[] fila) {
        int menor = fila[0];
        for (int elemento : fila) {
            if (elemento < menor) {
                menor = elemento;
            }
        }
        return menor;
    }
}

