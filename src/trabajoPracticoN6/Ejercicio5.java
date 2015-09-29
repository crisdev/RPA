/*
 * Se requiere un algoritmo que lea una secuencia de números naturales hasta que
 * se ingrese el -1 y muestre por pantalla el cuadrado de cada uno.
 */
package trabajoPracticoN6;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 27/05/2015
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int numero;

        System.out.println("Ingrese un número natural (-1 para terminar): ");
        numero = TecladoIn.readLineInt();

        while (numero != -1) {
            System.out.println("El cuadro de " + numero + " es " + numero * numero + ".");
            System.out.println("Ingrese un número natural (-1 para terminar): ");
            numero = TecladoIn.readLineInt();
        }
    }
}
