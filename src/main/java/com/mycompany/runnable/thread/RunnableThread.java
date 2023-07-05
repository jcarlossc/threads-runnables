package com.mycompany.runnable.thread;

import com.mycompany.runnable.thread.runnables.Runnable1;
import com.mycompany.runnable.thread.threads.Thread1;
import com.mycompany.runnable.thread.threads.Thread2;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Carlos da Costa
 */
public class RunnableThread {

    public static void main(String[] args) {
        
        // Thread que itera um ArrayList de nomes próprios
        Thread1 t1 = new Thread1();
        t1.start();
        
        // Thread que itera um ArrayList de símbolos(String)
        Thread2 t2 = new Thread2();
        t2.start();
        
        // Thread que itera um ArrayList de números inteiros
        Runnable1 t3 = new Runnable1();
        t3.run();
        
        // Outra forma de iniciar uma Thread
        new Thread( () -> {
            try {
                System.out.println("Espere 5 segundos...");
                Thread.sleep(5000);
                List<Integer> num = Arrays.asList(3,4,5,6,7,8,9);
                num.stream()
                .forEach(System.out::println);
                System.out.println("Thread finalizada.");
            } catch(Exception e) {
                System.out.println("Erro: " + e);
            }
        }).start();
    }
}
