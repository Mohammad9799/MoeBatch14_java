package ifElseStatements;

import java.util.Scanner;

public class Campus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time: ");
        int time=input.nextInt();

        if (time<=23 && time>=8){
            System.out.println("Open");
        }
        else if (time<0){
            System.out.println("Invalid time");
        }
        else if (time<=24){
            System.out.println("Invalid time");
        }
        else {
            System.out.println("Closed");
        }

    }
}