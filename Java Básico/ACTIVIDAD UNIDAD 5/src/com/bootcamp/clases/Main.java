package com.bootcamp.clases;
import com.bootcamp.interfaces.CocheCRUD;
public class Main {
    public static void main(String[] args) {
        CocheCRUD coches = new CocheCRUDImpl();

        coches.save(coches);
        coches.findAll(coches);
        coches.delete(coches);
    }
}