package Strings;

import java.util.Scanner;

public class LengthTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a massage: ");
        String massage =input.nextLine();
        if (massage.isEmpty()){
            System.out.println("Massage is Empty");

        }
       else if (massage.length() >=10){
            System.out.println("Massage is good");
        }
        else {
            System.out.println("Massage is too short");
        }
    }
}
