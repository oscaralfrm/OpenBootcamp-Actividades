package com.openbootcamp;

public class SmartWatch extends SmartDevice {

    // Atributos exclusivos para el SmartWatch
    private int frecuenciaCardiaca;
    private double temperaturaCorporal;
    private int cantidadDePasosRecorridos;

    // Constructor exclusivo para el SmartWatch

    // Constructor sin Parámetros:

    public SmartWatch() {
        super();
        this.frecuenciaCardiaca = 60;
        this.temperaturaCorporal = 36.5;
        this.cantidadDePasosRecorridos = 0;
    }

    // Constructor con Parámetros:
    public SmartWatch(String nombreDispositivo, int anioFabricacion, boolean tieneCargador,
                      int nivelDeBateria, int frecuenciaCardiaca,
                      double temperaturaCorporal, int cantidadDePasosRecorridos) {
        super(nombreDispositivo, anioFabricacion, tieneCargador, nivelDeBateria);
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.temperaturaCorporal = temperaturaCorporal;
        this.cantidadDePasosRecorridos = cantidadDePasosRecorridos;
        if (nivelDeBateria >= 0 && nivelDeBateria <= 100) {
            nivelDeBateria = 0;
        } else {
            System.out.println("Error. No puede asignar un nivel de batería fuera del rango...");
            System.out.println("Inicializando nivel de batería en el mínimo (0).");
            nivelDeBateria = 0;
        }
    }


    // Implementación métodos abstractos de la clase padre
    public int consumoDeBateria(int nivelDeBateria, int tiempoDeUso) {
        int consumoCelular = 2;
        int bateriaRestante = nivelDeBateria - (tiempoDeUso * consumoCelular);
        if (bateriaRestante < 0) {
            bateriaRestante = 0;
        } else if (bateriaRestante >= 100) {
            bateriaRestante = 100;
        }
        return bateriaRestante;
    }

    public void salirCaminando(int numeroDePasosRecorridos) {
        int numeroDePasosTotales = this.cantidadDePasosRecorridos += numeroDePasosRecorridos;
        System.out.println("Usted ha recorrido un total de: " + numeroDePasosTotales + " pasos.");
    }

    // Setters y Getters
    // Setters

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public void setCantidadDePasosRecorridos(int cantidadDePasosRecorridos) {
        this.cantidadDePasosRecorridos = cantidadDePasosRecorridos;
    }

    // Getters

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public int getCantidadDePasosRecorridos() {
        return cantidadDePasosRecorridos;
    }

}
