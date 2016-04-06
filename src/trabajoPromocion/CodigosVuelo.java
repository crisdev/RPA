/*
 * El trabajo práctico consiste en especificar el pseudocódigo y el JAVA de un
 * algoritmo en el cual el usuario tendrá disponible un menú que mostrará
 * opciones para realizar distintas operaciones.
 *
 */
package trabajoPromocion;

import utiles.TecladoIn;

/**
 * Los strings a considerar por los siguientes módulos, representarán códigos de
 * vuelo, con el formato LL-NNNN, y donde LL representan el prefijo del vuelo
 * que identifica a una línea aérea, y NNNN representa el número de vuelo. Por
 * ejemplo AR-1251 representa el vuelo 1251 de Aerolíneas Argentas. Otros códigos
 * son: LF para Lufthansa, AF para Air France, AA para American Airlines, DT para
 * Delta, QT para Qatar, etc.
 * 
 * @author Gasthon Chaves - Cristian Vincenzini
 * @version 23/06/2015
 */
public class CodigosVuelo {
    /**
     * MODULO 1
     * Verifica si un código de vuelo es válido.
     * 
     * @param c código de vuelo a verificar
     * @return true si el código introducido es correcto
     */
    public static boolean validarCodigo(String c) {
        boolean result;
        result = false;

        if (c.length() == 7) {
            if (Extras.esLetra(c.charAt(0)) && Extras.esLetra(c.charAt(1))) {
                if (c.charAt(2) == '-') {
                    if (Extras.esNumero(c.charAt(3)) && Extras.esNumero(c.charAt(4)) && Extras.esNumero(c.charAt(5)) && Extras.esNumero(c.charAt(6))) {
                       result = true;
                    }
                }
            }
        }
        
        return result;
    }
    
    /**
     * MODULO 2
     * Indica al usuario porqué un código de vuelo no es válido.
     */
    public static void determinaTipoError() {
        String cod;
        
        System.out.println("Ingrese un código de vuelo: ");
        cod = TecladoIn.readLine();
        if (validarCodigo(cod)) {
            System.out.println("El código es válido.");
        }
        else {
            if(cod.length() != 7) {
                System.out.println("La longitud no es correcta.");
            }
            else {
                if ((Extras.esLetra(cod.charAt(0)) != true) || (Extras.esLetra(cod.charAt(1)) != true)) {
                    System.out.println("El prefijo de vuelo no es válido.");
                }
                else {
                    if (cod.charAt(2) != '-') {
                       System.out.println("Separación incorrecta.");
                    }
                    else {
                        if((Extras.esNumero(cod.charAt(3)) != true) || (Extras.esNumero(cod.charAt(4)) != true) || (Extras.esNumero(cod.charAt(5)) != true) || (Extras.esNumero(cod.charAt(6)) != true)) {
                            System.out.println("El número de vuelo no es válido.");
                        }
                    }
                }
            }
        }
    }
    
    /**
     * MODULO 3
     * Verifica entre dos string recibidos como parámetro (correspondientes a dos 
     * códigos de vuelo) si el primer código tiene un número mayor que el segundo código.
     * 
     * @param c representa el primer string tomado como parámetro
     * @param d representa el segundo string tomado como parámetro
     * @return 0 si el primero es mayor al segundo, 1 si el segundo es mayor o igual al primero, -1 si un código no es válido
     */
    public static int esMayor(String c, String d) {
        int resultado;
        resultado = -1;
        
        if (validarCodigo(c) && validarCodigo(d)) {
            if (Integer.parseInt(c.substring(3)) > Integer.parseInt(d.substring(3))) {
                resultado = 0;
            }
            else {
                resultado = 1;
            }
        }
        
        return resultado;
    }
    
    /**
     * MODULO 4
     * Verifica si dos códigos recibidos como parámetros son iguales
     * retornando true si son iguales, o false en caso contrario.
     * 
     * @param c representa el primer string tomado como parámetro
     * @param d representa el segundo string tomado como parámetro
     * @return 0 si son iguales, 1 si son distintos y -1 si uno o ambos códigos no son válidos
     */
    public static int sonIguales(String c, String d) {
        int resultado;
        resultado = -1;
        
        if (validarCodigo(c) && validarCodigo(d)) {
            if (c.equalsIgnoreCase(d)) {
                resultado = 0;
            }
            else {
                resultado = 1;
            }
        }
        
        return resultado;
    }
    
    /**
     * MODULO 5
     * Solicita al usuario una secuencia de códigos de vuelo y luego imprime
     * por pantalla el más grande de ellos.
     */
    public static void cualEsMayor() {
        String codMayor, continuar, cod1;
        codMayor = "LL-0000";
        
        do {
            System.out.println("Ingrese un código de vuelo: ");
            cod1 = TecladoIn.readLine();
            if (validarCodigo(cod1)) {
                if (Integer.parseInt(cod1.substring(3)) > Integer.parseInt(codMayor.substring(3))) {
                    codMayor = cod1;
                }
            }
            else {
                System.out.println("El código ingresado no es válido.");
            }
            System.out.println("¿Desea continuar (si/no)? ");
            continuar = TecladoIn.readLine();
        } while (continuar.equalsIgnoreCase("si"));
        
        System.out.println("El código de vuelo con el mayor número de vuelo es " + codMayor);
    }
    
    /**
     * MODULO 6
     * Solicita al usuario un código de búsqueda y uno o varios
     * códigos de vuelo, luego muestra por pantalla cuántos códigos de
     * búsqueda se encontraron duplicados en los códigos de vuelo.
     */
    public static void buscaDuplicados() {
        String codigoBusqueda, codigoVuelo;
        String pregunta;
        int contador;
        contador = 0;
         
        System.out.print("Ingrese código de búsqueda: ");
        codigoBusqueda = TecladoIn.readLine();
        codigoBusqueda = codigoBusqueda.toUpperCase();
         
        do {
            System.out.print("Ingrese código de vuelo: ");
            codigoVuelo = TecladoIn.readLine();
            codigoVuelo = codigoVuelo.toUpperCase();
            
            if (validarCodigo(codigoVuelo)) {
                if (codigoVuelo.indexOf(codigoBusqueda) != -1) {
                    contador++;
                    System.out.println("Se halló una ocurrencia.");
                }
                else {
                    System.out.println("No hay ocurrencia.");
                }
            }
            else {
                System.out.println("El código ingresado no es válido.");
            } 
            System.out.print("¿Desea continuar (si/no)? ");
            pregunta = TecladoIn.readLine();
        } while (pregunta.equalsIgnoreCase("si"));
   
        System.out.println("Cantidad de ocurrencias: " + contador);
    }
    
    /**
     * MODULO 7
     * Recibe un código de vuelo y luego lo incrementa en una unidad
     * imprimiéndolo por pantalla.
     * 
     * @param codigo representa el código de vuelo
     */
    public static void incrementaNroVuelo(String codigo) {
        int nroVuelo;
        String codigoModificado;
        
        if (validarCodigo(codigo)) {
            nroVuelo = Integer.parseInt(codigo.substring(3));
            nroVuelo = nroVuelo + 1;
       
            codigoModificado = codigo.substring(0,3) + nroVuelo;
            System.out.println("El código modificado es " + codigoModificado);
        }
        else {
            System.out.println("El código ingresado no es válido.");
        }
       
    }
    
    /**
     * MODULO 8
     * Dado un parámetro con una  secuencia de códigos de vuelo, este módulo 
     * muestra por pantalla aquel cuyo código numérico tiene el valor más grande.
     * 
     * @param secuencia secuencia de códigos de vuelo
     */
    public static void buscaMayorCodigo(String secuencia) {
        String mayorCodigo, codigo;
        final int LONGMINIMA;
        int i, j, longitudCadena, cantidadCodigos;
        j = 0;
        LONGMINIMA = 7;
 
        secuencia = secuencia.toUpperCase();
        longitudCadena = secuencia.length();
        
        cantidadCodigos = longitudCadena / LONGMINIMA;
        mayorCodigo = secuencia.substring(0, LONGMINIMA);
   
        for (i = 0; i < cantidadCodigos; i++) {
            codigo = secuencia.substring(0 + j, LONGMINIMA + j);
            if (Integer.parseInt(codigo.substring(3)) > Integer.parseInt(mayorCodigo.substring(3))) {
                mayorCodigo = codigo;            
            }
            j = j + LONGMINIMA;
        }
 
        System.out.println("Código más grande: " + mayorCodigo);
    }

    /**
     * MODULO 9
     * Pasa un código de búsqueda y una secuencia de códigos de vuelo como parámetros
     * luego busca si hay ocurrencias del código de vuelo en la secuencia y 
     * las imprime por pantalla.
     * 
     * @param codigoBusqueda string a buscar en la secuencia de vuelos
     * @param secuencia representa la secuencia de vuelos introducida por el usuario
     */
    public static void buscaDuplicadosSecuencia(String codigoBusqueda, String secuencia) {
        String codigoVuelo;
        final int LONGMINIMA;
        int contador, i, j, longitudCadena, cantidadCodigos;
        contador = 0;
        j = 0;
        LONGMINIMA = 7;
   
        codigoBusqueda = codigoBusqueda.toUpperCase();
        secuencia = secuencia.toUpperCase();
   
        longitudCadena = secuencia.length();
        cantidadCodigos = longitudCadena / LONGMINIMA;
        
        for (i = 0; i < cantidadCodigos; i++) {
            codigoVuelo = secuencia.substring(0+j, LONGMINIMA+j);
            if (codigoVuelo.indexOf(codigoBusqueda) != -1) {
                contador++;
            }
            j = j + LONGMINIMA;
        }

        System.out.println("Cantidad de ocurrencias: " + contador);
    }
    
    /**
     * MODULO 10
     * Solicita al usuario una opción del menú y retorna el valor ingresado.
     * 
     * @return opción seleccionada
     */
    public static int menu() {
        int opcion;
   
        do {
            System.out.println("-------------------------");
            System.out.println("MENÚ");
            System.out.println("-------------------------");
            System.out.println("1.- Verificar que el vuelo no es válido.");
            System.out.println("2.- Determinar por qué un código no es válido.");
            System.out.println("3.- Verificar si un código tiene un número mayor que otro código.");
            System.out.println("4.- Verificar si un código es igual a otro.");
            System.out.println("5.- Ingresar una secuencia de códigos de vuelo y obtener el código cuyo número sea el mayor.");
            System.out.println("6.- Ingresar una secuencia de códigos de vuelo y un código de vuelo determinado 'A', y hallar cantidad de ocurrencias de A en la secuencia.");
            System.out.println("7.- Incrementar el número de vuelo de un código en una unidad y retornarlo en un nuevo código de vuelo.");
            System.out.println("8.- Dada una secuencia de códigos de vuelo (recibido por parámetro en un String) obtener el código de vuelo con el número más grande.");
            System.out.println("9.- Dada una secuencia de códigos de vuelo (recibido por parámetro en un String) y un código de vuelo determinado 'A', hallar la cantidad de ocurrencias de 'A'.");
            System.out.println("10.- Terminar.");
            System.out.println();
         
            System.out.print("Ingrese una opción del menú: ");
            opcion = TecladoIn.readLineInt();
        } while (opcion < 1 || opcion > 10);
   
        return opcion;
    }
    
    /**
     * ALGORITMO PRINCIPAL
     * Permite al usuario ver el menú del programa en forma reiterada.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        int opcion;
        String cod1, cod2, secuencia, codigoBusqueda;
        
        opcion = menu();
        
        while (opcion != 10) {
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un código: ");
                    cod1 = TecladoIn.readLine();
                    if (validarCodigo(cod1)) {
                        System.out.println("El código es válido.");
                    }
                    else {
                        System.out.println("El código no es válido.");
                    }
                    break;
                case 2:
                    determinaTipoError();
                    break;
                case 3:
                    System.out.println("Ingrese el primer código: ");
                    cod1 = TecladoIn.readLine();
                    System.out.println("Ingrese el segundo código: ");
                    cod2 = TecladoIn.readLine();
                    if (esMayor(cod1, cod2) == 0) {
                        System.out.println("El primer código tiene un número de vuelo mayor.");
                    }
                    else {
                        if (esMayor(cod1, cod2) == 1) {
                            System.out.println("El primer código no tiene un número de vuelo mayor.");
                        }
                        else {
                            System.out.println("Uno o ambos de los códigos ingresados no son válidos.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el primer código: ");
                    cod1 = TecladoIn.readLine();
                    System.out.println("Ingrese el segundo código: ");
                    cod2 = TecladoIn.readLine();
                    if (sonIguales(cod1, cod2) == 0) {
                        System.out.println("Los códigos son iguales.");
                    }
                    else {
                        if(sonIguales(cod1, cod2) == 1) {
                            System.out.println("Los códigos son distintos.");
                        }
                        else {
                            System.out.println("Uno o ambos de los códigos ingresados no son válidos.");
                        }
                    }
                    break;
                case 5:
                    cualEsMayor();
                    break;
                case 6:
                    buscaDuplicados();
                    break;
                case 7:
                    System.out.println("Ingrese un código: ");
                    cod1 = TecladoIn.readLine();
                    incrementaNroVuelo(cod1);
                    break;
                case 8:
                    System.out.print("Ingrese secuencia de códigos de vuelo: ");
                    secuencia = TecladoIn.readLine();
                    if (Extras.verificarSecuencia(secuencia)) {
                        buscaMayorCodigo(secuencia);
                    }
                    else {
                        System.out.println("Secuencia de códigos incorrecta.");
                    }
                    break;
                case 9:
                    do {
                        System.out.print("Ingrese código de búsqueda: ");
                        codigoBusqueda = TecladoIn.readLine();
                    } while (codigoBusqueda.length() == 0);
                    
                    System.out.print("Ingrese secuencia de códigos de vuelo: ");
                    secuencia = TecladoIn.readLine();
                    if (Extras.verificarSecuencia(secuencia)) {
                        buscaDuplicadosSecuencia(codigoBusqueda, secuencia);
                    }
                    else {
                        System.out.println("Secuencia de códigos incorrecta.");
                    }
                    break;
            }
            
            opcion = menu();
        }
    }
}