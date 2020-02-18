package switchStatemnt;

import java.util.Random;
import java.util.Scanner;

public class RandomOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random input = new Random();
        System.out.println("Enter your number please: ");
        int num = scanner.nextInt();
        int num2 =input.nextInt(10);

        if (num==num2){
            System.out.println("Congrats");
        }
        else if (num>num2){
            System.out.println("Guess is too high!!");

        }
        else if (num<=num2){
            System.out.println("Guess is too low!!");
        }





    }
}
