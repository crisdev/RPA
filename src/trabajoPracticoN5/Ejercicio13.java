/*
 * Leer dos números correspondientes al año de nacimiento de una persona y el
 * año actual, e indicar si la persona tiene más de 18 años.
 */
package trabajoPracticoN5;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 17/05/2015
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        int birthYear;

        System.out.println("Ingrese año de nacimiento: ");
        birthYear = TecladoIn.readLineInt();

        if (edad(birthYear) > 18) {
            System.out.println("La persona tiene más de 18 años.");
        } else {
            System.out.println("La persona tiene menos de 18 años.");
        }
    }

    public static int edad(int nacimiento) {
        final int actualYear = 2015;

        return actualYear - nacimiento;
    }

}
