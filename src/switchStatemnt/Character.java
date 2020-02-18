package switchStatemnt;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letter grade: ");
        char letters =input.nextLine().charAt(0);

        switch (letters){
            case 'a':
            case 'A':
                System.out.println("Excellent");
                 break;
            case 'b':
            case 'B':
                System.out.println("Great");
                break;
            case 'c':
            case 'C':
                System.out.println("Okay");
                break;
            case 'd':
            case 'D':
                System.out.println("You can do better ");
                break;
            case 'f':
            case 'F':
                System.out.println("Something needs to change ");
            default:
                System.out.println("Not valid ");


        }
    }
}
