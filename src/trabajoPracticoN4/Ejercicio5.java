/*
 * Este algoritmo toma una hora y devuelve la cantidad de segundos totales
 */
package trabajoPracticoN4;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 6/05/2015
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int horas, minutos, segundos, resultado;

        System.out.print("Ingrese la cantidad de horas: ");
        horas = TecladoIn.readLineInt();
        System.out.print("Ingrese la cantidad de minutos: ");
        minutos = TecladoIn.readLineInt();
        System.out.print("Ingrese la cantidad de segundos: ");
        segundos = TecladoIn.readLineInt();

        resultado = totalSegundos(horas, minutos, segundos);

        System.out.println("La cantidad de segundos en total es " + resultado);

    }

    public static int totalSegundos(int horas, int minutos, int segundos) {
        return horas * 60 * 60 + minutos * 60 + segundos;
    }

}
