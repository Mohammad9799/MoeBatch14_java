package Strings;

import java.util.Scanner;

public class Month1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the here please: ");
        String enter = input.nextLine();
        String month= "October";

        if (enter.equalsIgnoreCase(month)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }







    }
}
