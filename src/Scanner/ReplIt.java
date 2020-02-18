package Scanner;

import java.util.Scanner;

public class ReplIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price=0;
        int quarter=0;
        int dime = 0;
        int nickle=0;

        System.out.println("Enter price in cents:");
        price = input.nextInt();
if(price>=25) {
    int change = 100 - price;
    int a = change % 25;
    int b = a % 10;

    quarter += change / 25;
    dime += a / 10;
    nickle += b / 5;


    System.out.println("Your change is " + quarter + " quarters, " + dime + " dimes, and " + nickle + " nickels.");
}else {
    System.out.println("Wrong Number!!");
}







    }
}
