package Scanner;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
                System.out.println("Enter your change: ");
        int money=input.nextInt();
        int quarter = 25;
        int dime = 10;
        int nickels = 5;
        int penny = 1;

        System.out.println("Quarters: " + (money/quarter));
        int a = money%25;
        System.out.println("Dimes: " + (a/dime));
        int b = money%10;
        System.out.println("Nickels: " + (b/nickels));
        int c = money%5;
        System.out.println("Penny: " + (c/penny));





    }
}
