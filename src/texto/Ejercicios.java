/*
 * Métodos de la clase String.
 */
package texto;

/**
 *
 * @author Cristian
 * @version 5/06/2015
 */
public class Ejercicios {
    public static void main(String[] args) {
        String saludo;
        int longitud;
        
        saludo = "Hola mundo";
        longitud = saludo.length();  // En pseudocódigo: longitud(saludo)
        
        System.out.println(longitud);
        
        if (saludo.equals("hola"))  // En pseudocódigo: igual(saludo, "hola")
            longitud++;
        
        if(saludo.equalsIgnoreCase("hola mundo"))  // En pseudocódigo: igualIgnoreMayuscula(saludo, "hola mundo")
            longitud--;
        
        String s2 = saludo.toLowerCase();  // En pseudocódigo: aMinuscula(saludo)
        String s3 = saludo.toUpperCase();  // En pseudocódigo: aMayuscula(saludo)
        
        String s4 = "   Hola mundo  ";  // En pseudocódigo: removerEspacios(s4)
        System.out.println(s4.trim());
    }
}
