package Strings;

import java.util.Scanner;

public class Cyber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word2 = input.nextLine();
        String word = "Cybertek is located in Des Plaines";

        int index = word.indexOf(word2);
        System.out.println(index);
    }
}
