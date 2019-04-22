package Homework;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        int maxNumber = 0;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println("Enter the Number : ");
        Scanner scanner = new Scanner(System.in);
        maxNumber = scanner.nextInt();
        System.out.println("Fibonacci Series of" + maxNumber + " numbers:");

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            //on each itration,we are assigning second number to the first
            // number and assigning the sum of last two number
            // to the second number

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }

    }
}