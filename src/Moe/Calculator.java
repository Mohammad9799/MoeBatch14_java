package Moe;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
/*Ask from user two integers. Calculate the sum (+),
 subtraction(minus), devision (/) and multiplying (*) them.
 (hint: you need to create two integers and scanner.
   Print out the result of your calculations.
 */
        Scanner input =new Scanner(System.in);

        System.out.println("Enter your Numbers: ");

        int number1= input.nextInt();
        int number2= input.nextInt();


        System.out.println(number1+ " + "+number2 + " = "+(number1+number2) );

        System.out.println(number1+ " - "+number2 + " = "+(number1-number2));

        System.out.println(number1+ " / "+number2 + " = "+(number1/number2));

        System.out.println(number1+ " * "+number2 + " = "+(number1*number2));

        System.out.println(number1+ " % "+number2 + " = "+(number1%number2));





    }
}
