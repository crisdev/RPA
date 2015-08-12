/*
 * Diseñe e implemente un módulo que dado un número devuelva su valor absoluto.
 * Crear una clase dentro del paquete utiles llamada matemática y coloque allí
 * el módulo desarrollado. Revise y analice de los módulos creados hasta el
 * momento en los prácticos 4 y 5 cuáles podrían integrar la clase matemática.
 */
package TrabajoPracticoN5;

import Utiles.TecladoIn;
import Utiles.Matematica;

/**
 *
 * @author Cristian
 * @version 16/05/2015
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        double numero;
        
        System.out.print("Ingrese un número: ");
        numero = TecladoIn.readLineDouble();
        
        System.out.println("El valor absoluto del número es " + Matematica.valorAbsoluto(numero));
    }
    
}
