package switchStatemnt;

import java.util.Random;
import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        System.out.println("Enter your number:");

        Random input = new Random();
        int number = input.nextInt(26);
        number +=65;
        char c = (char)(number);
        System.out.println("My number is " + number);

        System.out.println("Your letter is " + c);








    }
}
