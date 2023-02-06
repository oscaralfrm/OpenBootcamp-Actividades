package com.bootcamp.actividad.metodos;
import java.util.*;

public class ListaLigada {
    public static void recorrerLinkedList(LinkedList<String> listaLigada) {
        for (int i = 0; i < listaLigada.size(); i++) {
            System.out.println("Nombre con Lista Ligada: " + listaLigada.get(i));
        }
    }

    public static LinkedList<String> rellenarListaLigada(LinkedList<String> listaEnlazada
            , ArrayList<String> listaDeArreglo) {
        for (String nombre : listaDeArreglo) {
            listaEnlazada.add(nombre);
        }
        return listaEnlazada;
    }

}
