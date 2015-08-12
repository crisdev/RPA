/*
 * Se requiere un algoritmo que lea una secuencia de palabras hasta que se
 * ingrese la cadena vacía y cuente cuantas palabras tienen 3 letras o menos.
 */
package TrabajoPracticoN6;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 29/05/2015
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        String palabra;
        int cantidadLetras;

        System.out.print("Ingrese una palabra: ");
        palabra = TecladoIn.readLine();

        while (!(palabra.equals(""))) {
            cantidadLetras = palabra.length();

            if (cantidadLetras <= 3) {
                System.out.println("La palabra tiene tres letras o menos.");
            } else {
                System.out.println("La palabra tiene más de tres letras.");
            }
            System.out.print("Ingrese una palabra: ");
            palabra = TecladoIn.readLine();
        }
    }
}
