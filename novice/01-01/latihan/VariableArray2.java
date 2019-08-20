import java.util.Arrays;
import java.util.Scanner;

public class VariableArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, I'll calculate your grade average");
        System.out.println("how many grades would you like to enter");
        int count = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter grade number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        // computing the average
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        double average = sum / (double) numbers.length;
        System.out.println("Your grade average is : " + average);
    }
}