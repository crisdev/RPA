package TrabajoPracticoN4;

import Utiles.TecladoIn;
import Utiles.Unidades;

/**
 *
 * @author Cristian
 * @version 6/05/2015
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        double cantidad, resultado;
        
        System.out.print("Ingrese una cantidad en kilómetros: ");
        cantidad = TecladoIn.readLineDouble();
        resultado = Unidades.kmAcm(cantidad);
        System.out.println("Son " + resultado + " centímetros.");
        
        System.out.print("Ingrese una cantidad en centímetros: ");
        cantidad = TecladoIn.readLineDouble();
        resultado = Unidades.cmAkm(cantidad);
        System.out.println("Son " + resultado + " kilómetros.");
        
        System.out.print("Ingrese una cantidad en litros: ");
        cantidad = TecladoIn.readLineDouble();
        resultado = Unidades.lAdl(cantidad);
        System.out.println("Son " + resultado + " decilitros.");
        resultado = Unidades.lAcm3(cantidad);
        System.out.println("Son " + resultado + " centímetros cúbicos.");
        
        System.out.print("Ingrese una cantidad en kilogramos: ");
        cantidad = TecladoIn.readLineDouble();
        resultado = Unidades.kgAgm(cantidad);
        System.out.println("Son " + resultado + " gramos.");
        
    }
    
}
