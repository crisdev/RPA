package Utiles;

/**
 *
 * @author Cristian
 * @version 6/05/2015
 */
public class Geometria {

    /**
     * Calcula el perímetro (suma de lados) de un cuadrado a partir de su lado.
     *
     * @param lado lado del cuadrado
     * @return perímetro del cuadrado
     */
    public static double perimetroCuadrado(double lado) {
        return 4 * lado;
    }

    /**
     * Calcula el área (superficie) de un cuadrado a partir de uno de sus lados.
     * 
     * @param lado lado del cuadrado
     * @return área del cuadrado
     */
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    /**
     * Calcula el perímetro de una circunferencia.
     * 
     * @param radio radio de la circunferencia
     * @return perímetro de la circunferencia
     */
    public static double perimetroCircunferencia(double radio) {
        return 2 * Math.PI * radio * radio;
    }

    /**
     * Calcula el área de un círculo a partir de su radio.
     *
     * @param radio radio del círculo
     * @return área del círculo
     */
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    /**
     * Calcula el perímetro de un rectángulo.
     * 
     * @param base base del rectángulo
     * @param altura altura del rectángulo
     * @return perímetro del rectángulo
     */
    public static double perimetroRectangulo(double base, double altura) {
        return 2 * base + 2 * altura;
    }

    /**
     * Calcula el área (superficie) de un rectángulo.
     * 
     * @param base base del rectángulo
     * @param altura altura del rectángulo
     * @return área del rectángulo
     */
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    /**
     * Calcula el perímetro de un triángulo.
     * 
     * @param lado1 uno de los lados del triángulo
     * @param lado2 otro lado del triángulo
     * @param lado3 último lado del triángulo
     * @return perímetro del triángulo
     */
    public static double perimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    /**
     * Calcula el área (superficie) de un triángulo.
     * 
     * @param base base del triángulo
     * @param altura altura del triángulo
     * @return área del triángulo
     */
    public static double areaTriangulo(double base, double altura) {
        return base * altura / 2;
    }

    /**
     * Calcula el volumen de un cubo.
     * 
     * @param lado lado del cubo
     * @return volumen del cubo
     */
    public static double volumenCubo(double lado) {
        return lado * lado * lado;
    }

    /**
     * Calcula el volumen de un cilindro.
     * 
     * @param radio radio del cilindro
     * @param largo longitud del cilindro
     * @return volumen del cilindro
     */
    public static double volumenCilindro(double radio, double largo) {
        return largo * radio * Math.PI * 2;
    }

    /**
     * Calcula el volumen de una pirámide.
     * 
     * @param largo largo del rectángulo de la base de la pirámide
     * @param ancho ancho del rectángulo de la base de la pirámide
     * @param altura altura de la pirámide
     * @return volumen de la pirámide
     */
    public static double volumenPiramide(double largo, double ancho, double altura) {
        return areaRectangulo(largo, ancho) * altura / 3;
    }
    
    /**
     * A partir de los lados de un triángulo determina si éste es equilátero.
     * 
     * @param lado1 primer lado del triángulo
     * @param lado2 segundo lado del triángulo
     * @param lado3 tercer lado del triángulo
     * @return verdadero si el triángulo es equilátero
     */
    public static boolean esTrianguloEquilatero(double lado1, double lado2, double lado3) {
        final double delta = 1e-6;
        
        boolean resultado;
        
        resultado = Math.abs((lado1-lado2)) < delta && Math.abs((lado1-lado3)) < delta && Math.abs((lado2-lado3)) < delta;
        
        return resultado;
    }
}
