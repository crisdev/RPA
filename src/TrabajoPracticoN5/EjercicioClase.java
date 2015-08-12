/*
 * Diseñar un algoritmo que dadas 3 notas de un alumno indique si promociona
 * (promedio >= 8) cursa (promedio >= 6) o desaprueba (promedio < 6) la materia.
 */
package TrabajoPracticoN5;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 19/05/2015
 */
public class EjercicioClase {
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        double prom;
        
        System.out.println("Ingrese la primera nota: ");
        nota1 = TecladoIn.readLineInt();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = TecladoIn.readLineInt();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = TecladoIn.readLineInt();
        
        prom = promedio(nota1, nota2, nota3);
  
        analisis(prom);
    }
    
    /**
     * Este módulo calcula el promedio de tres notas.
     * 
     * @param n1 primer nota del alumno
     * @param n2 segunda nota del alumno
     * @param n3 tercer nota del alumno
     * @return promedio de las notas del alumno
     */
    public static double promedio(int n1, int n2, int n3) {
        return (n1+n2+n3)/3.0;
    }
    
    /**
     * Este módulo analiza el valor del promedio y da un mensaje.
     * 
     * @param prom valor del promedio de las notas
     */
    public static void analisis(double prom) {
        if (prom >= 8)
            System.out.println("El alumno promocionó la materia.");
        else
            if (prom >= 6)
                System.out.println("El alumno aprobó la materia.");
            else
                System.out.println("El alumno desaprobó la materia.");
        
    }
    
}
