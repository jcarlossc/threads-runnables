package com.mycompany.runnable.thread.threads;

import java.util.ArrayList;

/**
 * 
 * @author Carlos da Costa
 */
public class Thread1 extends Thread {
    
    @Override
    public void run() {

        try {

            ArrayList<String> nomes = new ArrayList<>();
            nomes.add("Carlos");
            nomes.add("Soares");
            nomes.add("Jose");
            nomes.add("Teresa");
            nomes.add("Ewellyn");

            // System.out.println("Thread em suspensão de 50 segundos...");
            // Thread.sleep(50000);

            nomes.stream()
            .forEach(System.out::println);

        } catch(Exception e) {

            System.out.println("Erro: " + e);
        }
    }
}
