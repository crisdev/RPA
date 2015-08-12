/*
 * Leer un carácter e indicar a través de un cartel si se trata de una vocal.
 */
package TrabajoPracticoN5;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 22/05/2015
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        char letra;
        
        System.out.println("Introduzca un caracter: ");
        letra = TecladoIn.readLineNonwhiteChar();
        
        if (esVocal(letra))
        {
            System.out.println("La letra introducida es una vocal.");
        }
        else
        {
            System.out.println("La letra introducida no es una vocal.");
        }
    }
    
    /**
     * Determina si la letra recibida como argumento es una vocal.
     * 
     * @param letra cualquier letra del abecedario
     * @return verdadero si es vocal, sino falso
     */
    public static boolean esVocal(char letra) {
        switch(letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
