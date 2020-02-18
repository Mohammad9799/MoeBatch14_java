package WhileLoop;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your address:");
        String address = input.nextLine();

        int count=0;


        while (address.contains("IL")){
            count++;

            System.out.println("enter your address");
            address=input.nextLine();

            System.out.println(count);









        }






    }
}
