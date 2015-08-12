/*
 * Este algoritmo utiliza la clase de geometría para realizar cálculos.
 */
package TrabajoPracticoN4;

import Utiles.TecladoIn;
import Utiles.Geometria;

/**
 *
 * @author Cristian
 * @version 6/05/2015
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        double lado, resultado, radio, alto, ancho, largo;
        double lado1, lado2, lado3;
        
        System.out.print("Ingrese un lado del cuadrado: ");
        lado = TecladoIn.readLineDouble();
        resultado = Geometria.perimetroCuadrado(lado);    
        System.out.println("El perímetro del cuadrado es " + resultado);
        resultado = Geometria.areaCuadrado(lado);
        System.out.println("El área del cuadrado es " + resultado);
        
        System.out.print("Ingrese el radio de un círculo: ");
        radio = TecladoIn.readLineDouble();
        resultado = Geometria.perimetroCircunferencia(radio);
        System.out.println("El perímetro de la circunferencia es " + resultado);
        resultado = Geometria.areaCirculo(radio);
        System.out.println("El área del círculo es " + resultado);
        
        System.out.print("Ingrese el alto de un rectángulo: ");
        alto = TecladoIn.readLineDouble();
        System.out.print("Ingrese el ancho del rectángulo: ");
        ancho = TecladoIn.readLineDouble();
        resultado = Geometria.perimetroRectangulo(alto, ancho);
        System.out.println("El perímetro del rectángulo es " + resultado);
        resultado = Geometria.areaRectangulo(alto, ancho);
        System.out.println("El área del rectángulo es " + resultado);
        
        System.out.print("Ingrese un lado de un triángulo: ");
        lado1 = TecladoIn.readLineDouble();
        System.out.print("Ingrese otro lado del triángulo: ");
        lado2 = TecladoIn.readLineDouble();
        System.out.print("Ingrese el último lado del triángulo: ");
        lado3 = TecladoIn.readLineDouble();
        resultado = Geometria.perimetroTriangulo(lado1, lado2, lado3);
        System.out.println("El perímetro del triángulo es " + resultado);
        
        System.out.print("Ingrese el alto de un triángulo: ");
        alto = TecladoIn.readLineDouble();
        System.out.print("Ingrese el ancho del triángulo: ");
        ancho = TecladoIn.readLineDouble();
        resultado = Geometria.areaTriangulo(alto, ancho);
        System.out.println("El área del triángulo es " + resultado);
        
        System.out.print("Ingrese el lado de un cubo: ");
        lado = TecladoIn.readLineDouble();
        resultado = Geometria.volumenCubo(lado);
        System.out.println("El volumen del cubo es " + resultado);
        
        System.out.print("Ingrese el radio de un cilindro: ");
        radio = TecladoIn.readLineDouble();
        System.out.print("Ingrese el largo del cilindro:");
        largo = TecladoIn.readLineDouble();
        resultado = Geometria.volumenCilindro(radio, largo);
        System.out.println("El volumen del cilindro es " + resultado);
        
        System.out.print("Ingrese el largo de la base de una pirámide: ");
        largo = TecladoIn.readLineDouble();
        System.out.print("Ingrese el ancho de la base de la pirámide: ");
        ancho = TecladoIn.readLineDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        alto = TecladoIn.readLineDouble();
        resultado = Geometria.volumenPiramide(largo, ancho, alto);
        System.out.println("El volumen de la pirámide es: " + resultado);
    }
    
}
