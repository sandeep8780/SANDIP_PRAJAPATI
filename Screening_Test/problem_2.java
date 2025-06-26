package Screening_Test;

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        // Generate and print odd numbers
        System.out.print("Output: ");
        for (int i = 0; i < a; i++) {
            int odd = 2 * i + 1;
            System.out.print(odd);
            if (i < a - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
