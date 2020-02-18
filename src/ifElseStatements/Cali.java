package ifElseStatements;

import java.util.Scanner;

public class Cali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        input.nextLine();
        System.out.println("Choose operator from *, -, +, /");
        String operator=input.nextLine();
        if (operator.equals("*")){
            System.out.println("Result of " +num1 + operator + num2 + "is: " + (num1*num2));

        }
        else if (operator.equals("-")) {
            System.out.println("Result of " + num1 + operator + num2 + "is: " + (num1 - num2));
        }

        else if (operator.equals("+")) {
            System.out.println("Result of " + num1 + operator + num2 + "is: " + (num1 + num2));
        }
        else if (operator.equals("/")) {
            System.out.println("Result of " + num1 + operator + num2 + "is: " + (num1 / num2));
        }
    }
}
