package methods;

import java.util.Scanner;

public class CheckStrings {
    public static void main(String[] args) {
        user("hi","hello");
    }

    public static void user(String firstOne,String secondOne){

        if (secondOne.contains(secondOne)){
            firstOne.replace(secondOne,"");
            System.out.println(firstOne);
        }else {
            System.out.println("Try again");
            Scanner input =new Scanner(System.in);

            String again=input.nextLine();
            if (firstOne.contains(secondOne)){

            }else {
                System.out.println("Out of tries");
            }
        }
    }
}
