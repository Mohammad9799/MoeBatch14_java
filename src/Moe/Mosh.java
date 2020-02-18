package Moe;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Mosh {
    public static void main(String[] args) {


//        System.out.print("name:");
//        String name= input.nextLine();
//        System.out.print("Your name is " + name);

        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");

        int num=input.nextInt();

        if (num%5==0 && num%3==0){
            System.out.println("FizzBuzz");
        }
        else if (num%5==0){
            System.out.println("Buzz");
        }
        else if (num%3==0){
            System.out.println("Fizz");
        }
        else {
            System.out.println(num);
        }

    }
}
