import java.util.Scanner;

public class ArraySatuDimensi {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        for (int i = 0; i < 10; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}