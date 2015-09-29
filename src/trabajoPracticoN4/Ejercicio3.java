/*
 * Este algoritmo dibuja un cohete geométrico en pantalla
 */
package trabajoPracticoN4;

/**
 *
 * @author Cristian
 * @version 6/05/2015
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        triangulo();
        cuadrado();
        cuadrado();
        cuadrado();
        cuadrado();
        rectangulo();
        parTriangulos();
        System.out.println("");
    }

    public static void triangulo() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println("/______\\");
    }

    public static void cuadrado() {
        System.out.println("   __");
        System.out.println("  |  |");
        System.out.println("  |__|");
    }

    public static void rectangulo() {
        System.out.println(" ______");
        System.out.println("|      |");
        System.out.println("|______|");
    }

    public static void parTriangulos() {
        System.out.println(" /\\  /\\");
        System.out.println("/__\\/__\\");
    }
}
