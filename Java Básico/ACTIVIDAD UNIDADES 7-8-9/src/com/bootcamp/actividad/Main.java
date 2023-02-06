package com.bootcamp.actividad;
import java.util.*;

import static com.bootcamp.actividad.metodos.ArrayBidimensional.recorrerArregloBidimensional;
import static com.bootcamp.actividad.metodos.ArrayUnidimensional.recorrerArregloUnidimensional;
import static com.bootcamp.actividad.metodos.DividePorCero.divisionPorCero;
import static com.bootcamp.actividad.metodos.InputStreamPrintStream.leerYEscribirArchivo;
import static com.bootcamp.actividad.metodos.ListaDeArreglos.recorrerArrayList;
import static com.bootcamp.actividad.metodos.ListaDeArreglos.rellenarArrayList;
import static com.bootcamp.actividad.metodos.InputStreamPrintStream.leerYEscribirArchivo;
import static com.bootcamp.actividad.metodos.Reverse.devolverReverso;
import static com.bootcamp.actividad.metodos.ListaLigada.recorrerLinkedList;
import static com.bootcamp.actividad.metodos.ListaLigada.rellenarListaLigada;
import static com.bootcamp.actividad.metodos.Vectores.*;

public class Main {

    public static void main(String[] args) {
        // 0.) PALABRA AL REVÉS
        String palabraAlReves = devolverReverso("Hola mundo");
        System.out.println(palabraAlReves);

        // 1.) ARRAY UNIDIMENSIONAL DE STRINGS

        String[] arregloUnidimensional = {"Hola", "Mundo", "desde", "Córdoba", "Capital", "Argentina"};
        recorrerArregloUnidimensional(arregloUnidimensional);


        // 2.) ARREGLO BIDIMENSIONAL DE ENTEROS

        int[][] arregloBidimensional = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        recorrerArregloBidimensional(arregloBidimensional);

        // 3.) VECTORES

        Scanner scanner = new Scanner(System.in);
        Vector<Integer> vectorDeEnteros = new Vector<>();
        System.out.print("Ingrese el número de elementos de su vector: ");
        int n = scanner.nextInt();

        Vector<Integer> vectorResultado = rellenarVector(vectorDeEnteros, n);

        recorrerVector(vectorResultado);

        /*
        4.) EXPLICAR EL PROBLEMA DE USAR UN VECTOR CON CAPACIDAD POR DEFECTO:
        R: Porque por defecto el incremento de capacidad es del doble, a medida de que va incrementando el
        tamaño del vector, se duplica la capacidad, si tenemos 1000 elementos y luego pasamos a 1001,
        la capacidad (y por ende la cantidad de memoria usada para almacenarlo) aumenta en un orden de 2n,
        es decir, consume muchísima memoria, mucho más que si definimos manualmente el aumento de capacidad
        que nosotros consideremos adecuado sea el caso del uso del vector.
         */

        // 5.) ARRAYLIST Y LINKEDLIST
        // ARRAYLIST
        ArrayList<String> arrayListDeNombres = new ArrayList<>();
        System.out.print("Ingrese la cantidad de nombres a ingresar: ");
        int cantidadDeNombres = scanner.nextInt();
        ArrayList<String> listaArregloAMostrar = rellenarArrayList(arrayListDeNombres, cantidadDeNombres);
        recorrerArrayList(listaArregloAMostrar);

        // LINKEDLIST
        LinkedList<String> listaLigada = new LinkedList<>();
        LinkedList<String> listaDeNombres = rellenarListaLigada(listaLigada, listaArregloAMostrar);
        recorrerLinkedList(listaDeNombres);

        // 6.) ARRAYLIST DE ENTEROS
        ArrayList<Integer> arrayListDeEnteros = new ArrayList<>();
        System.out.println("Mostrando elementos numéricos del ArrayList de enteros... :");
        for (int i = 0; i < 10; i++) {
            int numeroParaAgregar = calcularNumeroAzar(1, 10);
            arrayListDeEnteros.add(i, numeroParaAgregar);
            System.out.println("Elemento #" + (i+1) + " ; Valor: " + arrayListDeEnteros.get(i));
        }
        System.out.println("Procediendo a eliminar los números pares... mostrando impares...");
        for (int i = 0; i < arrayListDeEnteros.size(); i++) {
            if (arrayListDeEnteros.get(i) % 2 == 0) {
                arrayListDeEnteros.remove(i);
            }
            System.out.println("Elemento #" + (i+1) + " ; Valor: " + arrayListDeEnteros.get(i));
        }

        // 7.) DIVISIÓN POR CERO, TRY CATCH CON RETORNO EN MAIN.
        try {
            int dividePorCero = divisionPorCero(1, 2);
            System.out.println("El resultado de la división es: " + dividePorCero);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse.");
        } finally {
            System.out.println("Demo de código.");
        }

        // 8.) INPUTSTREAM Y PRINTSTREAM
        leerYEscribirArchivo("src/com/bootcamp/actividad/archivos/modulojavabasico.txt",
                "src/com/bootcamp/actividad/archivos/receptor.txt");

        // 9.) ESTE PROGRAMA SE HARÁ EN UN ARCHIVO APARTE.

    }


}