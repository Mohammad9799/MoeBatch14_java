package WhileLoop;

import java.util.Scanner;

public class HardTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");

        String number= input.nextLine();


        for (int i =0; i>=10 || i<=12;){

            if (number.contains(i+"")){
                System.out.println("valid number");
                System.out.println(number);
                break;

            }else {
                System.out.println("invalid number!!!!");
                break;
            }
        }




    }
}
