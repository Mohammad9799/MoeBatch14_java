package Projeckts;

import java.util.Scanner;

public class Palndrom {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the word:");
        String word = input.nextLine();

        String reverse = "";
        char letter = word.charAt(0);
        int a = word.length() -1;

        for(int i = 0; i < word.length(); i ++){
            letter = word.charAt(a);
            reverse += "" + letter;
            a--;


        }
        if(word.equals(reverse)){
            System.out.println("Palindrome");

        }else {
            System.out.println("Not palindrome");
        }

    }
}
