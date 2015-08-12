/*
 * Una farmacia ofrece a sus clientes una oferta: si el producto pertenece al
 * rubro perfumería se le hace un 20% de descuento. Se requiere un algoritmo que
 * lea el precio y el tipo de cada producto que compra el cliente, invoque a un
 * módulo que reciba ambos datos y retorne el precio a cobrar según si el
 * producto entra en promoción o no. El algoritmo debe sumar los precios de cada
 * producto para finalmente mostrar el precio a pagar.
 * Observación: el tipo de producto puede ser perfumería o farmaco.
 */
package TrabajoPracticoN6;

import Utiles.TecladoIn;

/**
 *
 * @author Cristian
 * @version 29/05/2015
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        double costoTotal, precio;
        char operacion, tipoProducto;
        
        costoTotal = 0.0;
        
        do {
            System.out.print("Ingrese el tipo de producto (p/f): ");
            tipoProducto = TecladoIn.readLineNonwhiteChar();
            System.out.print("Ingrese costo del producto: ");
            precio = TecladoIn.readLineDouble();
            
            costoTotal += total(tipoProducto, precio);
            
            System.out.print("Realizar otra operación (s/n)? ");
            operacion = TecladoIn.readLineNonwhiteChar();
        } while(operacion == 's');
        
        System.out.println("El total es $" + costoTotal);
    }

    public static double total(char producto, double precio) {
        double descuento;

        if (producto == 'p') {
            descuento = 20.0 / 100.0;
        } else {
            descuento = 0;
        }

        return precio - precio * descuento;
    }
}
