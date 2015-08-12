/*
 * Este algoritmo es una generalización del ejercicio 10 TP3
 */
package TrabajoPracticoN3;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 22/04/2015
 */
public class Ejercicio11 {
    
    public static void main(String[] args) {
        double ladoMenor, ladoMayor, ladoCuadrado, areaSombreada, areaRectangulo, XS, PX;
        
        System.out.println("Ingrese lado mayor del rectángulo: ");
        ladoMayor = TecladoIn.readLineDouble();
        System.out.println("Ingrese lado menor del rectángulo: ");
        ladoMenor = TecladoIn.readLineDouble();
        ladoCuadrado = ladoMenor;
        areaRectangulo = ladoMayor * ladoMenor;
        areaSombreada = areaRectangulo / 2;
        XS = areaSombreada / ladoCuadrado;
        PX = ladoCuadrado - XS;
        
        System.out.println("El lado PX mide " + PX);
    }
    
}
