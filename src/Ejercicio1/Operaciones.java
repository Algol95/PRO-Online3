package Ejercicio1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Clase que contiene las ejercios realizados en la actividad online 2.
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 1.0
 */
public class Operaciones {

    private static Scanner teclado = new Scanner(System.in);
//        boolean error = true;
//        do {
//            try {
//                
//              error = false;
//            } catch (Exception e){
//                System.out.println("ERROR: ");
//              teclado.next();
//            }
//        } while (error==true);
//          teclado.next();

    /**
     * Método que pasa de pulgadas a centimetros.
     */
    public static void pulgadasCentimetros() {
        boolean error = true;
        do {
            try {
                System.out.println("Introduzca el número de pulgadas que desea convertir:");

                double pulg = teclado.nextDouble();

                System.out.print(pulg + " pulgadas son ");
                System.out.printf("%1.2f", pulg * 2.54);
                System.out.println(" centimetros.");
                error = false;
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número");
                teclado.next();
            }
        } while (error == true);
        
    }

    /**
     * Método que realiza la suma, resta y división de dos números.
     */
    public static void sumRestMultDiv() {
        boolean error = true;
        do {
            try {
                System.out.println("Introduce el primer número:");
                double num1 = teclado.nextDouble();
                System.out.println("Ahora introduzca el segundo número:");
                double num2 = teclado.nextDouble();

                System.out.print("Suma: " + num1 + " + " + num2 + " = ");
                System.out.printf("%1.2f", num1 + num2);
                System.out.print("\nResta: " + num1 + " - " + num2 + " = ");
                System.out.printf("%1.2f", num1 - num2);
                System.out.print("\nMultiplicación: " + num1 + " x " + num2 + " = ");
                System.out.printf("%1.2f", num1 * num2);
                System.out.print("\nDivisión: " + num1 + " / " + num2 + " = ");
                System.out.printf("%1.2f", num1 / num2);
                error = false;
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número.");
                teclado.next();
            }
        } while (error == true);
    }

    /**
     * Método que calcula los primeros cien numeros positivos.
     */
    public static void cienPositivos() {
        for (short n = 1; n <= 100; n++) {
            System.out.println(n);
        }
    }

    /**
     * Método que comprueba si un número es negativo.
     */
    public static void negativo() {
        boolean error = true;
        do {
            try {
                System.out.println("Introduce un número: ");
                double n = teclado.nextDouble();

                if (n < 0) {
                    System.out.println("El número introducido es negativo.");
                }
                error = false;
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número.");
                teclado.next();
            }
        } while (error == true);
    }

    /**
     * Método que calcula los siguintes 10 números pares a partir del
     * introducido por teclado.
     */
    public static void diezPares() {
        boolean error = true;
        do {
            try {
                int cont = 0;

                System.out.println("Introduzca un número entero: ");
                int n = teclado.nextInt();

                while (cont != 10) {
                    if (n % 2 == 0) {
                        cont++;
                        System.out.println("Par " + cont + ": " + n);
                    }
                    n++;
                }
                error = false;
            } catch (Exception e) {
                System.out.println("No se ha introducido un numero entero");
                teclado.next();
            }
        } while (error = true);
    }

    /**
     * Método que realiza la suma o resta de dos números.
     */
    public static void sumaOResta() {
        boolean error = true;
        do {
            try {
                System.out.println("Introduzca el primer número:");
                double n1 = teclado.nextDouble();
                System.out.println("Introduzca segundo número:");
                double n2 = teclado.nextDouble();

                System.out.println("¿Qué desea hacer?\n1. Sumar\n2. Restar");
                int a = teclado.nextInt();

                switch (a) {

                    case 1:
                        System.out.println(n1 + " + " + n2 + "=" + (n1 + n2));
                        break;
                    case 2:
                        System.out.println(n1 + "+" + n2 + "=" + (n1 - n2));
                        break;
                    default:
                        System.out.println("La opción introducida no se contempla.");
                }
                error = false;
            } catch (Exception e) {
                System.out.println("ERROR: El dato introducido no es correcto.");
                teclado.next();
            }
        } while (error == true);
    }

    /**
     * Método en el que se calcula multiples divisiones a partir del dividendo
     * 100, hasta que el usuario introduzca un 0.
     */
    public static void divisionesConsecutivasCien() {
        boolean error = true;
        do {
            try {
                double dividendo = 100;
                double divisor;

                do {
                    System.out.println("Introduce el divisor:");
                    divisor = teclado.nextDouble();
                    if (divisor != 0) {
                        System.out.println(dividendo + "/" + divisor + "=" + dividendo / divisor);
                        dividendo = dividendo / divisor;
                    }
                } while (divisor != 0);
                System.out.println("No es posible realizar una división entre 0");
                error = false;
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número.");
                teclado.next();
            }
        } while (error == true);
    }

    /**
     * Método que calcula los primeros 100 numeros impares.
     */
    public static void cienImpares() {
        int n = 1;
        for (int cont = 1; cont <= 100; cont++) {
            if (n % 2 != 0) {
                System.out.println("Impar " + cont + ": " + n);
            } else {
                cont--;
            }
            n++;
        }
    }

    /**
     * Método en el que se calcula si un número ENTERO es par o impar.
     */
    public static void parImpar() {
        boolean error = true;
        do {
            try {
                System.out.println("Introduzca un número entero:");
                int n = teclado.nextInt();

                if (n % 2 == 0) {
                    System.out.println("El número introducido es par");
                } else {
                    System.out.println("El número introducido es impar");
                }
                error = false;
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número ENTERO.");
                teclado.next();
            }
        } while (error == true);
    }
}
