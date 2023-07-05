package com.mycompany.runnable.thread.runnables;

import java.util.ArrayList;

/**
 *
 * @author Carlos da Costa
 */
public class Runnable1 implements Runnable {
    
    @Override
    public void run() {

        try {

            ArrayList<Integer> numeros = new ArrayList<>();
            numeros.add(44);
            numeros.add(77);
            numeros.add(10);
            numeros.add(43);
            numeros.add(45);

            numeros.stream()
            .forEach(System.out::println);

        } catch (Exception e) {

            System.out.println("Erro: " + e);
        }
    }
}
