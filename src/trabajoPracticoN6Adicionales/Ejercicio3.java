/*
 * Leer una secuencia de palabras hasta que se ingrese el "." y armar una
 * oración conteniendo todas las palabras separadas por espacio pero en
 * orden inverso. Mostrar la oración resultante.
 */
package trabajoPracticoN6Adicionales;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String palabra, frase;
        
        frase   = "";
        palabra = "";
        do {
            frase = palabra + frase;
            System.out.println("Ingrese una palabra (. para terminar): ");
            palabra = TecladoIn.readLine() + " ";
        } while (!palabra.equals(". "));
        
        System.out.println(frase);
    }
}
