package Homework;

import java.util.Scanner;

public class PrimeNumber {

    //2.WAP to input any number and check if it Prime number or not.
//input  =  any number
//output =  this no is prime or not
// Prime numbers are the positive integers greater than 1 that is only divisible by 1 and self.
// For example : 2 3 5 7 11

    private static Scanner sc;

    public static void main(String[] args) {
        //Initialise variable
        int num, i = 2;
        boolean flag = false;
        //For code to read from screen
        sc = new Scanner(System.in);

        System.out.print(" Please Enter Any number =");
        num = sc.nextInt();
        System.out.println("you entered " + num);

        //   System.out.println("before while i= " + i);
        //   System.out.println("before while num= " + num);
        while (i < num)//do while i is increasing by each number but less than the entered number
        // System.out.println("inside while loop i= " + i);
        {
            //   System.out.println("before if i= " + i);
            //   System.out.println("before if num= " + num);
            //   System.out.println("before if num%i = " + num % i);
            // condition for nonprime number
            if (num % i == 0)//remainder  is 0
            {
                flag = true;
                break;
            }
            //   System.out.println("after if i= " + i);
            //if not equal to 0 than add 1 to i
            ++i;
            //   System.out.println("after if ++i= " + i);
        }
        //   System.out.println("after while i= " + i);

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }
}