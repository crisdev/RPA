/*
 * Este algoritmo calcula el promedio de 8, 9, 6, 7 y 9
 */
package TrabajoPracticoN3;

/**
 *
 * @author Cristian
 * @version 22/04/2015
 */
public class Ejercicio6A {

    public static void main(String[] args) {
        int a, b, c, d;
        double promedio;
        
        a = 6;
        b = 7;
        c = 8;
        d = 9;
        
        promedio = (a + b + c + 2*d) / 5.0;
        
        System.out.println(promedio);
    }
    
}
