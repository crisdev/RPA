/*
 * ¿Cómo podría modificar el algoritmo repite para realizar
 * la suma de números ingresados por teclado?
 */
package trabajoPracticoN6;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 30/05/2015
 */
public class Ejercicio2_3 {

    public static void main(String[] args) {
        int contador, resultado, numero;

        contador = 0;
        resultado = 0;

        while (contador < 10) {
            System.out.print("Ingrese un número: ");
            numero = TecladoIn.readLineInt();
            resultado = numero + resultado;
            contador = contador + 1;
        }

        System.out.println("El resultado es " + resultado);
    }
}
