/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 * Clase principal del programa.
 * @author Ángel Miguel Cubino Aragaón
 * @version 1.0
 */
public class ClasePrincipal {

    /**
     * Método main que contiene un menu con distitintas opciones.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean error = true;
        Scanner teclado = new Scanner(System.in);
        int elec = ' ';
        do {
            try {
                System.out.println("Elija una de las siguientes opciones:");
                System.out.println("1. Suma de X e Y.\n2. Resta de X e Y.\n3. Divisón de X e Y.\n4. Multiplicación de X e Y.");
                elec = teclado.nextInt();
                switch (elec){
                    case 1:
                        System.out.println(OperacionesMatematicas.sumaXY());
                        break;
                    case 2:
                        System.out.println(OperacionesMatematicas.restaXY());
                        break;
                    case 3:
                        System.out.println(OperacionesMatematicas.divisionXY());
                        break;
                    case 4:
                        System.out.println(OperacionesMatematicas.multiplicacionXY());
                        break;
                    default:
                        System.out.println("ERROR: La opción introducida no esta contemplada.");
                }
                error = false;
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número entero");
                teclado.next();
            }
        } while (error == true || elec >4 || elec<1);
    }
    
}
