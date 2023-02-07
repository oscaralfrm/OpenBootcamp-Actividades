package com.bootcamp.clases;

import com.bootcamp.clases.casas.*;

import java.util.*;

public class Mago implements CasasInterface {

    private String nombre;
    private String apellido;
    private Casas casa;
    private String varita;
    private String patronus;

    private int anioCursada;


    // Método para decir de que casa es cada mago:
    public void decirCasa(Casas casa) {
        if (casa == Gryffindor) {
            System.out.println("Flipendo! ¡Soy de la Casa de Gryffindor! *Roarrr*");
        } else if (casa == Hufflepuff) {
            System.out.println("Huff Puff! ¡Soy de la Casa de Hufflepuff! *Growls*");
        } else if (casa == Ravenclaw) {
            System.out.println("Jinkies! ¡Soy de la Casa de Ravenclaw! *Chirp chirp*");
        } else {
            System.out.println("¡Muajaja! ¡Soy de la Casa Slytherin! *Hiss*");
        }
    }

    // Generando arreglo de casas...
    Casas Gryffindor = new Gryffindor();
    Casas Hufflepuff = new Hufflepuff();
    Casas Ravenclaw = new Ravenclaw();
    Casas Slytherin = new Slytherin();
    public Casas[] arregloDeCasas = { Gryffindor, Hufflepuff,  Ravenclaw, Slytherin };

    Random random = new Random();

    // Generar Casa para un mago de forma aleatoria.
    public Casas sombreroSeleccionador(Casas[] arrayCasas) {
        int indice = random.nextInt(arrayCasas.length);
        return arrayCasas[indice];
    }


    // Constructor con parámetros
    public Mago(String nombre, String apellido, String varita, String patronus, int anioCursada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.varita = varita;
        this.patronus = patronus;
        this.anioCursada = anioCursada;
        this.casa = sombreroSeleccionador(arregloDeCasas);
    }

    // Constructor sin parámetros
    public Mago() {
        nombre = "";
        apellido = "";
        varita = "";
        patronus = "";
        anioCursada = 0;
        casa = null;
    }

    // Setters y Getters
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Casas getCasa() {
        return casa;
    }

    public String getVarita() {
        return varita;
    }

    public String getPatronus() {
        return patronus;
    }

    public int getAnioCursada() { return anioCursada; }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCasa(Casas casa) {
        this.casa = casa;
    }

    public void setVarita(String varita) {
        this.varita = varita;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public void setAnioCursada(int anioCursada) { this.anioCursada = anioCursada; }

    // to String


    @Override
    public String toString() {
        return "Mago{" +
                "Nombre: '" + nombre + '\'' +
                ", Apellido: '" + apellido + '\'' +
                ", Casa: " + casa +
                ", Varita: '" + varita + '\'' +
                ", Patronus: '" + patronus + '\'' +
                ", Año de Cursada: " + anioCursada +
                '}';
    }
}
