/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 * Clase que contiene diferentes métodos que realizan operaciones matemáticas.
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 1.0
 */
public class OperacionesMatematicas {

    /**
     * @param x Numero entero, tipo int.
     * @param y Numero entero, tipo int.
     * @param teclado Objeto de la clase Scanner que permite introducir datos
     * por la consola.
     */
    private static double x;
    private static double y;
    private static Scanner teclado = new Scanner(System.in);

    /**
     * Método que realiza la suma de los numeros X e Y.
     * @return Devuelve un string con los valores de X e Y y su suma.
     */
    public static String sumaXY() {
        double suma = ' ';
        boolean error = true;
        do {
            try {
                System.out.println("Introduzca el numero x: ");
                x = teclado.nextDouble();
                System.out.println("Introduzca el numero y: ");
                y = teclado.nextDouble();
                suma = x + y;
                error=false;
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número.");
                teclado.next();
            }

        } while (error == true);
        return "La suma de: " + x + " + " + y + " = " + suma;
    }
    
    /**
     * Método que realiza la resta de los numeros X e Y.
     * @return Devuelve un string con los valores de X e Y y su resta.
     */
    public static String restaXY() {
        double resta = ' ';
        boolean error = true;
        do {
            try {
                System.out.println("Introduzca el numero x: ");
                x = teclado.nextDouble();
                System.out.println("Introduzca el numero y: ");
                y = teclado.nextDouble();
                resta = x - y;
                error=false;
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número.");
                teclado.next();
            }

        } while (error == true);
        return "La resta de: " + x + " - " + y + " = " + resta;
    }
    /**
     * Método que realiza la división de los numeros X e Y.
     * @return Devuelve un string con los valores de X e Y y su división.
     */
    public static String divisionXY() {
        double div = ' ';
        boolean error = true;
        do {
            try {
                System.out.println("Introduzca el numero x: ");
                x = teclado.nextDouble();
                System.out.println("Introduzca el numero y: ");
                y = teclado.nextDouble();
                div = x / y;
                error=false;
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número.");
                teclado.next();
            }

        } while (error == true);
        return "La suma de: " + x + " + " + y + " = " + div;
    }
    
    /**
     * Método que realiza la multiplicación de los numeros X e Y.
     * @return Devuelve un string con los valores de X e Y y su multiplicación.
     */
    public static String multiplicacionXY() {
        double mul = ' ';
        boolean error = true;
        do {
            try {
                System.out.println("Introduzca el numero x: ");
                x = teclado.nextDouble();
                System.out.println("Introduzca el numero y: ");
                y = teclado.nextDouble();
                mul = x * y;
                error=false;
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número.");
                teclado.next();
            }

        } while (error == true);
        return "La suma de: " + x + " x " + y + " = " + mul;
    }
}
