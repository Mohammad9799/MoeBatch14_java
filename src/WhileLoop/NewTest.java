package WhileLoop;

import java.util.Scanner;

public class NewTest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your number: ");
        int user = input.nextInt();

        for (int i=0; i<user; i++ ){

            System.out.println();
            for (int j = 0; j<user; j++ ){
                System.out.print("#");
            }
        }










    }
}
