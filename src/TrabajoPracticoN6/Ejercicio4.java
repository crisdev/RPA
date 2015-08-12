/*
 * Se requiere un algoritmo que lea una secuencia de números y por cada uno
 * muestre por pantalla el sucesor y el predecesor.
 */
package TrabajoPracticoN6;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 26/05/2015
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int numero;

        System.out.println("Ingrese un número entero (0 para terminar): ");
        numero = TecladoIn.readLineInt();
        while (numero != 0) {
            mostrarAnteriorSiguiente(numero);
            System.out.println("Ingrese un número entero (0 para terminar): ");
            numero = TecladoIn.readLineInt();
        }

    }

    public static void mostrarAnteriorSiguiente(int numero) {
        System.out.println("Número anterior: " + (numero - 1));
        System.out.println("Número siguiente: " + (numero + 1));
    }

}
