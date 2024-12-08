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
public class EJERCICIO12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("MENU DE PIZZAS");
        System.out.println("1.- Italiana");
        System.out.println("2.- Carnes Frias");
        System.out.println("3.- Vegetariana");
        System.out.println("4.- Pepperoni");
        System.out.println("5.- Hawaiana");
        System.out.println("6.- Mexicana");
        System.out.println("7.- Camaron");
        System.out.println("¿Que pizza desea ordenar? ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Elegiste la pizza Italiana"
                        + "\nLos ingredientes son: Aceitunas, Jamón serrano , tomate, salsa de tomate y queso mozzarella");
                break;

            case 2:
                System.out.println("Elegiste la pizza de Carnes Frias"
                        + "\nLos ingredientes son: pepperoni, salchicha, Jamón, chorizo, queso mozzarella y salsa de tomate");
                break;

            case 3:
                System.out.println("Elegiste la pizza Vegetariana"
                        + "\nLos ingredientes son: Pimiento, champiñones, cebolla, aceitunas, tomate fresco, salsa de tomate y queso mozzarella");
                break;

            case 4:
                System.out.println("Elegiste la pizza de Pepperoni"
                        + "\nLos ingredientes son: Pepperoni, salsa de tomate y queso mozzarella extra");
                break;

            case 5:
                System.out.println("Elegiste la pizza Hawaiana"
                        + "\nLos ingredientes son: Jamón, piña, salsa de tomate y queso mozzarella");
                break;

            case 6:
                System.out.println("Elegiste la pizza Mexicana"
                        + "\nLos ingredientes son: Carne molida, jalapeños, pimiento, cebolla, salsa de tomate y queso mozzarella");
                break;

            case 7:
                System.out.println("Elegiste la pizza de Camarón"
                        + "\nLos ingredientes son: Camarones, ajo, perejil, salsa de tomate y queso mozzarella");
                break;

            default:
               

        }

    }

}
