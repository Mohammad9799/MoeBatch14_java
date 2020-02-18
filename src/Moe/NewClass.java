package Moe;

import java.util.Random;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        System.out.print("Enter your temp: ");
        Random random =new Random();
        int temp=random.nextInt(100) ;


        if (temp>=30){
            System.out.println("its hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temp>20)
            System.out.println("its a nice day");
        else
            System.out.println("its cold");

    }
}
