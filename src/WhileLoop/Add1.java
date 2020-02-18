package WhileLoop;

import java.util.Scanner;

public class Add1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        System.out.println("Enter your latter");
        String word = input.nextLine();
        int number = 0;


        while (word.equals("yes") || word.equals("y")){
            number++;
            System.out.println("Would you like to add 1");
           word=input.nextLine();

        }
        System.out.println("Your number is : " + number);





    }
}
