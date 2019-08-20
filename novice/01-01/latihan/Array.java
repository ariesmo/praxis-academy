import java.util.*;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] cinema = new int[4][4];
        System.out.println("Masukkan angka : ");
        for (int i = 1; i < cinema.length; i++) {
            for (int j = 0; j < 4; j++) {
                cinema[i][3] = input.nextInt();
            }
        }
    }
}