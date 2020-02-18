package Strings;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name :");
        String firstName1=input.nextLine();

        System.out.println("Enter your name :");
        String lastName =input.nextLine();

       String last = firstName1.substring(firstName1.indexOf(" ")+1);
       String last2 = lastName.substring(lastName.indexOf(" ")+1);

       if(last.equals(last2)){
           System.out.println("relatives");
       }else {
           System.out.println("not relatives");
       }









    }
}
