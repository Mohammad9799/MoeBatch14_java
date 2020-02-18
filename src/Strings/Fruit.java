package Strings;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter word:");
        String str2 = input.nextLine();
//        String str3= str2.toLowerCase();

        if (str2.length() < 3 || str2.length() > 100) {
            System.out.println("Invalid enter");
        }


    }


}