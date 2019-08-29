package Lat1;

public class SleepMessages1 extends Thread {
    public static void main(String[] args) {
        String importantInfo[] = { "Mares eat oats", "Does eat oats", "Little lambs eat ivy",
                "A kid will eat ivy too" };

        for (int i = 0; i < importantInfo.length; i++) {
            // Pause for 4 seconds
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                return;
            }
            System.out.println(importantInfo[i]);
        }
    }
}