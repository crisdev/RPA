/*
 * La materia RPA se promociona si el promedio de las notas que se obtienen en
 * los dos parciales a rendir supera la nota 8. Leer el nombre y apellido de un
 * alumno, las notas obtenidas en los parciales rendidos e indicar si el alumno
 * promocionó o no la materia.
 */
package TrabajoPracticoN5;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 17/05/2015
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        String nombre, apellido;
        double primerNota, segundaNota;
        
        System.out.println("Ingrese nombre del alumno: ");
        nombre = TecladoIn.readLine();
        System.out.println("Ingrese el apellido del alumno: ");
        apellido = TecladoIn.readLine();
        System.out.println("Ingrese primera nota del parcial: ");
        primerNota = TecladoIn.readLineDouble();
        System.out.println("Ingrese segunda nora del parcial: ");
        segundaNota = TecladoIn.readLineDouble();
        
        if (promedio(primerNota, segundaNota) >= 8)
            System.out.println("El alumno " + nombre + " " + apellido + " promociona RPA");
        else
            System.out.println("El alumno " + nombre + " " + apellido + " no promociona RPA");
    }
    
    public static double promedio(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }
    
}
