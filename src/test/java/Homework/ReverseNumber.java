package Homework;

import java.util.Scanner;

public class ReverseNumber {
    //wap to input the number and then it will reverse
    //the same number using while loop

    public static void main (String [] args){

        int num=0;
        int reversenum=0;
        System.out.println("Input your number and press enter:");

        //This statement will capture the user input
        Scanner scanner = new Scanner(System .in);

        //Captured input would be stored in number num
        num = scanner.nextInt();

        //while loo: logic to find out the reverse number
        while(num != 0)
        {
            reversenum = reversenum*10;
            reversenum = reversenum + num%10;
            num = num/10;
        }
        System.out.println("Reverse of input is :"+reversenum);
    }
}
