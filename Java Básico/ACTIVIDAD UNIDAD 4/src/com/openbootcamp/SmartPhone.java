package com.openbootcamp;

public class SmartPhone extends SmartDevice {


    // Atributos exclusivos para el SmartPhone

    private int numeroDeContactos;
    private long numeroTelefonico;


    // Constructor exclusivo para el SmartPhone

    public SmartPhone() {
        super();
        this.numeroDeContactos = 0;
        this.numeroTelefonico = 99999999;
    }

    public SmartPhone(String nombreDispositivo, int anioFabricacion, boolean tieneCargador,
                      int nivelDeBateria, int numeroDeContactos, long numeroTelefonico) {
        super(nombreDispositivo, anioFabricacion, tieneCargador, nivelDeBateria);
        this.numeroDeContactos = numeroDeContactos;
        this.numeroTelefonico = numeroTelefonico;
    }


    // Setters y Getters
    // Getters

    public int getNumeroDeContactos() {
        return numeroDeContactos;
    }

    public long getNumeroTelefonico() {
        return numeroTelefonico;
    }


    // Setters

    public void setNumeroDeContactos(int numeroDeContactos) {
        this.numeroDeContactos = numeroDeContactos;
    }

    public void setNumeroTelefonico(long numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }


    // Implementación métodos abstractos de la clase padre

    public int consumoDeBateria(int nivelDeBateria, int tiempoDeUso) {
        int consumoCelular = 3;
        int bateriaRestante = nivelDeBateria - (tiempoDeUso * consumoCelular);
        if (bateriaRestante < 0) {
            bateriaRestante = 0;
        } else if (bateriaRestante >= 100) {
            bateriaRestante = 100;
        }
        return bateriaRestante;
    }

    public void llamarAUnAmigo(int numeroDeContactos) {
        if (numeroDeContactos > 0) {
            System.out.println("Llamando a un amigo...");
        } else {
            System.out.println("Error. No tiene amigos :(");
        }
    }


}
