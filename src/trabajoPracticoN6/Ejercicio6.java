/*
 * Se requiere un algoritmo para calcular la potencia de una base elevada a un
 * exponente (sin usar Math.pow) es decir potencia(base, exponente).
 */
package trabajoPracticoN6;

import utiles.TecladoIn;
import utiles.Matematica;

/**
 *
 * @author Cristian
 * @version 27/05/2015
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int base, exponente;
        char respuesta;

        do {
            System.out.println("Ingrese la base del número: ");
            base = TecladoIn.readLineInt();
            System.out.println("Ingrese el exponente del número: ");
            exponente = TecladoIn.readLineInt();
            System.out.println(base + "^" + exponente + " = " + Matematica.potencia(base, exponente));

            System.out.println("Realizar otra operación (S/N)? ");
            respuesta = TecladoIn.readLineNonwhiteChar();
        } while (respuesta == 'S' || respuesta == 's');
    }
}
