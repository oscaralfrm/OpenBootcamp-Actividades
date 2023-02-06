package com.bootcamp.actividad.metodos;

import java.util.*;

public class ListaDeArreglos {

    /**
     * ¿Cómo funciona generarStringAlAzar?
     * @param arregloDeNombres: Toma el arreglo de nombres (String);
     * @return Devuelve un número entero que hace referencia al índice del arreglo de nombres.
     */
    public static int generarStringAlAzar(String[] arregloDeNombres) {
        Random random = new Random();
        int nombreAlAzar = random.nextInt(arregloDeNombres.length);
        return nombreAlAzar;
    }

    public static ArrayList<String> rellenarArrayList(ArrayList<String> listaDeArreglo, int n) {
        String[] arregloDeNombres = {"Omar", "María", "Jesús", "Sabrina", "Janna", "Rodrigo"};
        for (int i = 0; i < n; i++) {
            int indice = generarStringAlAzar(arregloDeNombres);
            listaDeArreglo.add(arregloDeNombres[indice]);
        }
        return listaDeArreglo;
    }

    public static void recorrerArrayList(ArrayList<String> listaDeArreglo) {
        for (String nombre : listaDeArreglo) {
            System.out.println("Nombre en Lista de Arreglo: " + nombre);
        }
    }


}
