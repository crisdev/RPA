/*
 * Realice la traza del siguiente algoritmo y decriba
 * con sus palabras lo que realiza.
 */
package TrabajoPracticoN6;

/**
 *
 * @author Cristian
 * @version 26/05/2015
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int contador, resultado;

        contador = 0;
        resultado = 0;

        while (contador < 10) {
            resultado = contador + resultado;
            contador = contador + 1;
        }

        System.out.println("El resultado es " + resultado);
    }
}
