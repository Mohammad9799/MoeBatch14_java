package Moe;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two double numbers");

        System.out.print("First Num: ");
        double num1 = input.nextDouble();

        System.out.print("Second Num: ");
        double num2 = input.nextDouble();

        input.nextLine();
        System.out.println("Enter your operator: ");
        System.out.println("+ ,- ,* ,/ ,% ");
        String operator = input.nextLine();

        if (operator.equals("+")){
            System.out.println(num1+" + "+num2+" = "+ (num1+num2));
        }
        else if (operator.equals("-")){
            System.out.println(num1+" - "+num2+" = "+ (num1-num2));
        }
        else if(operator.equals("*")){
            System.out.println(num1+" * "+num2+" = "+ (num1*num2));
        }
        else if (operator.equals("/")){
            System.out.println(num1+" / "+num2+" = "+ (num1/num2));
        }
        else if (operator.equals("%")){
            System.out.println(num1+" % "+num2+" = "+ (num1%num2));
        }
        else {
            System.out.println("!!!Wrong input!!!");
        }




    }
}
