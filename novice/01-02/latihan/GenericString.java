import java.util.*;

class GenericString {
    public static void main(String[] args) {
        // creating ArrayList
        ArrayList<String> al = new ArrayList<String>();

        al.add("Sachin");
        al.add("Rahul");

        // typecasting is not needed
        String s1 = al.get(0);
        String s2 = al.get(1);

        System.out.println(s1);
        System.out.println(s2);

    }
}