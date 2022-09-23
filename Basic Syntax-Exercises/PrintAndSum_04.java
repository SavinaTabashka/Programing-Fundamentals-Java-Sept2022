package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program to display numbers from given start to given end and their sum.
        // All the numbers will be integers. On the first line, you will receive the start number, on the second the end number.

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
