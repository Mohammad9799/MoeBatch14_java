package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Garage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of cars:");
        int userInput=input.nextInt();
        input.nextLine();

        String [] cars =new String[userInput];


        for ( int i=0; i<cars.length; i++){

            System.out.println("Enter car" + (i+1));
            String car =input.nextLine();


            cars[i]=car;



        }
        System.out.println(Arrays.toString(cars));
    }
}
