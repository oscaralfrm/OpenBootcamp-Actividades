package com.bootcamp;

import com.bootcamp.clases.Mago;

import static com.bootcamp.clases.diccionarios.Profesores.*;
import static com.bootcamp.clases.manejadoresarchivos.GuardarArchivo.guardarArchivo;
import static com.bootcamp.clases.manejadoresarchivos.LeerArchivo.leerArchivo;
import static com.bootcamp.metodos.FuncionesPrincipales.*;

import java.util.*;


/*
                Sorpréndenos creando un programa de tu elección que utilice InputStream,
                PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */

public class Main {

    // Ya de por sí main es la función 'principal' así que se definirá acá.
    public static void main(String[] args) {
        ArrayList<Mago> arregloDeMagos = new ArrayList<>();
        HashMap<String, String> profesoresDeHogwarts = new HashMap<>();
        boolean banderaMagos = false;
        boolean banderaCargoArchivo = false;
        int opcion = -1;
        while (opcion != 0) {
            opciones();
            opcion = validarRangoNumerico(0, 4);


            // Uso de ArrayList<>
            if (opcion == 1) {
                int numeroDeMagos = validarNumero(0, "Ingrese la cantidad de magos a crear: ");
                ArrayList<Mago> listaDeMagos = generarMagos(numeroDeMagos, arregloDeMagos);
                recorrerListaDeMagos(listaDeMagos);
                // Guardamos copia en memoria de la lista de arreglo... para ser usado en la escritura de
                // archivos del punto 3...
                arregloDeMagos = listaDeMagos;
                banderaMagos = true;
            }

            // Uso de HashMap<>
            else if (opcion == 2) {
                int numeroProfesores = validarNumero(0, "Ingrese la cantidad de " +
                        "profesores a crear: ");
                HashMap<String, String> listadoProfesoresHogwarts = generarProfesores(numeroProfesores,
                        profesoresDeHogwarts);
                leerProfesores(listadoProfesoresHogwarts);
            }

            // Uso de PrintStream
            else if (opcion == 3 && banderaMagos) {
                guardarArchivo("src/com/bootcamp/archivos/fileOut.txt", arregloDeMagos);
                System.out.println("Se han grabado exitosamente " + arregloDeMagos.size() + " mago(s).");
                banderaCargoArchivo = true;
            }

            else if (opcion == 4 && banderaMagos && banderaCargoArchivo) {
                leerArchivo("src/com/bootcamp/archivos/fileOut.txt");
            }

            else if ((!banderaMagos && opcion == 3) || (!banderaMagos && opcion == 4)) {
                System.out.println("Lo sentimos, no puede utilizar los puntos 3 y 4 hasta que no haya  " +
                        "utilizado el punto 1 respectivamente. Flipendo!");
            }

            else if (!banderaCargoArchivo && opcion == 4) {
                System.out.println("Lo sentimos, tiene que usar el punto 3 antes de usar el punto 4.");
            }

            else {
                System.out.println("¡COLLOPORTUS! El códice mágico ha sido cerrado.");
                System.out.println("Vuelva pronto...");
            }
        }
    }
}