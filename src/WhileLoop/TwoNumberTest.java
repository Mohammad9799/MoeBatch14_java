package WhileLoop;

import java.util.Scanner;

public class TwoNumberTest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=0;

        for (int i =num1; i<=num2; i++){
            sum+= i;
        }
        System.out.println("This sum of "+ num1 + " " +num2 + " is " +sum );









    }
}
