/*
 * Este algoritmo descompone segundos en horas, minutos y segundos
 */
package trabajoPracticoN3;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 22/04/2015
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        int horas, minutos, segundos, minTotales, totalSegundos;

        System.out.println("Ingrese cantidad de segundos: ");
        totalSegundos = TecladoIn.readLineInt();
        segundos = totalSegundos % 60;
        minTotales = (totalSegundos - segundos) / 60;
        horas = minTotales / 60;
        minutos = minTotales % 60;

        System.out.println(totalSegundos + " s son " + horas + ":" + minutos + ":" + segundos);
    }

}
