package com.openbootcamp;
import java.util.Scanner;

public class Main {

    // Entrada a la aplicación
    public static void main(String[] args) {
        // Inicializamos el objeto Scanner:

        Scanner scanner = new Scanner(System.in);


        // Inicializamos los atributos de los objetos por medio de Setters y Getters:

        // Creamos un celular...
        System.out.println("Creando celular inteligente...");

        SmartPhone celular = new SmartPhone();

        // Nombre:

        System.out.print("Ingrese el nombre del dispositivo: ");
        celular.setNombreDispositivo(scanner.nextLine());
        String nombreDispositivoCelular1 = celular.getNombreDispositivo();

        // Año de Fabricación:

        System.out.print("Ingrese el año de fabricación: ");
        celular.setAnioFabricacion(scanner.nextInt());
        int anioDeFabricacion1 = celular.getAnioFabricacion();

        // ¿Tiene cargador?
        System.out.print("Ingrese si tiene o no cargador: ");
        celular.setTieneCargador(scanner.nextBoolean());
        boolean tieneCargador1 = celular.getTieneCargador();

        // Nivel de Batería
        System.out.print("Ingrese el nivel de carga de batería: ");
        celular.setNivelDeBateria(scanner.nextInt());
        int nivelDeBateria1 = celular.getNivelDeBateria();

        // Número de Contactos
        System.out.print("Ingrese la cantidad de contactos que tiene: ");
        celular.setNumeroDeContactos(scanner.nextInt());
        int numeroDeContactos = celular.getNumeroDeContactos();

        // Número Telefónico
        System.out.print("Ingrese su número telefónico: ");
        celular.setNumeroTelefonico(scanner.nextLong());
        long numeroTelefonico = celular.getNumeroTelefonico();


        System.out.println("================================");
        System.out.println("Datos del objeto celular creado: ");
        System.out.println("Nombre: " + nombreDispositivoCelular1 + " ; Año de Fabricación: " +
                "" + anioDeFabricacion1 + " ; ¿Tiene cargador?: " + tieneCargador1 + " ; Nivel de Batería " +
                "" + nivelDeBateria1 + " ; Número de Contactos: " + numeroDeContactos + " ; " +
                "Número Telefónico: " + numeroTelefonico);
        System.out.println("\n");
        System.out.println("================================");

        // Creamos un reloj inteligente...
        System.out.println("Creando reloj inteligente...");
        Scanner scanner2 = new Scanner(System.in);
        SmartWatch reloj = new SmartWatch();

        // Nombre:

        System.out.print("Ingrese el nombre del dispositivo: ");
        reloj.setNombreDispositivo(scanner2.nextLine());
        String nombreDispositivoReloj2 = reloj.getNombreDispositivo();

        // Año de Fabricación:

        System.out.print("Ingrese el año de fabricación: ");
        reloj.setAnioFabricacion(scanner2.nextInt());
        int anioDeFabricacion2 = reloj.getAnioFabricacion();

        // ¿Tiene cargador?
        System.out.print("Ingrese si tiene o no cargador: ");
        reloj.setTieneCargador(scanner2.nextBoolean());
        boolean tieneCargador2 = reloj.getTieneCargador();

        // Nivel de Batería
        System.out.print("Ingrese el nivel de carga de batería: ");
        reloj.setNivelDeBateria(scanner2.nextInt());
        int nivelDeBateria2 = reloj.getNivelDeBateria();

        // Fecuencia Cardíaca
        System.out.print("Ingrese su frecuencia cardíaca: ");
        reloj.setFrecuenciaCardiaca(scanner2.nextInt());
        int frecuenciaCardiaca = reloj.getFrecuenciaCardiaca();

        // Temperatura Corporal
        System.out.print("Ingrese su temperatura corporal: ");
        reloj.setTemperaturaCorporal(scanner2.nextDouble());
        double temperaturaCorporal = reloj.getTemperaturaCorporal();

        // Cantidad de Pasos Recorridos
        System.out.print("Ingrese la cantidad de pasos recorridos: ");
        reloj.setCantidadDePasosRecorridos(scanner2.nextInt());
        int cantidadDePasos = reloj.getCantidadDePasosRecorridos();


        System.out.println("================================");
        System.out.println("Datos del objeto reloj creado: ");
        System.out.println("Nombre: " + nombreDispositivoReloj2 + " ; Año de Fabricación: " +
                "" + anioDeFabricacion2 + " ; ¿Tiene cargador?: " + tieneCargador2 + " ; Nivel de Batería " +
                "" + nivelDeBateria2 + " ; Frecuencia Cardíaca: " + frecuenciaCardiaca + " ; " +
                "Temperatura Corporal: " + temperaturaCorporal + " ; Cantidad de Pasos: " + cantidadDePasos);


    }
}
