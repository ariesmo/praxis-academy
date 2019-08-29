package Lat3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // store the thread
        List<Thread> threads = new ArrayList<Thread>();

        // create 500 threads
        for (int i = 0; i < 500; i++) {
            Runnable task = new MyRunnable(10000000L + i);
            Thread worker = new Thread(task);

            // set the name of the thread
            worker.setName(String.valueOf(i));

            // start the thread
            worker.start();

            // remember the thread
            threads.add(worker);
        }
        int running = 0;
        do {
            running = 0;
            for (Thread thread : threads) {
                if (thread.isAlive()) {
                    running++;
                }
            }
            System.out.println("We have " + running + " running threads. ");
        } while (running > 0);
    }
}