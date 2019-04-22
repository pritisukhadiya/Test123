package Homework;

import java.util.Scanner;

public class ReverseString1 {
    /*3.	Write a program called Reverse String, which prompts user for a String, and prints the reverse of the String.
        The output shall look like:
        Enter a String: abcdef 
        The reverse of the String "abcdef" is "fedcba".*/
// input = "ABCDE"
//OUTPUT = "EDCBA"

    public static void main(String[] args){
        String str;
        //print line
        System.out.println("Enter youe name: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();
        //to reverse string
        String reversed = reverseString(str);
        System.out.println(("The reversed string is: + reversed"));
    }

    public static String reverseString(String str)
    {
       if(str.isEmpty())
           return str;
       //calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
