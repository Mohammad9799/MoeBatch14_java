package Strings;

import java.util.Scanner;

public class NewEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String name1= input.nextLine();
        System.out.println("Enter second name ");
        String name2 = input.nextLine();

        String email = "";





        if(name1.length()>=6  && name2.length()>=6 ){

            email= name1.substring(0,4);
            email+= name2.substring(name2.length()-3);
            email +="@cybertek.com";
            System.out.println(email);





        }else{
            System.out.println("Invalid data");
        }





    }
}
