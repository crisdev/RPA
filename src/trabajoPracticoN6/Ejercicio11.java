/*
 * Se requiere un módulo para calcular el factorial de un número X, es decir X!
 * ¿En qué clase ubicaría este módulo para ser rehusado fácilmente en el futuro?
 */
package trabajoPracticoN6;

import utiles.TecladoIn;
import utiles.Matematica;

/**
 *
 * @author Cristian
 * @version 29/05/2015
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        int numero;

        System.out.print("Ingrese un número: ");
        numero = TecladoIn.readLineInt();

        System.out.println(numero + "! = " + Matematica.factorial(numero));
    }

}
