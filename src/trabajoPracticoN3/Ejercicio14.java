/*
 * Este algoritmo proporciona la solución del problema 15 TP2
 */
package trabajoPracticoN3;

/**
 *
 * @author Cristian
 * @version 22/04/2015
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        int areaTotal;
        double pinturaxm2, consumo;

        areaTotal = 2 * 4 * 8 + 2 * (2 * 4 / 2) + 2 * (4 * 1 / 2);
        pinturaxm2 = 0.5;
        consumo = areaTotal * pinturaxm2;

        System.out.println("Se necesitan " + consumo + " kg de pintura.");
    }

}
