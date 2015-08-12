/*
 * Este algoritmo resuelve el problema 8 del práctico 2
 */
package TrabajoPracticoN3;

/**
 *
 * @author Cristian
 * @version 22/04/2015
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        int areaRectangulo, areaCuadrado, XS, PX;

        areaRectangulo = 10 * 6;
        areaCuadrado = areaRectangulo / 2;
        XS = areaCuadrado / 6;
        PX = 6 - XS;

        System.out.println("El lado PX mide " + PX);
    }

}
