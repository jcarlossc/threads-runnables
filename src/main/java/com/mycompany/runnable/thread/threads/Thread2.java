package com.mycompany.runnable.thread.threads;

import java.util.ArrayList;

/**
 *
 * @author Carlos da Costa
 */
public class Thread2 extends Thread {
    
    @Override
    public void run() {

        try {
            
            ArrayList<String> simbolos = new ArrayList<>();
            simbolos.add("@");
            simbolos.add("#");
            simbolos.add("$");
            simbolos.add("%");
            simbolos.add("&");

            simbolos.stream()
            .forEach(System.out::println);

        } catch(Exception e) {

            System.out.println("Erro: " + e);
        }
    }
}
