/*
 * Este algoritmo descompone un numero de tres cifras
 */
package TrabajoPracticoN3;

import Utiles.*;

/**
 *
 * @author Cristian
 * @version 22/04/2015
 */
public class Ejercicio8 {
    
    public static void main(String[] args) {
        int primeraCifra, segundaCifra, terceraCifra, numero;
        
        System.out.println("Ingrese numero de tres cifras: ");
        numero = TecladoIn.readLineInt();
        
        terceraCifra = numero % 10;
        numero /= 10;
        segundaCifra = numero % 10;
        primeraCifra = numero / 10;
        
        System.out.println("El numero descompuesto es " + primeraCifra + " " + segundaCifra + " " + terceraCifra);
    }
    
}
