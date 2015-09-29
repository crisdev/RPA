/*
 * Leer dos números, n y m, e imprimir un cartel que indique cual es el menor de
 * ambos.
 */
package trabajoPracticoN5;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 16/07/2015
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int n, m;

        System.out.println("Ingrse un número: ");
        n = TecladoIn.readLineInt();
        System.out.println("Ingrese otro número: ");
        m = TecladoIn.readLineInt();

        if (n > m) {
            System.out.println("El número " + m + " es menor que " + n);
        } else {
            System.out.println("El número " + n + " es menor que " + m);
        }
    }

}
