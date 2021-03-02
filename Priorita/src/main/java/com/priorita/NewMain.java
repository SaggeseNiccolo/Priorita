package com.priorita;

/**
 *
 * @author User
 */
public class NewMain {

    public static int RUN = 0;
    
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        
        Contatori c0 = new Contatori();
        Contatori c1 = new Contatori();
        Contatori c2 = new Contatori();

        Thread t0 = new Thread(c0);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t0.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t0.start();
        t1.start();
        t2.start();
        
        RUN = 1;

        Thread.sleep(5000);
        
        RUN = 2;

        //t1.stop();
        //t2.stop();
        //t3.stop();
    }

}
