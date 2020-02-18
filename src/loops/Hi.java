package loops;

import java.util.Scanner;

public class Hi {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        for( ; ; ){
           String userInput= input.nextLine();
           if (userInput.equalsIgnoreCase("hi")){
               System.out.println("Hello");
           }else {
               System.out.println("Good bye");
               break;
           }

        }





    }
}
