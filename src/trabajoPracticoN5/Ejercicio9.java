/*
 * Dado un número se desea saber si es positivo, negativo o cero.
 */
package trabajoPracticoN5;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 16/05/2015
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        int numero;

        System.out.println("Ingrese un número: ");
        numero = TecladoIn.readLineInt();

        if (numero > 0) {
            System.out.println("El número es mayor a cero.");
        } else if (numero < 0) {
            System.out.println("El número es menor a cero.");
        } else {
            System.out.println("El número es cero.");
        }
    }

}
