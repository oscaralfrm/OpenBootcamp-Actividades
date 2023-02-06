package com.bootcamp.actividad.metodos;

public class ArrayBidimensional {
    public static void recorrerArregloBidimensional(int[][] arregloBidimensional) {
        for (int i = 0; i < arregloBidimensional.length; i++) {
            for (int j = 0; j < arregloBidimensional[i].length; j++) {
                System.out.println("Fila: " + i + " ; Columna: " + j + " ; Valor: " +
                        "" + arregloBidimensional[i][j] + "");
            }
        }
    }
}
