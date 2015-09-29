/*
 * Se requiere un algoritmo que lea una secuencia de letras hasta que se lea el
 * caracter '-' y muestre por pantalla si se trata de una vocal o no a través
 * de la invocación a un módulo que da el mensaje apropiado según la letra
 * recibida por parámetro.
 */
package trabajoPracticoN6;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 29/05/2015
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        char letra;

        System.out.print("Ingrese una letra ('-' para terminar): ");
        letra = TecladoIn.readLineNonwhiteChar();

        while (letra != '-') {
            if (esVocal(letra)) {
                System.out.println("La letra ingresada es una vocal.");
            } else {
                System.out.println("La letra ingresada no es una vocal.");
            }

            System.out.print("Ingrese una letra ('-' para terminar): ");
            letra = TecladoIn.readLineNonwhiteChar();
        }
    }

    public static boolean esVocal(char letra) {
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
