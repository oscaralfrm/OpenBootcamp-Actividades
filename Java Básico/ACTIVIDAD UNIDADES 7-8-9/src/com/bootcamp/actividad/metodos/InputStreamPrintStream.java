package com.bootcamp.actividad.metodos;

import java.io.*;


public class InputStreamPrintStream {

    /**
     *
     * @param fileIn: Es el archivo de origen que se pretende copiar en el ejercicio.
     * @param fileOut: Es el archivo de destino, o receptor.
     */
    public static void leerYEscribirArchivo(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            PrintStream out = new PrintStream(fileOut);
            try {
                byte[] datos = in.readAllBytes();

                String palabra = "";

                for(byte dato : datos) {
                    palabra += (char)dato;
                }
                System.out.println(palabra);

                out.write(datos);
            } catch (IOException e) {
                System.out.println(("Lo sentimos. Error: " + e.getMessage()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lo sentimos. El archivo no se encuentra, error: " + e.getMessage());
        }
    }

}
