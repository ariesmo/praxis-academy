import java.util.ArrayList;
import java.util.Iterator;

class TestGenerics1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rahul");
        list.add("jai");

        String s = list.get(0); // type casting is not required
        System.out.println("element is : " + s);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}