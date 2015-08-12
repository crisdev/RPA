/*
 * Se requiere un algoritmo que lea un número 'x' y luego una secuencia de 'N'
 * números y cuente cuántos de ellos son múltiplos de x. Se sugiere diseñar un
 * módulo que reciba por parámetro x y el número leído y retorne 1 si hay que
 * contarlo y 0 en caso contrario.
 */
package TrabajoPracticoN6;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 29/05/2015
 */
public class Ejercicio14 {
    
    public static void main(String[] args) {
        int valor, numero, contador;
        char operacion;
        
        operacion = 's';
        contador = 0;
        
        System.out.print("Ingrese un valor: ");
        valor = TecladoIn.readLineInt();
        
        while (operacion == 's' || operacion == 'S') {
            System.out.print("Ingrese un número: ");
            numero = TecladoIn.readLineInt();
            if (esMultiplo(valor, numero))
                contador++;
            System.out.print("Realizar otra operación (s/n)? ");
            operacion = TecladoIn.readLineNonwhiteChar();
        }
        
        System.out.println("Hay " + contador + " números que son múltiplos de " + valor);
    }

    public static boolean esMultiplo(int x, int numero) {
        return numero % x == 0;
    }
}
