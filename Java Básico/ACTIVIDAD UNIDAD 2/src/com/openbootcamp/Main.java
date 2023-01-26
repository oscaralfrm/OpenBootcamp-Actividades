package com.openbootcamp;

import java.util.Scanner;
public class Main {

    private double precio;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.println("El precio original es de: " + precio + " pesos.");

        System.out.println("Calculando nuevo precio + IVA: ");
        double precioMasIVA = devolverConIva(precio);
        System.out.println("El nuevo precio más el IVA es de: " + precioMasIVA + " pesos.");
    }

    public static double devolverConIva(double precio) {
        double IVA = (precio * 0.50);
        return precio + IVA;
    }
}