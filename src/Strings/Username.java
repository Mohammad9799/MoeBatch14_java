package Strings;

import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "Mohammad97";
        String password = "123456789";
        System.out.println("Username:");
        String User = input.nextLine();
        String pass ="";


        if (username.equals(User)) {
            System.out.println("Password: ");
             pass = input.nextLine();

            if (password.equals(pass)){
                System.out.println("Welcome!");
            }else {
                System.out.println("Invalid Password!!!");
            }


        }
        else {
            System.out.println("Invalid Username!!!");
        }






    }
}
