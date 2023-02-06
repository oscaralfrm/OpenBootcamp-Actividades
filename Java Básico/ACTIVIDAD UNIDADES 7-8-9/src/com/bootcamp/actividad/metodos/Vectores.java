package com.bootcamp.actividad.metodos;

import java.util.*;

public class Vectores {

    // X.) Métodos:
    public static int calcularNumeroAzar(int min, int max) {
        return (int)Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static Vector<Integer> rellenarVector(Vector<Integer> vectorARellenar, int n) {
        for (int i = 0; i < n; i++) {
            vectorARellenar.add(calcularNumeroAzar(1, 100));
        }
        return vectorARellenar;
    }

    public static void recorrerVector(Vector<Integer> vectorARecorrer) {
        for (int i = 0; i < vectorARecorrer.size(); i++) {
            System.out.println("Elemento #" + (i+1) + " : " + vectorARecorrer.get(i));
        }
    }


}
