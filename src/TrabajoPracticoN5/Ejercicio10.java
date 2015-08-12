/*
 * Se dese desarrollar un sistema para un museo en el cuál se pregunte al usuario
 * el tipo de alimentación de un animal (come sólo carne, come sólo vegetales,
 * come ambos) y en base a este se le debe dar un mensaje acorde a los datos
 * ingresados. Por ejemplo si come sólo carne el mensaje debe ser "Se trata de
 * un animal carnívoro", en el caso que coma sólo vegetales el mensaje debe ser
 * "Se trata de un animal herbívoro", en caso contrario el mensaje sería "Se trata
 * de un animal omnívoro".
 */
package TrabajoPracticoN5;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 16/05/2015
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        boolean comeCarne, comeVegetales;
        
        System.out.print("El animal come carne? ");
        comeCarne = TecladoIn.readLineBoolean();
        System.out.print("El animal come vegetales? ");
        comeVegetales = TecladoIn.readLineBoolean();
        
        if (comeCarne)
            if (comeVegetales)
                System.out.println("Se trata de un animal omnívoro.");
            else
                System.out.println("Se trata de un animal carnívoro.");
        else
            System.out.println("Se trata de un animal hervíboro.");
    }
    
}
