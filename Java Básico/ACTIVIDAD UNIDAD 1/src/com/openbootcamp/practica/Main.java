package com.openbootcamp.practica;

/**
 * @author oscaralfrm
 */

public class Main {

    // Números enteros

    /**
     * @param entero1 (byte): Representa un número entero comprendido entre -128 hasta 127.
     * @param entero2 (short): Representa un número entero comprendido entre -32768 a 32767.
     * @param entero3 (int): Representa un número entero comprendido entre -2147483,648 a 2147483647.
     * @param entero4 (long): Representa un número entero comprendido entre  -9223372036854775808 a
     *               9223372036854775807.
     */

    static byte entero1 = 1;
    static short entero2 = 2;
    static int entero3 = 3;
    static long entero4 = 4;

    // Números decimales

    /**
     * @param decimal1 (float): Representa un número decimal con precisión de 32 bits.
     * @param decimal2 (double): Representa un número decimal con precisión de 64 bits.
     */

    static float decimal1 = 1.1f;
    static double decimal2 = 1.2d;


    // Valores booleanos

    /**
     * @param verdadero (boolean): Representa un valor boolean true.
     * @param falso (boolean): Representa un valor boolean false.
     */

    static boolean verdadero = true;
    static boolean falso = false;


    // Cadenas de texto y caracteres
    static String cadenaDeCaracteres = "Hola Mundo desde Argentina";
    static char unCaracter = 'a';


    // Creando método puerta de entrada de la aplicación...
    public static void main(String[] args) {

        // Imprimiendo métodos...
        inicializarPrograma();

    }

    public static void inicializarPrograma() {
        System.out.println("================================================");
        System.out.println("Inicializando programa para mostrar tipos de variables en Java...");
        System.out.println();
        System.out.println("================================================");
        System.out.println("Datos numéricos de tipo entero: ");
        System.out.println("Byte: " + entero1 + " ; Short: " + entero2 + " ; Int: " + entero3 + " " +
                "; Long: " + entero4);
        System.out.println("================================================");
        System.out.println("Datos numéricos de tipo coma flotante: ");
        System.out.println("Float: " + decimal1 + " ; Double: " + decimal2);
        System.out.println("================================================");
        System.out.println("Datos booleanos (verdadero o falso):");
        System.out.println("Booleano vedadero: " + verdadero + " ; Booleano falso: " + falso);
        System.out.println("================================================");
        System.out.println("Cadena de caracteres y caracter individual: ");
        System.out.println("Cadena de caracteres: " + cadenaDeCaracteres + "; Caracter: " + unCaracter);
        System.out.println();
        System.out.println("================================================");
        System.out.println("Gracias por usar nuestro programa, nos vemos.");

    }
}