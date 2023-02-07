package com.bootcamp.clases.manejadoresarchivos;
import com.bootcamp.clases.Mago;
import java.util.ArrayList;
import java.io.*;

public class GuardarArchivo {

    public static void guardarArchivo(String archivo, ArrayList<Mago> arrayListMagos) {

        try {
            PrintStream out = new PrintStream(archivo);
            try {
                for (Mago mago : arrayListMagos) {
                    out.write(String.valueOf(mago).getBytes());
                    out.println();
                }
                out.close();
            } catch (FileNotFoundException e) {
                System.out.println("Lo sentimos, el archivo no se encuentra: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Lo sentimos, error: " + e.getMessage());
        }

    }

}
