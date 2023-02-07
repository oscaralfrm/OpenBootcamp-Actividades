package com.bootcamp.clases.manejadoresarchivos;

import java.io.*;

public class LeerArchivo {
    public static void leerArchivo(String archivo) {
        try {
            InputStream in = new FileInputStream(archivo);
            try {
                byte[] datos = in.readAllBytes();
                String palabra = "";
                for (byte dato : datos) {
                    palabra += (char)dato;
                }
                System.out.println(palabra);
            } catch (FileNotFoundException e) {
                System.out.println("No se encuentra el archivo. Error: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Lo sentimos. Error: " + e.getMessage());
        }
    }
}
