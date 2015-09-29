/*
 * Este algoritmo intercambia variables
 */
package trabajoPracticoN3;

/**
 *
 * @author Cristian
 * @version 22/04/2015
 */
public class Ejercicio7B {

    public static void main(String[] args) {
        int x, y, z;

        x = 5;
        y = 8;
        z = x;
        x = y;
        y = z;

        System.out.println("Los valores son " + "x = " + x + " y = " + y + " z = " + z);
    }

}
