/*
 * Se requiere un algoritmo que lea una secuencia de palabras hasta que se
 * ingrese el "." y arme una oración conteniendo todas las palabras separadas
 * por espacio pero en orden inverso, el algoritmo debe mostrar la oración.
 */
package trabajoPracticoN6;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 29/05/2015
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        String palabra, frase;

        frase = "";

        System.out.print("Ingrese una palabra (. para terminar): ");
        palabra = TecladoIn.readLine();

        while (!(palabra.equals("."))) {
            frase = palabra + " " + frase;
            System.out.print("Ingrese una palabra (. para terminar): ");
            palabra = TecladoIn.readLine();
        }

        System.out.println("La frase escrita al revés es: " + frase);
    }
}
