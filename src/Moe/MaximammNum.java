package Moe;

import java.util.Scanner;

public class MaximammNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers please: ");

        System.out.print("Number #1: ");
        int num1 = input.nextInt();

        System.out.print("Number #2: ");
        int num2 = input.nextInt();

        System.out.print("Number #3: ");
        int num3 = input.nextInt();

        if (num1==num2 && num1==num2){
            System.out.println("All 3 integers are equal");
        }
        else if (num1>num2 && num1>num3){
            System.out.println("Number #1 is Greater "+num1);
        }
        else if (num2>num1 && num2>num3){
            System.out.println("Number #2 is Greater "+num2);
        }
        else {
            System.out.println("Number #3 is Greater "+num3);
        }





    }
}
