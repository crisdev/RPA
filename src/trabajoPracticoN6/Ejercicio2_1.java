/*
 * ¿Cómo podría modificar el ejercicio 1 para realizar la productoria de los 10
 * primeros números naturales? Es decir: 1*2*3*4*5*6*7*8*9*10.
 */
package trabajoPracticoN6;

/**
 * Calcula el producto de los diez primeros números naturales.
 *
 * @author Cristian
 * @version 27/05/2015
 */
public class Ejercicio2_1 {

    public static void main(String[] args) {
        int contador, resultado;

        contador = 1;
        resultado = 1;

        while (contador <= 10) {
            resultado = contador * resultado;
            contador = contador + 1;
        }

        System.out.println("El resultado es " + resultado);
    }

}
