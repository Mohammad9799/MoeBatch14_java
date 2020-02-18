package Strings;

import java.util.Scanner;

public class CodingBat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = input.nextLine();


        int length1=name.length();
        char firstLatter = name.charAt(length1-1);
        char secondLatter= name.charAt(length1-2);
        char first = name.charAt(0);


        System.out.println(first);
        System.out.println(firstLatter);
        System.out.println(secondLatter);









    }
}
