/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

/**
 *
 * @author Cristian
 * @version 16/05/2015
 */
public class Matematica {
    
    /**
     * Devuelve el valor absoluto del número ingresado.
     * 
     * @param numero número ingresado
     * @return número sin signo
     * @since 16/05/2015
     */
    public static double valorAbsoluto(double numero) {
        return (numero >= 0) ? numero : -numero; 
    }
    
    /**
     * Operación de potenciación para números enteros.
     * 
     * @param base base en la que se encuentra el número
     * @param exponente número al que se desea elevar la base
     * @return la base multiplicada tantas veces como indique el exponente
     * @since 27/05/2015
     */
    public static int potencia(int base, int exponente) {
        int i, resultado;
        resultado = 1;
        
        for (i=0; i<exponente; i++) {
            resultado = resultado*base;
        }
        
        return resultado;
    }
    
    /**
     * Calcula el factorial del número dado.
     * 
     * @param numero número del que se desea conocer el factorial
     * @return factorial del número introducido
     */
    public static int factorial(int numero) {
        int i, resultado;
        
        for (i = numero, resultado = 1; i > 0; i--) {
            resultado = resultado*i;
        }
        
        return resultado;
    }
}
