
package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
public class Ejercicio_13 {

    public static void main(String[] args) {

        String[][] matriz = {{"La", "vida", "no", "es", "la"}, {"momentos", "que", "te", "dejan", "cantidad"}, {"los", "Hitch", "aliento.", "sin", "de"}, {"sino", ",", "respiras", "que", "veces"}};

        System.out.println("Impresión por filas:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("\nImpresión en espiral:");
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int inicioFila = 0, finFila = filas - 1;
        int inicioColumna = 0, finColumna = columnas - 1;

        while (inicioFila <= finFila && inicioColumna <= finColumna) {
            for (int i = inicioColumna; i <= finColumna; i++) {
                System.out.print(matriz[inicioFila][i] + " ");
            }
            inicioFila++;

            for (int i = inicioFila; i <= finFila; i++) {
                System.out.print(matriz[i][finColumna] + " ");
            }
            finColumna--;

            if (inicioFila <= finFila) {
                for (int i = finColumna; i >= inicioColumna; i--) {
                    System.out.print(matriz[finFila][i] + " ");
                }
                finFila--;
            }

            if (inicioColumna <= finColumna) {
                for (int i = finFila; i >= inicioFila; i--) {
                    System.out.print(matriz[i][inicioColumna] + " ");
                }
                inicioColumna++;
            }
        }
    }
}
