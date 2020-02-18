package Moe;

import java.util.Scanner;

public class TheSumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("!!Enter your two numbers!!");
        System.out.print("First Number: ");
        int num =scanner.nextInt();
        System.out.print("Second Number: ");
        int num2 =scanner.nextInt();

        boolean sum= num + num2 >50;
        System.out.println();


        if (sum){
            System.out.println("Your sum is more than 50");
        }else {
            System.out.println("Your sum is less than 50");
        }
        System.out.println();
        System.out.println("Your sum of the two numbers is: "+ (num+num2));




    }
}
