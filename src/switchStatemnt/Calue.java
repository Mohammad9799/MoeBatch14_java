package switchStatemnt;

import java.util.Scanner;

public class Calue {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your number one : ");

        double num =input.nextDouble();
        System.out.println("Enter your number two : ");
        double num2 =input.nextDouble();
        input.nextLine();
        System.out.println("Choose your operator: ");
        String op =input.nextLine();
        double result=0;
        boolean valid=true;

        switch (op){
            case"+":
                result=num+num2;
                        break;
            case "-":
                result=num-num2;
                break;
            case"*":
                result=num*num2;
                break;
            case "/":
                result=num/num2;
                break;

            default:
                System.out.println("Invalid Operators");
                valid=false;
        }
        if (valid){
            System.out.println( + num + op + num2 + "= " + result);
        }


    }
}
