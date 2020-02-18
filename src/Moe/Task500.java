package Moe;

import java.util.Scanner;

public class Task500 {
    public static void main(String[] args) {

//        Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24 .....
//
//        Example:
//        Input:
//        6
//        Output:
//        0 1 1 2 3 5
//
        Scanner input =new Scanner(System.in);




//        System.out.print(a +" "+b);
        System.out.println("Enter your number please:");

        int a = 0;
        int b = 1;
        int i;
        int c;
        int user = input.nextInt();

        System.out.print(a + " " + b);

            for (i = 2; i<user; i++){

            c = a+b;
            System.out.print(" "+ c);
            a=b;
            b=c;





        }








    }
}