package Strings;

import java.util.Scanner;

public class NameTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= input.nextLine();



       if (name.startsWith("a")){
           System.out.println("Cool name");



       }
       else if (name.startsWith("z")){
           System.out.println("Cool name");
       }

       else {
           System.out.println("Not cool name");
       }




    }
}
