import java.util.Arrays;
import java.util.Scanner;

public class VariableArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] simpsons = { "Homer", "Marge", "Bart", "Lisa", "Maggie" };
        System.out.println(
                "Hello! Enter the name of a character in the Simpsons (you may only choose from the core family members): ");
        String simpson = scanner.nextLine();
        Arrays.sort(simpsons);
        int position = Arrays.binarySearch(simpsons, simpson);
        if (position >= 0) {
            System.out.println("Yes, it's a Simpson!");
        } else {
            System.out.println("Hey! That's not a Simpson!");
        }
    }
}