package Strings;

import java.lang.management.OperatingSystemMXBean;
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first word: ");
        String word1 =input.nextLine();
        System.out.println("enter the scon word: ");
        String word2 = input.nextLine();

       int com=word1.compareTo(word2);

        System.out.println(com);









    }
}
