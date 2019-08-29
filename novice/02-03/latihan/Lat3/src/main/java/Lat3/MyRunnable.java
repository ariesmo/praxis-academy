package Lat3;

public class MyRunnable implements Runnable {
    private final long countUntil;

    // constructor
    MyRunnable(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 1; i < countUntil; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}

// public class Main {
// public static void main(String[] args) {
// MyRunnable runn = new MyRunnable(3);
// runn.run();
// }
// }
