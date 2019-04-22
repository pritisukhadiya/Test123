package Homework;

import java.util.Scanner;

public class SumOfFiveDigit {
    //4.WAP to input any five digit number and then find sum of each digit
    public static void main(String[] args) {

        Long n;
        long sum;
        //For code to read from screen

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        //read the entered long value using scanner class object sc.nextlong().
        n = sc.nextLong();

        //here we are using for loop to calculate the sum

        for (sum = 0; n!= 0; n/=10) {
            sum+=n%10;

            System.out.println("Sum of digits of a number is " + sum);
        }

    }

    public static class MultiplicationForLoop {

           public static void main(String [] args){
                Scanner sc = new Scanner(System.in);

            System.out.println("Enter any number ");

            int n = sc.nextInt();
            for (int j = 1; j<=10;j++)
             { int ans = n*j;
                System.out.println((n+ " * " +j+ " = " +ans));
                //add num


            }

        }
    }
}