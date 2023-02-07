package com.bootcamp.clases.diccionarios;

import java.util.*;

import static com.bootcamp.metodos.FuncionesPrincipales.generarAlAzar;

public class Profesores {

    // Arreglo de nombres de magos:
    static String[] nombresDeProfesores = {"Argus Filch", "Filius Flitwick", "Gilderoy Lockhart",
            "Poppy Pomfrey", "Quirinus Quirrel", "Horace Slughorn", "Pomona Sprout", "Sybill Trelawney",
            "Arif Sikander", "Aurora Sinistra", "Severus Snape", "Remus Lupin"};

    // Arreglo de apellidos de magos:
    static String[] materiasQueDicta = {"Herbología", "Pociones", "Defensa Contra las Artes Oscuras",
            "Encantamientos", "Vuelo", "Cuidado de Animales Mágicos", "Adivinación", "Astronomía", "Historia"};


    public static HashMap<String, String> generarProfesores(int numeroProfesores,
                                                            HashMap<String, String> profesores) {
        for (int i = 0; i < numeroProfesores; i++) {
            String key = generarAlAzar(nombresDeProfesores);
            String value = generarAlAzar(materiasQueDicta);
            profesores.put(key, value);
        }
        return profesores;
    }

    public static void leerProfesores(HashMap<String, String> profesores) {
        for (Map.Entry elemento : profesores.entrySet()) {
            String nombre = (String) elemento.getKey();
            String materia = (String) elemento.getValue();
            System.out.println("Nombre: " + nombre + " ; Materia: " + materia);
        }
    }

}
