package Homework;

import java.util.Scanner;

    public class MultiplicationDoWhile {

        private static Scanner sc;

        public static void main(String[] args){

//for code to read from scanner
            sc = new Scanner(System.in);

            System.out.println("Enter any number ");

            int n = sc.nextInt();
            int j = 1;
            do { int ans = n*j;
                System.out.println((n+ " * " +j+ " = " +ans));
                //add num
                ++j;
            }
            while (j<=10);

        }

    }


