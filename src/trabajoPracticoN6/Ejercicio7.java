/*
 * Se requiere un algoritmo que lea una secuencia de números que representan
 * temperaturas de diferentes días en una ciudad y calcule la temperatura
 * promedio de esos días.
 */
package trabajoPracticoN6;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 27/05/2015
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int cantidadTemperaturas;
        double sumaTemperaturas, temperatura;
        char respuesta;

        cantidadTemperaturas = 0;
        sumaTemperaturas = 0.0;

        do {
            cantidadTemperaturas++;
            System.out.println("Ingrese la temperatura " + cantidadTemperaturas + ":");
            temperatura = TecladoIn.readLineDouble();

            sumaTemperaturas += temperatura;

            System.out.println("Ingresar otro dato (S/N)? ");
            respuesta = TecladoIn.readLineNonwhiteChar();
        } while (respuesta == 's' || respuesta == 'S');

        System.out.println("El promedio de temperaturas ingresadas es de " + sumaTemperaturas / cantidadTemperaturas + "°C");
    }

}
