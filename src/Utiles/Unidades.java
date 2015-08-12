package Utiles;

/**
 *
 * @author Cristian
 * @version 6/05/2015
 */
public class Unidades {

    public static double kmAcm(double kilometros) {
        double centimetros;
        centimetros = kilometros * 1e5;
        return centimetros;
    }

    public static double cmAkm(double centimetros) {
        double kilometros;
        kilometros = centimetros * 1e-5;
        return kilometros;
    }

    public static double lAdl(double litros) {
        double decilitros;
        decilitros = litros * 1e1;
        return decilitros;
    }

    public static double lAcm3(double litros) {
        double cm3;
        cm3 = litros * 1e3;
        return cm3;
    }

    public static double kgAgm(double kilogramos) {
        double gramos;
        gramos = kilogramos * 1e3;
        return gramos;
    }
    
    /**
     * Convierte grado sexagesimal a radianes.
     * 
     * @param radian ángulo en radianes
     * @return ángulo en radianes
     * @since 17/05/2015
     */
    public static double sexagesimalAradian(double radian) {
        return (Math.PI * radian) / 180.0;
    }
}
