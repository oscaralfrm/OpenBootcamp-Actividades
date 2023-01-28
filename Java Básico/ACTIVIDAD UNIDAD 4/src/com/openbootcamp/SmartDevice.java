package com.openbootcamp;

public abstract class SmartDevice {

    // Attributes

    private String nombreDispositivo;
    private int anioFabricacion;
    private boolean tieneCargador;
    private int nivelDeBateria;

    // Método constructor de la Clase Padre
    // Constructor sin Parámetros:

    public SmartDevice() {
        this.nombreDispositivo = "";
        this.anioFabricacion = 0;
        this.tieneCargador = false;
        this.nivelDeBateria = 0;
    }

    // Constructor con Parámetros:
    public SmartDevice(String nombreDispositivo, int anioFabricacion, boolean tieneCargador,
                       int nivelDeBateria) {
        this.nombreDispositivo = nombreDispositivo;
        this.anioFabricacion = anioFabricacion;
        this.tieneCargador = tieneCargador;
        if (nivelDeBateria >= 0 && nivelDeBateria <= 100) {
            this.nivelDeBateria = 0;
        } else {
            System.out.println("Error. No puede asignar un nivel de batería fuera del rango...");
            System.out.println("Inicializando nivel de batería en el mínimo (0).");
            this.nivelDeBateria = 0;
        }
    }



    // Getters y Setters
    // Setters

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setTieneCargador(boolean tieneCargador) {
        this.tieneCargador = tieneCargador;
    }

    public void setNivelDeBateria(int nivelDeBateria) {
        this.nivelDeBateria = nivelDeBateria;
    }

    // Getters

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public int getAnioFabricacion() {
        return this.anioFabricacion;
    }

    public boolean getTieneCargador() {
        return this.tieneCargador;
    }

    public int getNivelDeBateria() {
        return this.nivelDeBateria;
    }


    // Método abstracto común

    public abstract int consumoDeBateria(int nivelDeBateria, int tiempoDeUso);

}
