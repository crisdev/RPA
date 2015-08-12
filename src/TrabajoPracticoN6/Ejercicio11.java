/*
 * Se requiere un módulo para calcular el factorial de un número X, es decir X!
 * ¿En qué clase ubicaría este módulo para ser rehusado fácilmente en el futuro?
 */
package TrabajoPracticoN6;

import Utiles.TecladoIn;
import Utiles.Matematica;

/**
 *
 * @author Cristian
 * @version 29/05/2015
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        int numero;
        
        System.out.print("Ingrese un número: ");
        numero = TecladoIn.readLineInt();
        
        System.out.println(numero + "! = " + Matematica.factorial(numero));
    }
    
}
