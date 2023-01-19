import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Introducción

        System.out.println("Ejercicios Tema 3 - Introducción a la Programación - Java");

        // Primera parte - Función de 3 parámetros que se suman entre si, con retorno de valor.
        System.out.println("PRIMERA PARTE - SUMA DE 3 NÚMEROS CARGADOS DESDE EL TECLADO.");
        Aritmetica suma = new Aritmetica();
        System.out.println("Agregue 3 números enteros y súmelos para ver su resultado: ");
        Scanner sumaScanner = new Scanner(System.in);
        suma.sumarTresNumerosEnteros(sumaScanner.nextInt(), sumaScanner.nextInt(), sumaScanner.nextInt());

        // Segunda parte - Creación y manipulación de objetos de clase Coche.
        // Instanciamos el objeto coche e inicializamos el número de puertas en 0.
        System.out.println("SEGUNDA PARTE - AÑADIR PARTES DEL COCHE.");
        Coche coche = new Coche();
        coche.numeroPuertas = 0;


        // Cargamos el input del usuario usando la clase Scanner e instanciando el objeto scanner.
        Scanner cocheScanner = new Scanner(System.in);
        System.out.println("Usted tiene actualmente " + coche.numeroPuertas + " puertas. " +
                "Ingrese el número de puertas a aumentar: ");
        coche.incrementarPuertas(cocheScanner.nextInt());
        System.out.println("Gracias por usar nuestros servicios. Que pase un feliz día.");
    }
}


class Aritmetica {
    public void sumarTresNumerosEnteros(int a, int b, int c) {
        int suma = a + b + c;
        System.out.println("El resultado de su suma es: " + suma);
    }
}


class Coche {
    // Variable que almacena la cantidad de puertas.
    int numeroPuertas;

    public void incrementarPuertas(int cantidadAAumentar) {
        numeroPuertas += cantidadAAumentar;
        System.out.println("Ahora usted tiene " + numeroPuertas + " puerta(s).");
    }
}