//@author Antonio
package pruebas;

import java.util.Scanner;

public class examen2_2 {

    public static void main(String[] args) {
        //VARIABLE
        Scanner sc = new Scanner(System.in);
        double saldoFinal, saldoInicial, puntos, equivPuntos;
        final double VALOR_PUNTOS = 0.12;
        //ENTRADA
        System.out.println("Ingrese el saldo inicial: ");
        saldoInicial = sc.nextDouble();

        System.out.println("Ingrese los puntos acumulados: ");
        puntos = sc.nextDouble();
        //PROCEAO
        equivPuntos = puntos * VALOR_PUNTOS;
        saldoFinal = saldoInicial + equivPuntos;
        //SALIDA
        System.out.println("Sus puntos acumulados equivalen a: " + equivPuntos);
        System.out.println("Despues de aplicar los puntos acumulados su saldo es de: " + saldoFinal);
    }
}

