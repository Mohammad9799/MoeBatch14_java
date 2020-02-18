package loops;

import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your latter:");

        char user= input.nextLine().toUpperCase().charAt(0);

        if (user >= 65 && user <= 90) {
            while (user!=91){
                System.out.println(user++);
            }

        }else {
            System.out.println("not a valid letter");
        }

















    }
}
