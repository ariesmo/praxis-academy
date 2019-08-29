package Thread;

// menjalankan thread menggunakan interface runnable
public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Executing Thread : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable(), "MyRunnable");
        myThread.start();
    }
}