/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FDP_UNIDAD_3;
import java.util.Scanner;
/**
 *
 * @author Antonio
 */
public class EJERCICIO21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner sc = new Scanner(System.in);
        double x,t,sno;
        int n;
        System.out.print("Introduce un numero: ");
        x = sc.nextDouble();

        t = x;
        sno = t; 
        n = 1;


        while (Math.abs(t) > 0.001) {
            t = -t * x * x / ((2 * n) * (2 * n + 1));
            sno += t;
            n++;
        }


        System.out.println("El seno de " + x + " es: " + sno);
    }
}
   