package switchStatemnt;

import java.util.Scanner;

public class AgeB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = input.nextInt();
        if (age>100 || age<0){
            System.out.println("Not a valid age!!!!!?");
        }
        else if (age>=30){
            System.out.println("Welcome to the building");
        }
        else if (age<30){
            System.out.println("Sorry try again when you'r 30");
        }

        }
    }
