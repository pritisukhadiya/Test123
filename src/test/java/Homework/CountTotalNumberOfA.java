package Homework;

import java.util.Scanner;

public class CountTotalNumberOfA {

    private static Scanner sc;

    public static void main (String[] args){
        String str;

        //char a;

        sc = new Scanner (System.in);
        System.out.println("Enter any String here");
        str =sc.nextLine();
        //System.out.println(str);
        int len = str.length();

        //System.out.println(len);

        int count = 0;

        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == 'a')
            count++;
        }

        System.out.println("there are " + count + " a's in the statement");





    }



}


