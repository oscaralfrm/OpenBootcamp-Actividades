import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contadorWhile = 0;
        int contadorDoWhile = 0;

        Scanner numeroIf = new Scanner(System.in);

        System.out.println("Ingrese un número a comparar: ");

        // Llamado de la función compararNumeros
        compararNumeros(numeroIf.nextInt());


        // Ciclo While que dará 3 vueltas, inicializado en 0, y sumará 1 vuelta hasta llegar a 3
        // Contando cada vuelta y mostrándola por pantalla.

        System.out.println("Ahora empezaremos con la prueba del ciclo While...");
        while (contadorWhile < 3) {
            System.out.println("¡Hola! Mi valor de conteo del While es el número: " + contadorWhile);
            contadorWhile++;
            if (contadorWhile == 3) {
                System.out.println("¡Ups! Ya he llegado a mi límite de vueltas dentro del ciclo. ¡Nos vemos!");
            }
        }


        // Ciclo Do While, ejecuta sólamente la primera pasada del ciclo.
        System.out.println("Empezando con la prueba del ciclo Do While...");
        do {
            contadorDoWhile++;
            System.out.println("¡Esta es la vuelta del Do While número: " + contadorDoWhile + " de mi ciclo DoWhile!");
        } while (contadorDoWhile < 1);
        if (contadorDoWhile == 1) {
            System.out.println("¡Parece que sólo ha dado una única vuelta! Como lo pedía el ejercicio.");
        }


        // Ciclo For, cuenta 4 vueltas en total.
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("¡Soy la vuelta del Ciclo For número: " + numeroFor);
        }

        Scanner estacionScanner = new Scanner(System.in);
        System.out.println("Ingrese la estación del año en el lugar en el que vive, por favor: ");
        String estacion = estacionScanner.nextLine();

        switch (estacion) {
            case "Primavera" -> System.out.println("¡Que buen clima! Usted está en Primavera.");
            case "Verano" -> System.out.println("¡Que calor que hace! Usted está en Verano.");
            case "Otoño" -> System.out.println("¡A ponerse chaquetas! Usted está en Otoño.");
            case "Invierno" -> System.out.println("¡Que frío que hace! Usted está en Invierno.");
            default -> System.out.println("Error. Usted ingresó incorrectamente una estación del año.");
        }

    }

    // Función para hacer la comparación lógica de si el número pasado por parámetro es mayor, menor o
    // igual al número 0.
    public static void compararNumeros(int numeroAComparar) {
        if (numeroAComparar > 0) {
            System.out.println("El número que usted ingresó es un número positivo.");
        } else if (numeroAComparar < 0) {
            System.out.println("El número que usted ingresó es un número negativo.");
        } else {
            System.out.println("El número que usted ingresó es el número 0 (ni positivo ni negativo).");
        }
    }
}