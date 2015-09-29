/*
 * Este algoritmo calcula el promedio de cinco notas introducidas por el usuario
 */
package trabajoPracticoN3;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 22/04/2015
 */
public class Ejercicio6B {

    public static void main(String[] args) {
        double notaUno, notaDos, notaTres, notaCuatro, notaCinco, promedio;

        System.out.println("Ingrese la primera nota: ");
        notaUno = TecladoIn.readLineDouble();
        System.out.println("Ingrese la segunda nota: ");
        notaDos = TecladoIn.readLineDouble();
        System.out.println("Ingrese la tercera nota: ");
        notaTres = TecladoIn.readLineDouble();
        System.out.println("Ingrese la cuarta nota: ");
        notaCuatro = TecladoIn.readLineDouble();
        System.out.println("Ingrese la quinta nota: ");
        notaCinco = TecladoIn.readLineDouble();

        promedio = (notaUno + notaDos + notaTres + notaCuatro + notaCinco) / 5.0;

        System.out.println("El promedio de las notas es " + promedio);
    }

}
