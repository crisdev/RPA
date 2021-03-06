/*
 * Se necesita mostrar los tiempos que tardan dos aviones,
 * uno de la empresa LAN y el otro de Aerolíneas Argentinas,
 * para ir de la ciudad de Neuquén a Buenos Aires.
 * Los tiempos de despegue y arribo se leen en horas,
 * minutos y segundos.
 * Los vuelos despegan y aterrizan en el día,
 * por lo que siempre la hora de aterrizaje es mayor a la de despegue.
 * Se pide ingresar los tiempos de despegue y aterrizaje de ambas empresas y
 * en base a eso mostrar el tiempo empleado por cada una.
 * Modularizar convenientemente.
 */
package trabajoPracticoN4;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 6/05/2015
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        int hs, min, seg, partida, arribo, demoraLAN, demoraAA;

        // sección del avión de LAN
        System.out.print("Ingrese hora de partida del avión LAN: ");
        hs = TecladoIn.readLineInt();
        System.out.print("Ingrese minutos de partida del avión LAN: ");
        min = TecladoIn.readLineInt();
        System.out.print("Ingrese segundos de partida del avión LAN: ");
        seg = TecladoIn.readLineInt();
        partida = totalSegundos(hs, min, seg);

        System.out.print("Ingrese hora de llegada del avión LAN: ");
        hs = TecladoIn.readLineInt();
        System.out.print("Ingrese minutos de llegada del avión LAN: ");
        min = TecladoIn.readLineInt();
        System.out.print("Ingrese segundos de llegada del avión LAN: ");
        seg = TecladoIn.readLineInt();
        arribo = totalSegundos(hs, min, seg);

        demoraLAN = demora(partida, arribo);

        // sección del avión de AA
        System.out.print("Ingrese hora de partida del avión AA: ");
        hs = TecladoIn.readLineInt();
        System.out.print("Ingrese minutos de partida del avión AA: ");
        min = TecladoIn.readLineInt();
        System.out.print("Ingrese segundos de partida del avión AA: ");
        seg = TecladoIn.readLineInt();
        partida = totalSegundos(hs, min, seg);

        System.out.print("Ingrese hora de llegada del avión AA: ");
        hs = TecladoIn.readLineInt();
        System.out.print("Ingrese minutos de llegada del avión AA: ");
        min = TecladoIn.readLineInt();
        System.out.print("Ingrese segundos de llegada del avión AA: ");
        seg = TecladoIn.readLineInt();
        arribo = totalSegundos(hs, min, seg);

        demoraAA = demora(partida, arribo);

        System.out.println("El avión de LAN demora " + demoraLAN + " segundos.");
        System.out.println("El avión de AA demora " + demoraAA + " segundos.");

    }

    public static int totalSegundos(int horas, int minutos, int segundos) {
        return horas * 60 * 60 + minutos * 60 + segundos;
    }

    public static int demora(int inicio, int fin) {
        return fin - inicio;
    }
}
