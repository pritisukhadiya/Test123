package Homework;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String [] args){

        //store user value in n
            int c=0,a,temp,b = 1;
            int n;

            //For code to read from screen and user input
            Scanner scanner = new Scanner(System.in);

        //please enter any no (user no)
            System.out.print(" Please Enter Any =");

        //print and read
            n=scanner.nextInt();
            System.out.println("you entered " + n);

            int len = String.valueOf(n).length();
            //System.out.println("length of the Number"+len);

            temp = n;

            while(n>0)
            {
                a=n%10;  //To get the last number eg12345 5 is the last number.
                n=n/10; //n is the new number eg 1234
                //System.out.println("Value of n=n/10;  "+ n);
                //System.out.println("49 Value of c  "+c);

                b = (int) Math.pow(a, len);
                c=c+(b);

                //System.out.println("Value of c =c+(b) "+c);
            }
            if(temp==c)
                System.out.println(temp + " Is an armstrong number");
            else
                System.out.println(temp + " Is Not an armstrong number");
        }

    }


