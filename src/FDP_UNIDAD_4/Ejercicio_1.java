
package FDP_UNIDAD_4;

/**
 *
 * @author Antonio
 */
public class Ejercicio_1 {

    public static void main(String[] args) {

        // Arreglo unidimensional que almacena 10 números reales
        double[] numeros = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};

        double sumaCuadrados = 0.0;

        for (int i = 0; i < numeros.length; i++) {
            sumaCuadrados += Math.pow(numeros[i], 2);
        }

        // Mostrar el resultado
        System.out.println("La suma del cuadrado de los números es: " + sumaCuadrados);
    }
}
