package com.bootcamp.metodos;

import com.bootcamp.clases.Mago;

import java.util.*;

public class FuncionesPrincipales {

    public static void opciones() {
        System.out.println("============================================================================");
        System.out.println("ALOHOMORA! Usted ha abierto el códice de alumnos de Hogwarts. ");
        System.out.println("Bienvenido al Colegio Hogwarts, de Magia y Hechicería");
        // Generar constructor de "Mago" y crear estudiantes.
        System.out.println("1.- SOMBRERO SELECCIONADOR: UD. SERÁ ELEGIDO PARA UNA CASA DE HOGWARTS.");
        // #2 Utilizar HashMap para crear diccionarios con los datos de los estudiantes usando constructor Mago
        System.out.println("2.- CLASES MÁGICAS - GENERAR DICCIONARIO DE CLASES.");
        // #3 Utilizar PrintStream para grabar en un archivo de extensión .txt a los magos del punto 2.
        System.out.println("3.- GUARDAR EN ARCHIVO MÁGICO A LOS MAGOS Y BRUJAS DEL PUNTO 1.");
        // #4 Utilizar InputStream para leer el archivo generado del punto anterior.
        System.out.println("4.- LEER LOS ARCHIVOS MÁGICOS Y CONOCER LOS DATOS DE NUESTROS ESTUDIANTES.");
        // #0 Salir del programa.
        System.out.println("0.- SALIR DEL SISTEMA DE REGISTROS DE ALUMNOS MÁGICOS.");
        System.out.println("Juro solemnemente que mis intenciones no son buenas... - George Weasley");
        System.out.println("============================================================================");
    }

    // Validador de rango numérico para las opciones.
    public static int validarRangoNumerico(int li, int ls) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre " + li + " y entre " + ls + ": ");
        int n = scanner.nextInt();

        while (n < li || n > ls) {
            System.out.print("Error. Ingrese un número dentro del rango válido: ");
            n = scanner.nextInt();

            if (n < li || n > ls) {
                System.out.println("Error. Deje de ingresar un número no válido. Ingrese bien.");
            }
        }
        return n;
    }

    public static int validarNumero(int lim, String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int n = scanner.nextInt();

        while (n <= lim) {
            System.out.print("Error. " + mensaje);
            n = scanner.nextInt();

            if (n <= lim) {
                System.out.println("Error. Deje de ingresar un número no válido. Ingrese bien.");
            }
        }
        return n;
    }

    // Considerar que si construimos los magos acá, hay que usar setters.
    // Arreglo de nombres de magos:
    static String[] nombresDeMagos = {"Harry", "Hermione", "Ron", "Lord", "Cho", "Albus", "Draco", "Cedric", "Luna"};

    // Arreglo de apellidos de magos:
    static String[] apellidosDeMagos = {"Potter", "Weasley", "Granger", "Malfoy", "Voldemort", "Dumbledore", "Lovegood"};

    // Arreglo de varitas de magos:
    static String[] varitasDeMagos = {"Corazón de Dragón", "Pluma de Fénix", "Cola de Unicornio", "Serpiente Cornuda"};

    // Arreglo de apellidos de magos:
    static String[] patronusMagos = {"Ratón", "Cisne", "Cabra", "Fénix", "Zorro", "Lobo", "Tigre", "Ciervo"};


    // Generar elementos que provengan de un arreglo de String[] al azar.
    public static String generarAlAzar(String[] arreglo) {
        Random random = new Random();
        int indice = random.nextInt(arreglo.length);
        return arreglo[indice];
    }

    public static int generarNumero() {
        int li = 1;
        int ls = 7;
        return (int)Math.floor(Math.random() * (ls - li + 1) + li);
    }

    public static ArrayList<Mago> generarMagos(int numeroDeMagos, ArrayList<Mago> arregloACargar) {
        for (int i = 0; i < numeroDeMagos; i++) {
            String nombre = generarAlAzar(nombresDeMagos);
            String apellido = generarAlAzar(apellidosDeMagos);
            String varita = generarAlAzar(varitasDeMagos);
            String patronus = generarAlAzar(patronusMagos);
            int anioCursada = generarNumero();
            arregloACargar.add(new Mago(nombre, apellido, varita, patronus, anioCursada));
        }
        return arregloACargar;
    }

    public static void recorrerListaDeMagos(ArrayList<Mago> lista) {
        for (Mago mago : lista) {
            System.out.println(mago);
            mago.decirCasa(mago.getCasa());
        }
    }

}
