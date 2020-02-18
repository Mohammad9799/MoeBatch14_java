package Moe;

import java.util.Scanner;

public class LengthOfTheWord {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your sentence: ");

        String word =scanner.nextLine();



        boolean result = word.length()>=5;

        if (result){
            System.out.println("!!WoW!!");
        }else {
            System.out.println("!!yey!!");
        }





    }
}
