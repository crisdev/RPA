/*
 * Leer una secuencia de palabras hasta que se ingrese el "." y amar una oración
 * conteniendo todas las palabras separadas por espacio. Mostrar por pantalla
 * la oración resultante.
 */
package TrabajoPracticoN6Adicionales;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 5/06/2015
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String palabra, frase;
        
        System.out.println("Ingrese una palabra: ");
        palabra = TecladoIn.readLine();
        frase = "";
        
        while (!palabra.equals(".")) {
            frase = frase + palabra + " ";
            System.out.println("Ingrese una palabra: ");
            palabra = TecladoIn.readLine();
        }
        
        System.out.println("Lo escrito es: " + frase.trim());
    }
}
