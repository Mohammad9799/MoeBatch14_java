package ifElseStatements;

import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {
        int passCode= 3241;
//        Write a program taht asks to enter 4 digit integer via scanner
//        compare the passCode
//        if valid passCode print "Welcome to iphone"
//        if invalid print "Try again!"
//        Check for Special case:
//        1. Check for negative numbers. if entered passCode is negative
//        print "No Negative number"
//        2. passCode must be only 4 digits.
//        if more than 4 digit then print "you entered more digit
//        if less than 4 digit then print "you entered less digits"
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your passCode: ");
        int pass=input.nextInt();
        if (passCode==pass)
        {
            System.out.println("Welcome to iphone");

        }
        else if (pass<0){
            System.out.println("No negative numbers");

        }
        else if (pass<0000){
            System.out.println("You enter less digits");

        }
        else if(pass>9999){
            System.out.println("You entered more digits");

        }


        else{
            System.out.println("Wrong Try Again!!!!");


        }



    }


}
