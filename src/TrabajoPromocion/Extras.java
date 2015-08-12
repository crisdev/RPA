/*
 * Biblioteca de módulos adicionales para el trabajo práctico de promoción.
 */
package TrabajoPromocion;

/**
 *
 * @author Gasthon Chaves - Cristian Vincenzini
 */
public class Extras {
    /**
     * Determina si el caracter recibido como parámetro es una letra.
     * 
     * @param a caracter recibido como parámetro
     * @return verdadero si el caracter es una letra
     */
    public static boolean esLetra(char a) {
        String comparar = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
        
        return (comparar.indexOf(a) != -1);
    }
    
    /**
     * Determina si el caracter recibido como parámetro es un número.
     * 
     * @param a caracter recibido como parámetro
     * @return verdadero si el caracter es un número
     */
    public static boolean esNumero(char a) {
        String comparar = "0123456789";
        
        return (comparar.indexOf(a) != -1);
    }
    
    /**
     * Verifica una secuencia de códigos de vuelos.
     * 
     * @param secuencia representa una secuencia de códigos de vuelo
     * @return verdadero si la secuencia es válida
     */
    public static boolean verificarSecuencia(String secuencia) {
        boolean resultado;
        String codigo;
        int longitud, cantidadCodigos, i, j;
        final int LONGMINIMA;
        LONGMINIMA = 7;
        j = 0;
        resultado = true;
        
        longitud = secuencia.length();
        cantidadCodigos = longitud / LONGMINIMA;
        
        if (longitud % LONGMINIMA == 0) {
            codigo = secuencia.substring(0, LONGMINIMA);
            for (i = 0; i < cantidadCodigos && resultado; i++) {
                if (CodigosVuelo.validarCodigo(codigo)) {
                    codigo = secuencia.substring(0+j, LONGMINIMA+j);
                    j = j + LONGMINIMA;
                }
                else {
                    resultado = false;
                }
            }
        }
        else {
            resultado = false;
        }
        
        return resultado;
    }
}
