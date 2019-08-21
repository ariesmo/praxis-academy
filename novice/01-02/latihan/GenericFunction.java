class GenericFunction {
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        genericDisplay(11); // calling generic method with Integer argument

        genericDisplay("GeeksForGeeks"); // calling generic method with String argument

        genericDisplay(1.0); // calling generic method with double argument
    }
}