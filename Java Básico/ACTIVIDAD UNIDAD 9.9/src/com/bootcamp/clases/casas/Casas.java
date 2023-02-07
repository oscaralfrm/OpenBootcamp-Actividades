package com.bootcamp.clases.casas;

public class Casas {

    private int puntosTotales = 0;
    public int puntosDeCasa(int puntos) {
        return puntosTotales += puntos;
    }

    public void ganaCopaCasa(int puntos) {
        if (puntos > 300) {
            System.out.println("El mago ha ganado la copa de la casa!");
        } else {
            System.out.println("El mago NO ha ganado la copa de la casa!");
        }
    }



}
