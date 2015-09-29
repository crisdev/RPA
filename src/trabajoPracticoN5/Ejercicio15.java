/*
 * Leer tres valores correspondientes a los lados de un triángulo e indicar
 * si se trata de un triángulo equilátero.
 */
package trabajoPracticoN5;

import utiles.Geometria;
import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 22/05/2015
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        double lado1, lado2, lado3;

        System.out.println("Ingrese primer lado de un triángulo: ");
        lado1 = TecladoIn.readLineDouble();
        System.out.println("Ingrese segundo lado de un triángulo: ");
        lado2 = TecladoIn.readLineDouble();
        System.out.println("Ingrese tercer lado de un triángulo: ");
        lado3 = TecladoIn.readLineDouble();

        if (Geometria.esTrianguloEquilatero(lado1, lado2, lado3)) {
            System.out.println("El triángulo es equilátero.");
        } else {
            System.out.println("El triángulo no es equilátero.");
        }
    }

}
