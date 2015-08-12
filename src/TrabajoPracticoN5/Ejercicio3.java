/*
 * Dado un número verificar si es múltiplo de 7.
 */
package TrabajoPracticoN5;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 13/05/2015
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        int numero;
        
        System.out.println("Ingrese un número: ");
        numero = TecladoIn.readLineInt();
        
        if (esMultiploDe7(numero))
            System.out.println("El número " + numero + " es múltiplo de 7.");
        else
            System.out.println("El número " + numero + " no es múltiplo de 7.");
    }

    public static boolean esMultiploDe7(int numero) {
        return numero % 7 == 0;
    }
}
