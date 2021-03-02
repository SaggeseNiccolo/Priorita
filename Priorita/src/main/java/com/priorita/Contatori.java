package com.priorita;

/**
 *
 * @author User
 */
public class Contatori implements Runnable {

    private int contatore = 0;

    @Override
    public void run() {
        while (NewMain.RUN == 0) {

        }

        while (NewMain.RUN == 1) {
            contatore++;
            System.out.println(Thread.currentThread().getName() + " " + contatore);
        }
    }

}
