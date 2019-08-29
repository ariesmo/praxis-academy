package Lat2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Counter implements Runnable {
    private final MainApp mainApp;
    private final int loopLimit;
    private final String task;

    // constructor
    public Counter(MainApp mainApp, int loopLimit, String task) {
        this.mainApp = mainApp;
        this.loopLimit = loopLimit;
        this.task = task;
    }

    // prints the thread name, task number, and
    // value of counter

    @Override
    public void run() {
        for (int i = 0; i < loopLimit; i++) {
            System.err.println(
                    "Thread : " + Thread.currentThread().getName() + " Counter : " + (i + 1) + " Task : " + task);
            mainApp.pause(Math.random());
        }
    }
}

class MainApp {

    // start thread
    public void startThread() {
        ExecutorService taskList = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            // makes tasks available for execution
            taskList.execute(new Counter(this, i + 1, "task " + (i + 1)));
        }
        // shuts the thread
        taskList.shutdown();
    }

    // pauses execution
    public void pause(double seconds) {
        try {
            Thread.sleep(Math.round(1000.0 * seconds));
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    // driver method
    public static void main(String[] args) {
        new MainApp().startThread();
    }
}