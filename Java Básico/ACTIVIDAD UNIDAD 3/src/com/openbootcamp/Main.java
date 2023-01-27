package com.openbootcamp;

public class Main {
    public static void main(String[] args) {
        String[] arregloDePalabras = {"Hola", "Mundo", "desde", "Córdoba", "Argentina!"};
        String palabraCompleta = recorrerArregloDeTexto(arregloDePalabras);

        System.out.println("===========================================================");
        System.out.println("Inicializando recorrido de arreglo de cadenas de texto...");
        System.out.println("Su oración concatenada es: " + palabraCompleta);
        System.out.println("Fin del programa. Gracias por usarnos...");
        System.out.println("===========================================================");
    }

    public static String recorrerArregloDeTexto(String[] arregloDeTexto) {
        String res = "";
        for(String palabra: arregloDeTexto) {
            res += (palabra + " ");
        }
        return res;
    }

}