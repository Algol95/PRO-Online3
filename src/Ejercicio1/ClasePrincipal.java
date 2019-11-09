/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 * Clase principal que despliega un menu.
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 1.0
 */
public class ClasePrincipal {

    /**
     * Método principal de la clase, contiene un menú con diferentes opciones.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        boolean error = true;
        int num = ' ';
        do {
            try {
                System.out.println("Elija una de las siguientes opciones: ");
                System.out.println("1. Pasar de Pulgadas a Centimeros.\n2. Suma, Resta y División de dos Números.\n3. Primeros cien numeros positivos.\n4. Comprovación número negativo.\n5. Diez números pares.\n6. Suma o Resta de dos números.\n7. Divisiones consecutivas a partir de 100.\n8. Primeros 100 números impares.\n9. Número par o impar.");
                System.out.println("Pulse 0 para salir del programa.");
                num = teclado.nextInt();
                switch (num) {
                    case 1:
                        Operaciones.pulgadasCentimetros();
                        break;
                    case 2:
                        Operaciones.sumRestMultDiv();
                        break;
                    case 3:
                        Operaciones.cienPositivos();
                        break;
                    case 4:
                        Operaciones.negativo();
                        break;
                    case 5:
                        Operaciones.diezPares();
                        break;
                    case 6:
                        Operaciones.sumaOResta();
                        break;
                    case 7:
                        Operaciones.divisionesConsecutivasCien();
                        break;
                    case 8:
                        Operaciones.cienImpares();
                        break;
                    case 9:
                        Operaciones.parImpar();
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("ERROR: La opción introducida no esta contemplada.");
                }
                error = false;

            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir un número entero");
                teclado.next();
            }
        } while (error == true || num !=0);
    }

}
