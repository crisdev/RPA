/*
 * Dada una cadena de caracteres y un símbolo, generar una nueva cadena donde se
 * reemplacen todas las ocurrencias del símbolo dado por un '*'.
 */
package TrabajoPracticoN6Adicionales;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 6/05/2015
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        String texto;
        char caracter;
        
        System.out.print("Ingrese un texto: ");
        texto = TecladoIn.readLine();
        System.out.print("Ingrese un símbolo: ");
        caracter = TecladoIn.readLineNonwhiteChar();
        
        System.out.println("Modificado: " + generaFrase(texto, caracter));
    }
    
    public static String generaFrase(String frase, char simbolo) {
        int i;
        String palabra;
        palabra = frase;
        
        for (i = 1; i < frase.length(); i++) {
            if (frase.charAt(i-1) == simbolo) {
                palabra = palabra.substring(0, i-1) + "*" + palabra.substring(i);
            }
        }
        
        return palabra;
    }
}
