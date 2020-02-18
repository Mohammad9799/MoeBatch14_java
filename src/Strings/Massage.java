package Strings;

import java.util.Random;
import java.util.Scanner;

public class Massage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your massage: ");
        String massage = input.nextLine();
        if (massage.length() >=15){
            System.out.println("Sent");
            Random random =new Random();
            int number = random.nextInt(2);
            System.out.println(number);
            if (number>=1){
                System.out.println("Delivered");
            }
            else {
                System.out.println("Not Delivered!!!");
            }
        }
        else {
            System.out.println("not sent");
        }







    }
}
