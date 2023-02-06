package com.bootcamp.actividad.metodos;

public class Reverse {
    // 0.) PALABRA AL REVÉS
    /* Utilizar en el programa principal:
    String palabraAlReves = devolverReverso("Hola mundo");
    */

    public static String devolverReverso(String cadenaDeTexto) {
        String palabraDadaVuelta = "";
        for (int i = cadenaDeTexto.length() - 1; i >= 0; i--) {
            palabraDadaVuelta += cadenaDeTexto.charAt(i);
        }
        return palabraDadaVuelta;
    }
}
