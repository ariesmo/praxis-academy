public class ConditionalDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if ((x > 8) && (y > 8)) {
            System.out.println("Both x and y greater than 8");
        }

        if ((x > 10) || (y > 10)) {
            System.out.println("Either x or y greater than 10");
        }
    }
}