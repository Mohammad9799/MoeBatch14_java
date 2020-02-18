package Moe;

import java.util.Arrays;
import java.util.Scanner;

public class WedTask {
    public static void main(String[] args) {
        login();

    }

    public static void login( ){

        String user = "johnJava";
        String pass = "1234567";

        System.out.println("You have clicked to login button: ");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter account name: ");
        String name = input.nextLine();

        System.out.println("Please enter account password: ");
        String password = input.nextLine();

        if (name.equals(user) && password.equals(pass)){
            System.out.println("Successful Login!!");
        }







    }

}
