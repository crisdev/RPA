## Práctica RPA2015

Ejercicios prácticos realizados en la clase de *Resolución de Problemas y Algoritmos*,
primer cuatrimestre del año 2015.

Los objetivos de cada ejercicio se indican en los comentarios. La versión
indica la fecha de creación.

Se utilizó JAVA como lenguaje de implementación.

Profesor a cargo: Luis Reynoso.

## Indice

### Trabajo Práctico 3: Secuenciales

* [Ejercicio 6A](/src/trabajoPracticoN3/Ejercicio6A.java)
> Calcular y mostrar por pantalla el promedio de cinco notas
> suponiendo que los valores de las notas son 8, 9, 6, 7 y 9.

* [Ejercicio 6B](/src/trabajoPracticoN3/Ejercicio6B.java)
> Mejorar el algoritmo anterior para que permita ingresar y calcular el promedio de cinco notas cualesquiera.

* [Ejercicio 7B](/src/trabajoPracticoN3/Ejercicio7B.java)
> Este algoritmo trata de realizar un intercambio de variables,
> ¿cómo tendría que modificarse para que intercambie los valores de x e y?

* [Ejercicio 8](/src/trabajoPracticoN3/Ejercicio8.java)
> Leer un número de tres cifras y descomponerlo, mostrando las unidades, decenas y centenas.

* [Ejercicio 9](/src/trabajoPracticoN3/Ejercicio9.java)
> Bernardo seleccionó un número, lo dividió entre 7, al resultado le sumó 7 y a la suma la multiplicó por 7.
> Si así obtuvo el  número 777, ¿qué número seleccionó inicialmente?

* [Ejercicio 10](/src/trabajoPracticoN3/Ejercicio10.java)
> Implementar un algoritmo para resolver el problema 8 del TP 2. El algoritmo debe inicializar las variables en forma fija
> con los valores correspondientes y realizar los cálculos paso a paso tal como usted los realizó al resolver el ejercicio.
> Finalmente debe mostrar el resultado que responde a la pregunta: ¿Cuánto mide el lado PQ?

* [Ejercicio 11](/src/trabajoPracticoN3/Ejercicio11.java)
> ¿Se puede generalizar el algoritmo anterior para calcular el lado PQ de otra figura similar pero donde los lados
> tienen otras dimensiones? ¿Cómo lo haría? Intente diseñar dicha implementación.

* [Ejercicio 13](/src/trabajoPracticoN3/Ejercicio13.java)
> Leer un número correspondiente a una cantidad de segundos y descomponerlo mostrando las horas, minutos y segundos.

* [Ejercicio 14](/src/trabajoPracticoN3/Ejercicio14.java)
> Diseñe un algoritmo en seudocódigo para dar respuesta al problema 15 del TP2. Calcular la cantidad de pintura necesaria
> para pintar la fachada de este edificio sabiendo que se gastan 0.5 kg de pintura por m^2.

### Trabajo Práctico 4: Modularización

* [Ejercicio 3](/src/trabajoPracticoN4/Ejercicio3.java)
> Dibujando un cohete: se pide desarrollar un algoritmo que permita realizar el siguiente dibujo por pantalla.
> Modularizar convenientemente.

* [Ejercicio 5](/src/trabajoPracticoN4/Ejercicio5.java)
> Un momento del día puede expresarse como Hora:Minutos:Segundos o simplemente como la cantidad de segundos
> transcurridos desde la hora 0. Se pide desarrollar:
>
> 1. Un módulo que dada una hora expresada en formato horas, minutos y segundos, y estos valores a una cantidad
> de segundos y retorne el valor obtenido.
> 2. Un algoritmo principal que lea una hora expresada en formato hora, minutos y segundos, y luego de invocar
> al módulo definido anteriormente muestre por pantalla la cantidad de segundos resultantes.

* [Ejercicio 6](/src/utiles/Geometria.java)
> Cree una nueva clase dentro del paquete utiles para alojar allí módulos que ralicen cálculos de geometría.
> Analice los módulos desarrollados en incisos anteriores que podrían integrar esta biblioteca y desarrolle además
> los módulos para calcular los perímetros y áreas de las figuras: cudrado, rectángulo, círculo y triángulo.
> También se desea calcular el volumen de las figuras: cubo, cilindro y pirámide. Todos los cálculos se deben retornar
> para facilitar la reutilización de los módulos desarrollados.

* [Ejercicio 7](/src/trabajoPracticoN4/Ejercicio7.java)
> Implementar un programa principal (en otra clase fuera del paquete utiles) para probar cada uno de los módulos
> desarrollados en el punto 6.

* [Ejercicio 8](/src/trabajoPracticoN4/Ejercicio8.java)
> Cree una nueva clase dentro del paquete utiles para alojar allí módulos que realicen cálculos de transformación
> de unidades. Puede llamar a esta clase [Unidades](/src/utiles/Unidades.java). Implemente en dicha clase módulos para:
>
> 1. Dada una distancia expresada en km (kilómetros) transformarla a cm (centímetros).
> 2. Dada una distancia expresada en cm (centímetros) transformarla a km (kilómetros).
> 3. Dada una cantidad de líquido expresada en l (litros) transformarla a dl (decilitros).
> 4. Dada una cantidad de líquido expresada en l (litros) transformarla a cm^3 (centímetros cúbicos).
> 5. Dada una cantidad expresada en kg (kilogramos) transformarla a g (gramos).
> 6. Dada una cantidad expresada en fracción (por ejemplo medio kilogramo) transformarla en g (gramos).
> 7. Implemente un programa principal (en otra clase fuera del paquete utiles) para probar cada uno
> de los módulos desarrollados.

* [Ejercicio 9](/src/trabajoPracticoN4/Ejercicio9.java)
> Se necesita mostrar los tiempos que tardan dos aviones, uno de la empresa LAN y el otro de Aerolíneas Argentinas
> para ir de la ciudad de Neuquén a Buenos Aires. Los tiempos de despegue y arribo se leen en horas, minutos y segundos.
> Los vuelos despegan y aterrizan en el día, por lo que siempre la hora de aterrizaje es mayor a la de despegue.
> Se pide ingresar los tiempos de despegue y aterrizaje de ambas empresas y en base a eso mostrar el tiempo empleado
> por cada una. Modularizar convenientemente.

### Trabajo Práctico 5: Estructuras alternativas

* [Ejercicio 1](/src/trabajoPracticoN5/Ejercicio1.java)
> Leer un número y verificar si es impar.

* [Ejercicio 2](/src/trabajoPracticoN5/Ejercicio2.java)
> Leer un número, si es positivo mostrar su sucesor, en caso contrario mostrar el antecesor.

* [Ejercicio 3](/src/trabajoPracticoN5/Ejercicio3.java)
> Dado un número verificar si es múltiplo de 7.

* [Ejercicio 4](/src/trabajoPracticoN5/Ejercicio4.java)
> Verificar si dos números n y m dados están ordenados en forma decreciente.

* [Ejercicio 6](/src/trabajoPracticoN5/Ejercicio6.java)
> Dado el siguiente fragmento correspondiente a un algoritmo en seudocódigo implementar en lenguaje java.

* [Ejercicio 7](/src/trabajoPracticoN5/Ejercicio7.java)
> Leer dos números, n y m, e imprimir un cartel que indique cuál es el menor de ambos.

* [Ejercicio 8](/src/trabajoPracticoN5/Ejercicio8.java)
> Para acceder a una beca del comedor se debe tener un promedio de secundario mayor a 7 y menos de 25 años,
> o en su defecto vivir en una localidad que se encuentre a más de 300 km de la ciudad de Neuquén.
> Diseñe un algoritmo que permita leer los datos correspondientes a un alumno e imprima un cartel indicando
> si puede acceder o no a la beca.

* [Ejercicio 9](/src/trabajoPracticoN5/Ejercicio9.java)
> Dado un número se desea saber si es positivo, negativo o cero.

* [Ejercicio 10](/src/trabajoPracticoN5/Ejercicio10.java)
> Se desea desarrollar un sistema para un museo en el cual se pregunte al usuario el tipo de alimentación de un animal
> (come sólo carne, como sólo vegetales, come ambos) y en base a este se le debe dar un mensaje acorde a los datos ingresados.
> Por ejemplo, si come sólo carne el mensaje debe ser "Se trata de un animal carnívoro", en el caso que coma solo vegetales
> el mensaje debe ser "Se trata de un animal herbívoro", en caso contrario el mensaje sería "Se trata de un animal omnívoro".

* [Ejercicio 11](/src/trabajoPracticoN5/Ejercicio11.java)
> Diseñe e implemente un módulo que dado un número devuelva su valor absoluto. Crear una clase dentro del paquete utiles
> llamada [matemática](/src/utiles/Matematica.java) y coloque allí el módulo desarrollado. Revise y analice de los módulos
> creados hasta el momento en los prácticos 4 y 5 cuáles podrían integrar la clase matemática.

* [Ejercicio 12](/src/trabajoPracticoN5/Ejercicio12.java)
> La materia RPA se promociona si el promedio de las notas que se obtienen en los dos parciales a rendir suepra la nota 8.
> Leer el nombre y apellido de un alumno, las notas obtenidas en los parciales rendidos e indicar si el alumno promocionó
> o no la materia.

* [Ejercicio 13](/src/trabajoPracticoN5/Ejercicio13.java)
> Leer dos números correspondientes al año de nacimiento de una persona y el año actual, e indicar si la persona
> tiene más de 18 años.

* [Ejercicio 14](/src/trabajoPracticoN5/Ejercicio14.java)
> Leer un caracter e indicar a través de un cartel si se trata de una letra vocal.

* [Ejercicio 15](/src/trabajoPracticoN5/Ejercicio15.java)
> Leer tres valores correspondientes a los lados de un triángulo e indicar si se trata de un triángulo equilátero.

* [Ejercicio clase](/src/trabajoPracticoN5/EjercicioClase.java)
> Diseñar un algoritmo que dadas 3 notas de un alumno indique si promociona
> (promedio >= 8) cursa (promedio >= 6) o desaprueba (promedio < 6) la materia.

### Trabajo Práctico 6: Estructuras repetitivas

* [Ejercicio 1](/src/trabajoPracticoN6/Ejercicio1.java)
> Implementar en Java el siguiente algoritmo.

* [Ejercicio 2_1](/src/trabajoPracticoN6/Ejercicio2_1.java)
> ¿Cómo modificaría el algoritmo anterior para que realice la productoria de los 10 primeros números naturales?

* [Ejercicio 2_2](/src/trabajoPracticoN6/Ejercicio2_2.java)
> ¿Cómo podría modificarlo para realizar la productoria de los N primeros números naturales?

* [Ejercicio 2_3](/src/trabajoPracticoN6/Ejercicio2_3.java)
> ¿Cómo podría modificarlo para realizar la suma de números ingresados por teclado?

* [Ejercicio 3](/src/trabajoPracticoN6/Ejercicio3.java)
> Se requiere un algoritmo que lea una secuencia de números que representan el sueldo del personal de una empresa
> y calcule el sueldo promedio de los empleados. La cantidad de empleados se conoce previamente.

* [Ejercicio 4](/src/trabajoPracticoN6/Ejercicio4.java)
> Se requiere un algoritmo que lea una secuencia de números y por cada uno muestre por pantalla el sucesor y el predecesor.

* [Ejercicio 5](/src/trabajoPracticoN6/Ejercicio5.java)
> Se requere un algoritmo que leaa una secuencia de números naturales hasta que se ingrese el -1 y muestre por pantalla
> el cuadrado de cada uno.

* [Ejercicio 6](/src/trabajoPracticoN6/Ejercicio6.java)
> Se requiere un algoritmo para calcular la potencia de una base elevada a un exponente (sin usar Math.pow) es decir:
> potencia(base, exponente).

* [Ejercicio 7](/src/trabajoPracticoN6/Ejercicio7.java)
> Se requiere un algoritmo que lea una secuencia de números que representan temperaturas de diferentes días
> en una ciudad y calcule la temperatura promedio de esos días.

* [Ejercicio 8](/src/trabajoPracticoN6/Ejercicio8.java)
> Se requiere un algoritmo que lea una secuencia de N números e indique por cada valor si el número es positivo, cero o negativo.

* [Ejercicio 9](/src/trabajoPracticoN6/Ejercicio9.java)
> Se requiere un algoritmo que lea una secuencia de letras hasta que se lea el '-' y muestre por pantalla si se trata de una vocal
> o no a través de la invocación a un módulo que da el mensaje apropiado según la letra recibida por parámetro.

* [Ejercicio 10](/src/trabajoPracticoN6/Ejercicio10.java)
> Se requiere un algoritmo que lea una secuencia de palabras hasta que se ingrese la cadena vacía y cuente cuantas palabras
> tienen 3 letras o menos.

* [Ejercicio 11](/src/trabajoPracticoN6/Ejercicio11.java)
> Se requiere un módulo para calcular el factorial de un número X, es decir X! ¿en qué clase ubicaría este módulo para ser
> reusado fácilmente en el futuro?

* [Ejercicio 12](/src/trabajoPracticoN6/Ejercicio12.java)
> Una farmacia ofrece a sus clientes una oferta: si el producto pertenece al rubro perfumería se le hace un 20% de descuento
> Se requiere un algoritmo que lea el precio y el tipo de cada producto que compra el cliente, invoque a un módulo que reciba
> ambos datos y retorne el precio a cobrar según si el producto entra en promoción o no. El algoritmo debe sumar los precios
> de cada producto para finalmente mostrar el precio a pagar.
> Observación: el tipo de producto puede ser Perfumería o Fármaco.

* [Ejercicio 13](/src/trabajoPracticoN6/Ejercicio13.java)
> Se requiere un algoritmo que lea una secuencia de palabras hata que se ingrese el '.' y arme una oración conteniendo todas
> las palabras separadas por espacio pero en orden inverso, el algoritmo debe mostrar la oración.

* [Ejercicio 14](/src/trabajoPracticoN6/Ejercicio14.java)
> Se requiere un algoritmo que lea un número 'x' y luego una secuencia de 'N' números y cuente cuántos de ellos son múltiplos de x.
> Se sugiere diseñar un módulo  que reciba por parámetro el número x y el número leído y retorne 1 si hay que contarlo y 0 en caso contrario.

### Trabajo Práctico 6: Ejercicios adicionales

* [Ejercicio 1](/src/trabajoPracticoN6Adicionales/Ejercicio1.java)
> Leer una secuencia de palabras que se ingrese el '.' y armar una oración conteniendo todas las palabras separadas por espacio.
> Mostrar por pantalla la oración resultante.

* [Ejercicio 2](/src/trabajoPracticoN6Adicionales/Ejercicio2.java)
> Dada una cadena de caracteres y un símbolo, generar una nueva cadena donde se reemplacen todas las ocurrencias del símbolo dado
> por un '*'.

* [Ejercicio 3](/src/trabajoPracticoN6Adicionales/Ejercicio3.java)
> Leer una secuencia de palabras hasta que se ingrese el '.' y armar una oración conteniendo todas las palabras separadas
> por el espacio en pero orden inverso. MOstrar la oración resultante.

### Trabajo Final: Promoción

* [CodigosVuelo](/src/trabajoPromocion/CodigosVuelo.java)
> El trabajo práctico consiste en especificar el pseudocódigo y el JAVA de un
> algoritmo en el cual el usuario tendrá disponible un menú que mostrará
> opciones para realizar distintas operaciones.
>
> Se debe modularizar convenientemente. Uno de los integrantes entregará el seudocódigo y otro entregará el JAVA.
> Ambos (seudocódigo y JAVA) deben ser consistentes entre ellos.
>
> Los strings a considerar por los siguientes módulos, representarán códigos de
> vuelo, con el formato LL-NNNN, y donde LL representan el prefijo del vuelo
> que identifica a una línea aérea, y NNNN representa el número de vuelo. Por
> ejemplo AR-1251 representa el vuelo 1251 de Aerolíneas Argentas. Otros códigos
> son: LF para Lufthansa, AF para Air France, AA para American Airlines, DT para
> Delta, QT para Qatar, etc.
>
> Se deberá desarrollar un módulo para cada uno de los siguientes casos:
>
> 1. [Módulo 1](/src/trabajoPromocion/CodigosVuelo.java#L30): Verifica si un String recibido como parámetro representa un código de vuelo válido. Se considera válido
> si respeta la estructura de códigos mencionado anteriormente. Este módulo retorna *true* si es válido, *false* en caso contrario.
> 2. [Módulo 2](/src/trabajoPromocion/CodigosVuelo.java#L51): Dado un código de vuelo, determinar porqué un código de vuelo no es válido, el módulo deberá retornar carteles
> indicativos como 'el prefijo no es válido', 'el número contiene letras', etc.
> 3. [Módulo 3](/src/trabajoPromocion/CodigosVuelo.java#L90): Dados dos Strings (representando códigos de vuelo) recibidos como parámetros verificar si el primer código tiene
> un número mayor que el segundo código.
> 4. [Módulo 4](/src/trabajoPromocion/CodigosVuelo.java#L115): Dados dos Strings recibidos como parámetros verifica si el primer código es igual que el segundo código.
> 5. [Módulo 5](/src/trabajoPromocion/CodigosVuelo.java#L136): Solicita al usuario una secuencia de códigos de vuelo, consultando al usuario: ¿desea continuar (si/no)?
> Finalmente muestra el código de vuelo con el número más grande.
> 6. [Módulo 6](/src/trabajoPromocion/CodigosVuelo.java#L164): Solicita al usuario un código de vuelo determinado, digamos A, luego solicita una secuencia de códigos de vuelo
> consultando al usuario ¿desea continuar (si/no)? Finalmente muestra por pantalla si el código de vuelo A solicitado
> inicialmente está duplicado en la secuencia ingresada y cuántas ocurrencias se encontraron del mismo.
> 7. [Módulo 7](/src/trabajoPromocion/CodigosVuelo.java#L205): Dado un String recibido como parámetro, representando un código, permite obtener un nuevo código de vuelo,
> con el número incrementado en una unidad más y con igual prefijo.
> 8. [Módulo 8](/src/trabajoPromocion/CodigosVuelo.java#L229): Idem módulo 5, pero la secuencia de códigos de vuelo es recibido en un String que contiene un conjunto de códigos
> de vuelo. Por ejemplo 'AR-1521AF-1234AA-78123' el cual contiene tres códigos de vuelo.
> 9. [Módulo 9](/src/trabajoPromocion/CodigosVuelo.java#L262): Idem módulo 6, pero la secuencia de códigos de vuelo es recibido en un String que contiene un conjunto de códigos
> de vuelo. Por ejemplo 'AR-1521AF-1234AA-78123' el cual contiene tres códigos de vuelo.
> 10. [Módulo 10](/src/trabajoPromocion/CodigosVuelo.java#293): Muestra un menú por pantalla. Este módulo solicita al usuario una opción del menú (opción 1 al 10 del menú)
> y el módulo retorna la opción elegida por el usuario.
> 11. [Algoritmo Principal](/src/trabajoPromocion/CodigosVuelo.java#L325): El algoritmo principal permitirá que el usuario pueda ver en forma reiterada el menú del último inciso
> anterior y dependiendo de la opción seleccionada por el usuario invocará al módulo correspondiente, o finalizará la iteración.
>
> Es probable que para resolver algunos de los ejercicios requiera utilizar el método **parseInt** de la clase Integer.
> Este método permite convertir una cadena de caracteres que contiene un número, en el número entero equivalene:

```java
String cadenaNumero = "203";
int numero = Integer.parseInt(cadenaNuero);
```

* [Extras](/src/trabajoPromocion/Extras.java)
> Biblioteca de módulos adicionales para el trabajo práctico de promoción.

### Strings

* [Ejercicios](/src/texto/Ejercicio.java)
> Ejercicios utilizando la clase String.