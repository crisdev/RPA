/*
 * Leer un número entero y verifica si es impar.
 */
package TrabajoPracticoN5;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 12/05/2015
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int numero;

        System.out.println("Ingrese un número: ");
        numero = TecladoIn.readLineInt();

        if (esImpar(numero))
            System.out.println("El número es impar.");
        else
            System.out.println("El número es par.");
    }

    public static boolean esImpar(int number) {
        return number % 2 != 0;
    }

}
