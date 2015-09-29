/*
 * Se requiere un algoritmo que lea una secuencia de 'N' números e indique
 * por cada valor si el número es positivo, cero o negativo.
 */
package trabajoPracticoN6;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 27/05/2015
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        int numero;
        String respuesta;

        respuesta = "si";

        while (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingrese un número:");
            numero = TecladoIn.readLineInt();

            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("El número es cero.");
            }

            System.out.println("Relizar otra operación? (si/no) ");
            respuesta = TecladoIn.readLine();
        }
    }
}
