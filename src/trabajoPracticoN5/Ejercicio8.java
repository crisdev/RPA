/*
 * Para acceder a una beca del comedor se debe tener un promedio de secundario
 * mayor a 7 y menor que 25 años, o en su defecto vivir en una localidad que se
 * encuentre a más de 30 km de la ciudad de Neuqué. Diseñe un algoritmo que
 * permita leer los datos correspondientes a un alumno e imprima un cartel
 * indicando si puede acceder o no a la beca.
 */
package trabajoPracticoN5;

import utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 16/05/2015
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        double promedioAlumno, distanciaANeuquen;
        int edadAlumno;

        System.out.print("Ingrese el promedio del alumno: ");
        promedioAlumno = TecladoIn.readLineDouble();
        System.out.print("Ingrese la edad del alumno: ");
        edadAlumno = TecladoIn.readLineInt();
        System.out.print("Ingrese la distancia a Neuquén: ");
        distanciaANeuquen = TecladoIn.readLineDouble();

        if (recibeBeca(promedioAlumno, edadAlumno, distanciaANeuquen)) {
            System.out.println("El alumno accede a la beca.");
        } else {
            System.out.println("El alumno no accede la beca.");
        }
    }

    /**
     * Determina si un alumno está en condiciones de recibir una beca de ayuda
     * económica.
     *
     * @param promedio promedio de notas del alumno
     * @param edad edad del alumno
     * @param distancia distancia en kilómetros a la ciudad de Neuquén
     * @return verdadero si se cumplen las condiciones para recibir la beca
     */
    public static boolean recibeBeca(double promedio, int edad, double distancia) {
        return (promedio >= 7.0) && (edad < 25) || (distancia > 30.0);
    }

}
