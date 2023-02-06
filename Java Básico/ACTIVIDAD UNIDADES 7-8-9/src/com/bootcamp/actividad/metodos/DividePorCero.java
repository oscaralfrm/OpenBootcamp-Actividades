package com.bootcamp.actividad.metodos;

public class DividePorCero {

    public static int divisionPorCero (int numero1, int numero2) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = numero1 / numero2;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado;
    }
}
