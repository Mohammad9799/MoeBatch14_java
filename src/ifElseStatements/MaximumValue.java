package ifElseStatements;

import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers: ");

        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();
        if(number1> number2 && number1>number3){
            System.out.println("max num : " + number1);
        }
        else if(number2>number1 && number2>number3){
            System.out.println("max num : " + number2);

        }
        else if (number3>number1 && number3>number2){
            System.out.println("max num : " + number3);
        }
        else if (number1 == number2 && number1== number3){
            System.out.println("All numbers are equal ");
        }

    }
}
