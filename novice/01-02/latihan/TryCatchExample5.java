public class TryCatchExample5 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Can't divided by zero");
        }
    }
}