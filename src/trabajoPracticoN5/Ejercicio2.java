/*
 * Leer un número, si es positivo mostrar su sucesor, en caso contrario mostrar
 * el antecesor.
 */
package trabajoPracticoN5;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 12/05/2015
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int numero;

        System.out.println("Ingrese un numero: ");
        numero = TecladoIn.readLineInt();

        if (esPositivo(numero)) {
            System.out.println("El número es positivo y su sucesor es " + ++numero);
        } else {
            System.out.println("El número no es positivo y su antecesor es " + --numero);
        }

    }

    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

}
