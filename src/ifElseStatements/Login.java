package ifElseStatements;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String Email="Mohammad97";
        String lock = "1234567";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username=input.nextLine();
        System.out.println("Enter your password:  ");
        String password=input.nextLine();

        if(username.equals("Email")) {
            System.out.println("login sucssfull");

            if (password.equals("lock")) {
                System.out.println("");

            } else {
                System.out.println("wrong password!!!");
            }
        }
        else{
            System.out.println("Invaild username");

        }



    }
}
