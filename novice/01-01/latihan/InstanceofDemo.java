public class InstanceofDemo {
    public static void main(String[] args) {
        String name = "Java";

        if (name instanceof String) {
            System.out.println("an instance of String class");
        }

        if (name instanceof Object) {
            System.out.println("an instance of Object class");
        }

        if (name instanceof CharSequence) {
            System.out.println("an instance of Charsquance interface");
        }
    }
}