/*
 * Se requiere un algoritmo que lea una secuencia de números que representan el
 * sueldo del personal de una empresa y calcule el sueldo promedio de los
 * empleados. La cantidad de empleados se conoce previamente.
 */
package trabajoPracticoN6;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 26/05/2015
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int cantidadEmpleados;

        System.out.println("Ingrese el número de empleados: ");

        cantidadEmpleados = TecladoIn.readLineInt();

        System.out.println("El sueldo promedio es $" + calculaSueldoPromedio(cantidadEmpleados));
    }

    public static double calculaSueldoPromedio(int cantidadDeEmpleados) {
        int i;
        double total, sueldo;

        total = 0.0;

        for (i = 0; i < cantidadDeEmpleados; i++) {
            System.out.print("Ingrese sueldo del empleado " + (i + 1) + ": ");
            sueldo = TecladoIn.readLineDouble();
            total += sueldo;
        }

        return total / cantidadDeEmpleados;
    }

}
