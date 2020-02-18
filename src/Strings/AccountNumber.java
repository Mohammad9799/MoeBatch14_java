package Strings;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        String numbers = input.nextLine();
        String firstNumber= numbers.substring(0);
        boolean invalid = !firstNumber.equals("5") || !firstNumber.equals("2");
        if (invalid){
            System.out.println("Invalid account number ");
            if (firstNumber.equals("5") && numbers.length()==10){
                System.out.println("Valid 5 account");
            }else {
                System.out.println("Invalid 5 account");
            }
            if (firstNumber.equals("2") && numbers.length()==7){
                System.out.println("Valid 2 account");

            }else {
                System.out.println("Invalid 2 account");
            }







}
    }
    }