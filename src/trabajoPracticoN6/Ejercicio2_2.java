/*
 * ¿Cómo podría modificar el ejercicio 1 para realizar la productoria de los N
 * primeros números naturales? Es decir: 1*2*3*4*5*6*7*...N.
 */
package trabajoPracticoN6;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 27/05/2015
 */
public class Ejercicio2_2 {

    public static void main(String[] args) {
        int contador, resultado, N;

        contador = 1;
        resultado = 1;

        System.out.println("Ingrese el máximo número natural");
        N = TecladoIn.readLineInt();

        while (contador <= N) {
            resultado = contador * resultado;
            contador = contador + 1;
        }

        System.out.println("El resultado es " + resultado);
    }
}
