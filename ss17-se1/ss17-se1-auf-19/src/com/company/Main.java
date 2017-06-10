package com.company;

import java.awt.event.KeyAdapter;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Speise pizza = new Speise();
        Käse käse =new Käse();
        Salat salat =new Salat();
        Salat salat2= new Salat();
        Tomaten tomaten=new Tomaten();

        salat.add(käse);
        salat2.add(tomaten);
        salat.add(salat2);
        pizza.add(salat);
        pizza.add(tomaten);

        System.out.println(pizza.berechneKalorien());
    }
}
