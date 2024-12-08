/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FDP_UNIDAD_2;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class ConvertirSegundos19 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dias, horas, minutos, segundos, segundosTR, segundosr;

        System.out.println("Ingrese la cantidad total del tiempo en segundos: ");
        segundosTR = lector.nextInt();

        dias = segundosTR / 86400;
        segundosr = segundosTR % 86400;

        horas = segundosr / 3600;
        segundosr %= 3600;

        minutos = segundosr / 60;
        segundos = segundosr % 60;

        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

    }

}
