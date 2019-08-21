public class TryCatchExample8 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}