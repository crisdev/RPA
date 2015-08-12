/*
 * Verificar si dos números n y m dados están ordenados en forma decreciente.
 */
package TrabajoPracticoN5;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 12/05/2015
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        int n, m;
        
        System.out.println("Ingrese el número n: ");
        n = TecladoIn.readLineInt();
        System.out.println("Ingrese el número m: ");
        m = TecladoIn.readLineInt();
        
        if (esMayor(n, m))
            System.out.println("Los números están ordenados en forma decreciente.");
        else
            System.out.println("Los números no están ordenados en forma decreciente.");
    }
    
    public static boolean esMayor(int primerNumero, int segundoNumero) {
       return primerNumero > segundoNumero;
    }
    
}
