package com.bootcamp.clases;

import com.bootcamp.interfaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save(CocheCRUD coche) {
        System.out.println("Hola, soy el método para guardar coches.");
    }

    @Override
    public void findAll(CocheCRUD coche) {
        System.out.println("Hola, soy el método para devolver una lista de coches...");
    }

    @Override
    public void delete(CocheCRUD coche) {
        System.out.println("Hola, soy el método para borrar coches.");
    }
}
