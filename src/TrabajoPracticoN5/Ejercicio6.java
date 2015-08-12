/*
 * Implementar el siguiente algoritmo en lenguaje Java:
 *
 * LEER(a)
 * LEER(b)
 * r <- 0
 * SI (a > 0) ^ (b > 0) ENTONCES
 *          r <- a mod b
 * FIN SI
 * ESCRIBIR(r)
 */
package TrabajoPracticoN5;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 16/05/2015
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int a, b, r;
        
        System.out.println("Ingrese el número a: ");
        a = TecladoIn.readLineInt();
        System.out.println("Ingrese el número b: ");
        b = TecladoIn.readLineInt();
        
        r = 0;
        
        if (a>0 && b>0)
            r = a % b;
        
        System.out.println("El resto de dividir " + a + " entre " + b + " es: " + r);
    }
    
}
