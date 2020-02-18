package Moe;

import java.util.Scanner;

public class CheckTheWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("!!Enter two words please!!");
        System.out.println();

        System.out.print("First Word:");
        String firstWord =scanner.nextLine();
        System.out.print("Second Word:");
        String secondWord =scanner.nextLine();

        if (firstWord.contains(secondWord) || secondWord.contains(firstWord)){
            System.out.println("!!WoW!!");
        }else {
            System.out.println("!!yey!!");
        }
        System.out.println();
        System.out.println("You'r sentence is ");

    }
}
